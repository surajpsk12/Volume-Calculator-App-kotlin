package com.surajvanshsv.volumecalculatorapp

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class CubeActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_cube_activity)

        val textViewheading = findViewById< TextView>(R.id.textViewheading)
        val result = findViewById<TextView>(R.id.textViewresult)
        val button = findViewById<Button>(R.id.btn1)
        val editTextside = findViewById<EditText>(R.id.editText_cube)
        button.setOnClickListener {
            val side = editTextside.text.toString()
            var s = Integer.parseInt(side)

            // volume of cube = side * side * side
            var volume = s*s*s

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