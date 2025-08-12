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

class PrismActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_prism)

        val textView = findViewById< TextView>(R.id.textView2)
        val result = findViewById<TextView>(R.id.textView3)
        val button = findViewById<Button>(R.id.btn1)
        val basearea = findViewById<EditText>(R.id.editText_prism)
        val editTextheight = findViewById<EditText>(R.id.editTextheight)

        button.setOnClickListener {
            val radius = basearea.text.toString()
            var r = Integer.parseInt(radius)
            val height = editTextheight.text.toString()
            var h = Integer.parseInt(height)

            // volume of prism : base area * height
            var volume = r * h

            // set text to result
            result.text = "V = $volume m^2"


        }
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    }
}