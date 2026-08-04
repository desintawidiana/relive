package com.example.recycleapp

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class dropoff : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_dropoff)
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
        android:background="#F0FFF0"
        tools:context=".MainActivity">

        <!-- Header -->
        <TextView
        android:id="@+id/tvAccountHeader"
        android:layout_width="0dp"
        android:layout_height="wrap_content"
        android:text="Account"
        android:textSize="20sp"
        android:textStyle="bold"
        android:gravity="center"
        android:textColor="#66CC00"
        app:layout_constraintTop_toTopOf="parent"
        app:layout_constraintStart_toStartOf="parent"
        app:layout_constraintEnd_toEndOf="parent"
        app:layout_constraintBottom_toTopOf="@+id/profileContainer"
        android:layout_marginTop="20dp"/>

        <!-- Profile Section -->
        <LinearLayout
        android:id="@+id/profileContainer"
        android:layout_width="0dp"
        android:layout_height="wrap_content"
        android:orientation="vertical"
        android:padding="16dp"
        android:background="#E8FBD4"
        android:gravity="center"
        app:layout_constraintTop_toBottomOf="@id/tvAccountHeader"
        app:layout_constraintStart_toStartOf="parent"
        app:layout_constraintEnd_toEndOf="parent">

        <ImageView
        android:id="@+id/imgProfile"
        android:layout_width="80dp"
        android:layout_height="80dp"
        android:src="@drawable/ic_person"
        android:layout_gravity="center"
        android:layout_marginBottom="8dp" />

        <TextView
        android:id="@+id/tvHello"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:text="Hello, JAKE"
        android:textStyle="bold"
        android:textSize="16sp"
        android:textColor="#333" />

        <TextView
        android:id="@+id/tvProfileDesc"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:text="This is your profile."
        android:textSize="14sp"
        android:textColor="#666" />
        </LinearLayout>

        <!-- Profile Button -->
        <Button
        android:id="@+id/btnProfile"
        android:layout_width="0dp"
        android:layout_height="wrap_content"
        android:text="Profile"
        android:backgroundTint="#66CC00"
        android:textColor="#FFF"
        app:layout_constraintTop_toBottomOf="@id/profileContainer"
        app:layout_constraintStart_toStartOf="parent"
        app:layout_constraintEnd_toEndOf="parent"
        android:layout_marginTop="8dp" />

        <!-- Recycle History and Points -->
        <LinearLayout
        android:id="@+id/recycleContainer"
        android:layout_width="0dp"
        android:layout_height="wrap_content"
        android:orientation="vertical"
        android:padding="16dp"
        android:background="#FFFFFF"
        android:elevation="4dp"
        app:layout_constraintTop_toBottomOf="@id/btnProfile"
        app:layout_constraintStart_toStartOf="parent"
        app:layout_constraintEnd_toEndOf="parent"
        android:layout_margin="16dp">

        <ImageView
        android:id="@+id/imgRecycleLogo"
        android:layout_width="60dp"
        android:layout_height="60dp"
        android:src="@drawable/ic_recycle"
        android:layout_gravity="center"
        android:layout_marginBottom="8dp" />

        <TextView
        android:id="@+id/tvRecycleHistory"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:text="Recycle History"
        android:textStyle="bold"
        android:textSize="16sp"
        android:textColor="#333" />

        <ProgressBar
        android:id="@+id/progressRecycleHistory"
        style="?android:attr/progressBarStyleHorizontal"
        android:layout_width="match_parent"
        android:layout_height="8dp"
        android:progress="60"
        android:progressTint="#66CC00"
        android:layout_marginVertical="8dp" />

        <TextView
        android:id="@+id/tvRecyclePoints"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:text="Recycle Points"
        android:textStyle="bold"
        android:textSize="16sp"
        android:textColor="#333" />

        <TextView
        android:id="@+id/tvPointsValue"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:text="5,000,000 Rp"
        android:textSize="16sp"
        android:textColor="#666"
        android:layout_marginTop="4dp" />
        </LinearLayout>

        <!-- Bottom Navigation -->
        <LinearLayout
        android:id="@+id/bottomNav"
        android:layout_width="0dp"
        android:layout_height="wrap_content"
        android:orientation="horizontal"
        android:gravity="center"
        android:background="#F0FFF0"
        app:layout_constraintBottom_toBottomOf="parent"
        app:layout_constraintStart_toStartOf="parent"
        app:layout_constraintEnd_toEndOf="parent">

        <ImageView
        android:id="@+id/iconSettings"
        android:layout_width="48dp"
        android:layout_height="48dp"
        android:src="@drawable/ic_settings"
        android:contentDescription="Settings"
        android:padding="8dp" />

        <ImageView
        android:id="@+id/iconGuide"
        android:layout_width="48dp"
        android:layout_height="48dp"
        android:src="@drawable/ic_guide"
        android:contentDescription="Guide"
        android:padding="8dp" />

        <ImageView
        android:id="@+id/iconFAQ"
        android:layout_width="48dp"
        android:layout_height="48dp"
        android:src="@drawable/ic_faq"
        android:contentDescription="FAQ"
        android:padding="8dp" />
        </LinearLayout>

        </androidx.constraintlayout.widget.ConstraintLayout>

    }
}