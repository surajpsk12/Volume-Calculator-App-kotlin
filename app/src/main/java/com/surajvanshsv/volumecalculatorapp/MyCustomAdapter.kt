package com.surajvanshsv.volumecalculatorapp

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.ImageView
import android.widget.TextView

class MyCustomAdapter(context : Context , private  val gridItems : List<Shape>)
    : ArrayAdapter<Shape>(context,0,gridItems)
{

    override fun getView(position: Int, convertView: View?, parent: ViewGroup): View {
        // it get us the view of current position
        var itemView = convertView
        val holder : ViewHolder

        if(convertView == null){
            itemView = LayoutInflater.from(context)
                .inflate(R.layout.grid_item_layout,parent , false)

            // create and set view holder -> view holder contains reference of my shape class
            holder = ViewHolder()
            holder.textView = itemView.findViewById<TextView>(R.id.textView)
            holder.imageView = itemView.findViewById<ImageView>(R.id.imageView)

            // assosiating the view holder object with the created view
            // avoiding to create the new "Viewholder" everytime
            itemView.tag = holder

        } else {
            // reuse the existing view holder
            holder = itemView?.tag as ViewHolder
        }


        // binding data to view
        val currentItems = gridItems[position]
        holder.imageView.setImageResource(currentItems.shapeImage)
        holder.textView.text = currentItems.shapeName


        return itemView!!
    }



        private class ViewHolder {
            // this is a design pattern used to cache view for smooth scrolling in listview , grid view or recycler view .
            // it serves as a container for the view of a single items in the grid view or other view which reduces call for findviewbyid() method

            lateinit var imageView: ImageView
            lateinit var textView: TextView

        }

}