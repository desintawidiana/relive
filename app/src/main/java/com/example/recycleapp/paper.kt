package com.example.recycleapp

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class paper : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_paper)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        <androidx.constraintlayout.widget.ConstraintLayout
        xmlns:android="http://schemas.android.com/apk/res/android"
        xmlns:app="http://schemas.android.com/apk/res-auto"
        xmlns:tools="http://schemas.android.com/tools"
        android:layout_width="match_parent"
        android:layout_height="match_parent"
        android:background="#F5FFF0"
        tools:context=".MainActivity">

        <!-- Header -->
        <TextView
        android:id="@+id/tvAccountTitle"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:text="Account"
        android:textColor="#66CC00"
        android:textSize="24sp"
        android:textStyle="bold"
        app:layout_constraintTop_toTopOf="parent"
        app:layout_constraintStart_toStartOf="parent"
        app:layout_constraintEnd_toEndOf="parent"
        android:layout_marginTop="16dp" />

        <!-- Profile Section -->
        <LinearLayout
        android:id="@+id/profileSection"
        android:layout_width="0dp"
        android:layout_height="wrap_content"
        android:orientation="vertical"
        android:background="#D4F8C6"
        android:padding="16dp"
        android:gravity="center"
        app:layout_constraintTop_toBottomOf="@id/tvAccountTitle"
        app:layout_constraintStart_toStartOf="parent"
        app:layout_constraintEnd_toEndOf="parent"
        android:layout_margin="16dp">

        <ImageView
        android:id="@+id/profileImage"
        android:layout_width="80dp"
        android:layout_height="80dp"
        android:src="@drawable/ic_profile"
        android:layout_marginBottom="8dp"
        android:contentDescription="Profile Image" />

        <TextView
        android:id="@+id/tvGreeting"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:text="Hello, JAKE"
        android:textColor="#333333"
        android:textSize="18sp"
        android:textStyle="bold" />

        <TextView
        android:id="@+id/tvProfileDescription"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:text="This is your profile."
        android:textColor="#666666"
        android:textSize="14sp" />
        </LinearLayout>

        <!-- Profile Button -->
        <Button
        android:id="@+id/btnProfile"
        android:layout_width="0dp"
        android:layout_height="wrap_content"
        android:text="Profile"
        android:backgroundTint="#66CC00"
        android:textColor="#FFFFFF"
        app:layout_constraintTop_toBottomOf="@id/profileSection"
        app:layout_constraintStart_toStartOf="parent"
        app:layout_constraintEnd_toEndOf="parent"
        android:layout_margin="16dp" />

        <!-- Recycle Section -->
        <LinearLayout
        android:id="@+id/recycleSection"
        android:layout_width="0dp"
        android:layout_height="wrap_content"
        android:orientation="vertical"
        android:background="#FFFFFF"
        android:elevation="4dp"
        android:padding="16dp"
        app:layout_constraintTop_toBottomOf="@id/btnProfile"
        app:layout_constraintStart_toStartOf="parent"
        app:layout_constraintEnd_toEndOf="parent"
        android:layout_margin="16dp">

        <ImageView
        android:id="@+id/recycleIcon"
        android:layout_width="80dp"
        android:layout_height="80dp"
        android:src="@drawable/ic_recycle"
        android:layout_gravity="center"
        android:layout_marginBottom="8dp"
        android:contentDescription="Recycle Icon" />

        <TextView
        android:id="@+id/tvRecycleHistoryLabel"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:text="Recycle History"
        android:textSize="16sp"
        android:textColor="#333333"
        android:textStyle="bold" />

        <ProgressBar
        android:id="@+id/progressRecycle"
        style="?android:attr/progressBarStyleHorizontal"
        android:layout_width="match_parent"
        android:layout_height="8dp"
        android:progress="50"
        android:progressTint="#66CC00"
        android:layout_marginVertical="8dp" />

        <TextView
        android:id="@+id/tvRecyclePointsLabel"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:text="Recycle Points"
        android:textSize="16sp"
        android:textColor="#333333"
        android:textStyle="bold" />

        <TextView
        android:id="@+id/tvRecyclePointsValue"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:text="5,000,000 Rp"
        android:textSize="16sp"
        android:textColor="#666666"
        android:layout_marginTop="4dp" />
        </LinearLayout>

        <!-- Bottom Navigation -->
        <LinearLayout
        android:id="@+id/bottomNavigation"
        android:layout_width="0dp"
        android:layout_height="wrap_content"
        android:orientation="horizontal"
        android:gravity="center"
        android:background="#F5FFF0"
        android:padding="8dp"
        app:layout_constraintBottom_toBottomOf="parent"
        app:layout_constraintStart_toStartOf="parent"
        app:layout_constraintEnd_toEndOf="parent">

        <ImageView
        android:id="@+id/iconSettings"
        android:layout_width="48dp"
        android:layout_height="48dp"
        android:src="@drawable/ic_settings"
        android:contentDescription="Settings Icon"
        android:padding="8dp" />

        <ImageView
        android:id="@+id/iconGuide"
        android:layout_width="48dp"
        android:layout_height="48dp"
        android:src="@drawable/ic_guide"
        android:contentDescription="Guide Icon"
        android:padding="8dp" />

        <ImageView
        android:id="@+id/iconFaq"
        android:layout_width="48dp"
        android:layout_height="48dp"
        android:src="@drawable/ic_faq"
        android:contentDescription="FAQ Icon"
        android:padding="8dp" />
        </LinearLayout>
        </androidx.constraintlayout.widget.ConstraintLayout>

    }
}