package com.example.android_sdk_story_in_the_app

import android.os.Build
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.annotation.RequiresApi
import android.support.v7.widget.LinearLayoutManager
import android.support.v7.widget.RecyclerView
import java.time.LocalDate
import java.time.format.DateTimeFormatter

class MainActivity : AppCompatActivity() {


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