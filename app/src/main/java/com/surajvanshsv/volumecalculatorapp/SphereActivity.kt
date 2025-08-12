package com.surajvanshsv.volumecalculatorapp

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class SphereActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_sphere)


        val textView = findViewById< TextView>(R.id.textView2)
        val result = findViewById<TextView>(R.id.textView3)
        val button = findViewById<Button>(R.id.btn1)
        val editText = findViewById<EditText>(R.id.editText_Sphere)
        button.setOnClickListener {
            val radius = editText.text.toString()
            var r = Integer.parseInt(radius)

            // volume of sphere : 4/3 pie r cube
            var volume = (4/3) * 3.14 * ( r*r*r)

            // set text to result
            result.text = "V = $volume m^3"


        }

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    }
}