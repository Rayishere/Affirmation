package com.example.affirmation.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.affirmation.R
import com.example.affirmation.model.Affirmation

class ItemAdapter(private val context:Context,
                private val dataset:List<Affirmation>
                ):RecyclerView.Adapter<ItemAdapter.ItemViewHolder>() {

    /**
     * NESTED CLASS
     * put information for adapter
     * convert string resource into a proper layout
     * The "ItemViewHolder" is only used in ItemAdapter
     */
    class ItemViewHolder(private val view:View):RecyclerView.ViewHolder(view){
        //for text
        val textView:TextView = view.findViewById(R.id.item_title)
        //for picture
        val imageView:ImageView = view.findViewById(R.id.item_image)
    }


    /**
     * Called by the layout manager --> create new view holders for the RecyclerView
     * Timing: no existing view holders that can be reused
     * Parameters: parent--the view group <-- new list item view will be attached to as a child
     * Parameters: viewType--multiple item view types in the same RecyclerView
     */
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ItemViewHolder {

        //obtain an instance of LayoutInflater from the provided context
        //inflate <-- actual list item view
        //Pass in the XML layout resource ID and the parent view group
        //3rd argument <-- attachToRoot
        val adapterLayout = LayoutInflater.from(parent.context)
            .inflate(R.layout.list_item, parent, false)

        //the root view is adapterLayout
        return ItemViewHolder(adapterLayout)
    }

    /**
     * Update all the views referenced by the view holder
     * Reflect the correct data for this item
     * 2 parameters
     * 1) an ItemViewHolder <-- previously created by onCreateViewHolder()
     * 2) an int <-- current item position in the list
     */
    override fun onBindViewHolder(holder: ItemViewHolder, position: Int) {
        //Replace the content of a view <-- invoked by the layout manager
        val item = dataset[position]
        holder.textView.text = context.resources.getString(item.stringResourceId)
        holder.imageView.setImageResource(item.imageResourceId)
    }

    override fun getItemCount(): Int {
        //return the size of your dataset
        return dataset.size
    }
}