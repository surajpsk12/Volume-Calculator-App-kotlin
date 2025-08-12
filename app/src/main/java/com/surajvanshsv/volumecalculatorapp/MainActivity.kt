package com.surajvanshsv.volumecalculatorapp

import android.content.Intent
import android.os.Bundle
import android.widget.GridView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.constraintlayout.helper.widget.Grid
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        // list , grid view leke aao ,
        // initialize the list view
        val gridView : GridView = findViewById<GridView>(R.id.gridView)

        // data source
        val shape1 : Shape = Shape(R.drawable.sphere,"Sphere")
        val shape2 : Shape = Shape(R.drawable.prism,"Prism")
        val shape3 : Shape = Shape(R.drawable.cube,"Cube")
        val shape4 : Shape = Shape(R.drawable.cylinder,"Cylinder")

        val gridList = listOf<Shape>(shape1,shape2,shape3,shape4)


        // adapter
        val adapters = MyCustomAdapter(this,gridList)
        gridView.adapter = adapters

        // handling the click events on items of grid view
        gridView.setOnItemClickListener{ _ ,_ , position,_ ->
            val clickedItem = adapters.getItem(position)

            if(clickedItem?.shapeName.equals("Sphere")){
                val i = Intent(this, SphereActivity::class.java)
                startActivity(i)
            }else if (clickedItem?.shapeName.equals("Cube")){
                val i = Intent(this,CubeActivity::class.java)
                startActivity(i)
            } else if (clickedItem?.shapeName.equals("Cylinder")){
                val i = Intent(this,CylinderActivity::class.java)
                startActivity(i)
            }else{
                val i = Intent(this,PrismActivity::class.java)
                startActivity(i)
            }
        }




        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    }
}