package com.example.android_sdk_story_in_the_app

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageButton
import java.net.URL
import kotlin.properties.Delegates


class HistoryAdapter(values: MutableList<HistorySDK.History>) : RecyclerView.Adapter<HistoryAdapter.HistoryViewHolder>() {

    var values: MutableList<HistorySDK.History> = values


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): HistoryViewHolder {

        val itemView = LayoutInflater.from(parent.context).inflate(R.layout.history_item, parent, false)

        return HistoryViewHolder(itemView,parent.context);
    }

    override fun onBindViewHolder(holder: HistoryViewHolder, position: Int) {
        holder.skin.setImageResource(R.drawable.fake_history_background)
        holder.token = values[position].token
        //holder.urlString = values[position].skin

        //real
        //var icon = BitmapFactory.decodeStream(urlImageList.openConnection().getInputStream());
        //listimage.setImageBitmap(icon)

    }

    override fun getItemCount(): Int {
        return values.size
    }



    class HistoryViewHolder(itemView: View,context: Context) : RecyclerView.ViewHolder(itemView)
    {
        var token by Delegates.notNull<Int>()
        var skin: ImageButton;
        lateinit var urlImage : URL

        init {
            super.itemView
            skin = itemView.findViewById(R.id.history_item)


            skin.setOnClickListener {
                val intent = Intent(context, ScreenActivity::class.java)
                intent.putExtra("token", token)
                context.startActivity(intent)

            }
        }
    }
}