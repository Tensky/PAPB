package com.tensky.papb

import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {


    var counterx = 0
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        findViewById<Button>(R.id.button2).setOnClickListener{
            counterx++
            text.text = counterx.toString()
        }
        findViewById<Button>(R.id.button).setOnClickListener {
            Toast.makeText(this, "HELLO TOAST!", Toast.LENGTH_SHORT).show()
        }
    }
}
