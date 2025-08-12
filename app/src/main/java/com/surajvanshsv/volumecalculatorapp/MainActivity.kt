package com.surajvanshsv.volumecalculatorapp

import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.widget.GridView
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        // Initialize the grid view
        val gridView: GridView = findViewById(R.id.gridView)

        // Data source
        val shape1 = Shape(R.drawable.sphere, "Sphere")
        val shape2 = Shape(R.drawable.prism, "Prism")
        val shape3 = Shape(R.drawable.cube, "Cube")
        val shape4 = Shape(R.drawable.cylinder, "Cylinder")

        val gridList = listOf(shape1, shape2, shape3, shape4)

        // Adapter
        val adapters = MyCustomAdapter(this, gridList)
        gridView.adapter = adapters

        // Enhanced click handling with debugging
        gridView.setOnItemClickListener { parent, view, position, id ->

            val clickedItem = adapters.getItem(position)
            val shapeName = clickedItem?.shapeName


            when (shapeName) {
                "Sphere" -> {
                    val intent = Intent(this, SphereActivity::class.java)
                    startActivity(intent)
                }
                "Cube" -> {
                    val intent = Intent(this, CubeActivity::class.java)
                    startActivity(intent)
                }
                "Cylinder" -> {
                    val intent = Intent(this, CylinderActivity::class.java)
                    startActivity(intent)
                }
                "Prism" -> {
                    val intent = Intent(this, PrismActivity::class.java)
                    startActivity(intent)
                }
                else -> {
                    Toast.makeText(this, "Unknown shape selected", Toast.LENGTH_SHORT).show()
                }
            }
        }

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    }
}