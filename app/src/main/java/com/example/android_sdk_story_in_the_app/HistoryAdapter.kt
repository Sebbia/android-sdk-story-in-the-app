package com.example.android_sdk_story_in_the_app

import android.content.Context
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView

class HistoryAdapter(numberItems : Int) : RecyclerView.Adapter<HistoryAdapter.HistoryViewHolder>() {

    private var count_screen : Int = 0

    init {
        count_screen = numberItems
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): HistoryViewHolder {
        var context : Context = parent.context
        var layoutIdListItem = R.layout.screen

        var inflater : LayoutInflater = LayoutInflater.from(context)
        var view : View = inflater.inflate(layoutIdListItem, parent, false)

        var viewHolder : HistoryViewHolder = HistoryViewHolder(view)

        //Добавление обложки истории fake

        viewHolder.listimage.setImageResource(R.drawable.fake_history_background)

        return viewHolder;
    }

    override fun onBindViewHolder(holder: HistoryViewHolder, position: Int) {
        holder.bind(position)
    }

    override fun getItemCount(): Int {
        return count_screen
    }


    class HistoryViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView)
    {
        lateinit var listimage : ImageView;

        init {
            super.itemView

            listimage = itemView.findViewById(R.id.history_item)
        }

        //Обновление ViewHolder (ID С сервера) fake

        fun bind(ID : Int)
        {
            listimage.setImageResource(R.drawable.fake_history_background)
        }

    }
}