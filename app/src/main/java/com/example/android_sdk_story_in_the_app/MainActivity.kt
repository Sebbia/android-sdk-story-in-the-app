package com.example.android_sdk_story_in_the_app

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.widget.RecyclerView

class MainActivity : AppCompatActivity() {

    lateinit var historyList : RecyclerView;
    lateinit var historyAdapter: HistoryAdapter;

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        var history : HistorySDK = HistorySDK()

        history.initHistory(this)


        /*        setContentView(R.layout.activity_main)

               historyList = findViewById(R.id.recycler_histories)

               var historyLayoutManager = LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false)
               historyList.layoutManager = historyLayoutManager

               historyList.setHasFixedSize(true)

               historyAdapter = HistoryAdapter(6)

               historyList.adapter = historyAdapter*/

    }
}