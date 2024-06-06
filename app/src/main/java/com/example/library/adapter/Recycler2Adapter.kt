package com.example.library.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.library.databinding.RecyclerItemLayoutBinding
import com.example.library.models.doc_model
import com.example.library.models.test_model


class Recycler2Adapter(
    var items: ArrayList<test_model>,
    var listener: ItemSetOnClickListener,
) :
    RecyclerView.Adapter<Recycler2Adapter.Holder>() {

    var nom = 0

    interface ItemSetOnClickListener {
        fun onClick(data: test_model)
    }

    inner class Holder(var view:RecyclerItemLayoutBinding ) : RecyclerView.ViewHolder(view.root) {

        fun bind(data: test_model) {

            view.apply {



                this.tvRil.text = data.title
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