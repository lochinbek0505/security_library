package com.example.library.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.library.databinding.HomeItemLayoutBinding
import com.example.library.models.main_model


class MainAdapter(
    var items: ArrayList<main_model>,
    var listener: ItemSetOnClickListener,
) :
    RecyclerView.Adapter<MainAdapter.Holder>() {

    var nom = 0

    interface ItemSetOnClickListener {
        fun onClick(data: main_model)
    }

    inner class Holder(var view:HomeItemLayoutBinding ) : RecyclerView.ViewHolder(view.root) {

        fun bind(data: main_model) {

            view.apply {



                this.tvHil.text = data.name
                this.ivHil.setImageResource(data.image)
            }

        }


    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): Holder {

        val binding =
            HomeItemLayoutBinding.inflate(LayoutInflater.from(parent.context), parent, false)

        return Holder(
            binding
        )


    }

    override fun onBindViewHolder(holder: Holder, position: Int) {
        val item = items[position]

        holder.bind(item)


        holder.itemView.setOnClickListener {


                listener.onClick(item)


        }
    }



    override fun getItemCount(): Int = items.count()

}