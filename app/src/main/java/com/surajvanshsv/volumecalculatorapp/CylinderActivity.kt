package com.surajvanshsv.volumecalculatorapp

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class CylinderActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_cylinder)

        val textViewheading = findViewById< TextView>(R.id.textViewheadingcylinder)
        val result = findViewById<TextView>(R.id.textViewresultcyclinder)
        val button = findViewById<Button>(R.id.btn1)
        val editTextradius = findViewById<EditText>(R.id.editText_cylinder_radius)
        val editTextheight = findViewById<EditText>(R.id.editText_cylinder_height)

        button.setOnClickListener {
            val radius = editTextradius.text.toString()
            var r = Integer.parseInt(radius)
            val height = editTextheight.text.toString()
            var h = Integer.parseInt(height)

            // volume of cylinder : pie * radius * radius * heiht
            var volume =3.14 * r * r * h

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