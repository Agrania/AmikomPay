package io.github.agrania.amikompay

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView

class MyAdapter(val arrayList: ArrayList<Model>, val context: Context) :
        RecyclerView.Adapter<MyAdapter.ViewHolder>() {

    class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

        fun bindItems (model: Model) {

            itemView.tv_judul.text = model.title
            itemView.iv_gambar.setImageResource(model.image)
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {

        val v = LayoutInflater.from(parent.context).inflate(R.layout.row, parent, false)
        return ViewHolder(v)
    }

    override fun getItemCount(): Int {
        return arrayList.size
    }

    override fun onBindViewHolder(holder: MyAdapter.ViewHolder, position: Int) {
        holder.bindItems(arrayList[position])
    }
}