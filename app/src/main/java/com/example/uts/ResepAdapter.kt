package com.example.uts

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.RatingBar
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class ResepAdapter (private val context: Context, private val resep: List<ResepClass>, val listener: (ResepClass) -> Unit)
    : RecyclerView.Adapter<ResepAdapter.ResepViewHolder>(){
    class ResepViewHolder(view: View): RecyclerView.ViewHolder(view) {

        val resepimg = view.findViewById<ImageView>(R.id.image)
        val resepname = view.findViewById<TextView>(R.id.food_name)
        val resepdate = view.findViewById<TextView>(R.id.time)
        val resepauthor = view.findViewById<TextView>(R.id.pembuat)
        val reseprate = view.findViewById<TextView>(R.id.rating)
        val ratingbar = view.findViewById<RatingBar>(R.id.ratingbar)

        fun bindView(resep: ResepClass, listener: (ResepClass) -> Unit){
            resepimg.setImageResource(resep.resepimg)
            resepname.text = resep.resepname
            resepdate.text = resep.resepdate
            resepauthor.text = resep.resepauthor
            reseprate.text = resep.reseprate
            ratingbar.rating = resep.ratingbar.toFloat()
            itemView.setOnClickListener{
                (listener(resep))
            }
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ResepViewHolder {
        return ResepViewHolder(
            LayoutInflater.from(context).inflate(R.layout.item_view, parent, false)
        )
    }

    override fun onBindViewHolder(holder: ResepViewHolder, position: Int) {
        holder.bindView(resep[position], listener)
    }

    override fun getItemCount(): Int = resep.size

}