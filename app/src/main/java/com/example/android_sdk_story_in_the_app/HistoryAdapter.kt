package com.example.android_sdk_story_in_the_app

import android.content.Context
import android.content.Intent
import android.graphics.BitmapFactory
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageButton
import java.net.URL


class HistoryAdapter(numberItems: Int) : RecyclerView.Adapter<HistoryAdapter.HistoryViewHolder>() {

    lateinit var historyHolderList : MutableList<HistoryViewHolder>
    private var historySize : Int = 0

    init {
        historySize = numberItems
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): HistoryViewHolder {
        var context : Context = parent.context
        var layoutIdListItem = R.layout.history_item

        var inflater : LayoutInflater = LayoutInflater.from(context)
        var view : View = inflater.inflate(layoutIdListItem, parent, false)

        var viewHolder : HistoryViewHolder = HistoryViewHolder(view, context)

        //Добавление обложки истории fake

        viewHolder.listimage.setImageResource(R.drawable.fake_history_background)

        historyHolderList.add(viewHolder)

        return viewHolder;
    }

    override fun onBindViewHolder(holder: HistoryViewHolder, position: Int) {
        holder.bind(position)
    }

    override fun getItemCount(): Int {
        return historySize
    }

    fun addHistory()
    {
        historySize++
    }



    class HistoryViewHolder(itemView: View, context: Context) : RecyclerView.ViewHolder(itemView)
    {
        var listimage: ImageButton;
        lateinit var urlImageList : URL

        init {
            super.itemView

            listimage = itemView.findViewById(R.id.history_item)

            listimage.setOnClickListener {
                val intent = Intent(context, ScreenActivity::class.java)
                intent.putExtra("position", "Kotlin")
                context.startActivity(intent)
            }
        }

        //Обновление ViewHolder (ID С сервера) fake

        fun bind(ID: Int)
        {
            //fake
            listimage.setImageResource(R.drawable.fake_history_background)
            //real
            var icon = BitmapFactory.decodeStream(urlImageList.openConnection().getInputStream());
            listimage.setImageBitmap(icon)
            //saveDate()
        }

/*        fun saveDate()
        {
            answerStrings.clear()
            for (et in answerAdapter.answers) answerStrings.add(et.text.toString())
        }*/

    }
}