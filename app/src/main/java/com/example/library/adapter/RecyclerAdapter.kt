package com.example.library.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.library.databinding.RecyclerItemLayoutBinding
import com.example.library.models.doc_model


class RecyclerAdapter(
    var items: ArrayList<doc_model>,
    var listener: ItemSetOnClickListener,
) :
    RecyclerView.Adapter<RecyclerAdapter.Holder>() {

    var nom = 0

    interface ItemSetOnClickListener {
        fun onClick(data: doc_model)
    }

    inner class Holder(var view:RecyclerItemLayoutBinding ) : RecyclerView.ViewHolder(view.root) {

        fun bind(data: doc_model) {

            view.apply {



                this.tvRil.text = data.name
            }

        }


    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): Holder {

        val binding =
            RecyclerItemLayoutBinding.inflate(LayoutInflater.from(parent.context), parent, false)

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