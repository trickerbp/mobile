package com.htung.assignmentsw02

import android.os.Bundle
import android.util.Log
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

private const val TAG = "LifeCycleLab"

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        Log.i(TAG, "onCreate")

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        findViewById<Button>(R.id.exitBtn)?.setOnClickListener {
            finish()
        }
    }

    override fun onStart()   { super.onStart();   Log.i(TAG, "onStart") }
    override fun onResume()  { super.onResume();  Log.i(TAG, "onResume") }
    override fun onPause()   { super.onPause();   Log.i(TAG, "onPause") }
    override fun onStop()    { super.onStop();    Log.i(TAG, "onStop") }
    override fun onRestart() { super.onRestart(); Log.i(TAG, "onRestart") }
    override fun onDestroy() { super.onDestroy(); Log.i(TAG, "onDestroy") }
}
