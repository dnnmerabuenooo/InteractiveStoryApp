<?xml version="1.0" encoding="utf-8"?>
<LinearLayout xmlns:android="http://schemas.android.com/apk/res/android"
    xmlns:app="http://schemas.android.com/apk/res-auto"
    xmlns:tools="http://schemas.android.com/tools"
    android:layout_width="match_parent"
    android:layout_height="match_parent"
    android:background="@drawable/homepage"
    tools:context=".MainActivity"
    android:orientation="vertical">

    <TextView
        android:layout_width="match_parent"
        android:layout_height="wrap_content"
        android:text="To start the story, you must enter a name first."
        android:textSize="25dp"
        android:paddingRight="10dp"
        android:paddingLeft="10dp"
        android:layout_marginTop="400dp"
        android:textColor="@color/white"
        android:textAlignment="center"
        android:textStyle="bold"/>

    <EditText
        android:layout_width="200dp"
        android:layout_height="50dp"
        android:layout_gravity="center"
        android:gravity="center"
        android:layout_marginTop="15dp"
        android:background="@color/white"
        android:textColorHint="#104C9B"
        android:hint="Enter name"
        android:padding="5dp"
        android:id="@+id/home"/>

    <Button
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:text="START"
        android:textSize="15dp"
        android:textColor="#104C9B"
        android:layout_marginTop="15dp"
        android:layout_gravity="center"
        android:backgroundTint="#F9DA5E"
        android:onClick="goToPage1"/>

</LinearLayout>
