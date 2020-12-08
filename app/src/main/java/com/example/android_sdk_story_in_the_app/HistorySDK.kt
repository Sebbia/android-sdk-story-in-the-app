package com.example.android_sdk_story_in_the_app

import android.support.v4.view.ViewPager
import android.support.v7.widget.LinearLayoutManager
import android.support.v7.widget.RecyclerView
import android.widget.ImageButton
import android.widget.ImageView
import java.net.URL
import java.util.*

class HistorySDK() {

    //Adapters
    lateinit var historyAdapter : HistoryAdapter

    //History
    lateinit var idHistoryList : MutableList<Int>
    lateinit var skinHistoryList : MutableList<ImageButton>
    lateinit var urlImageList : MutableList <URL>

    init {

    }

    fun initHistory(view: MainActivity)
    {
        view.setContentView(R.layout.activity_main)

        view.historyList = view.findViewById(R.id.recycler_histories)

        var historyLayoutManager = LinearLayoutManager(view, LinearLayoutManager.HORIZONTAL, false)
        view.historyList.layoutManager = historyLayoutManager

        view.historyList.setHasFixedSize(true)

        view.historyList.adapter = HistoryAdapter(6)
    }

    fun addHistory()
    {
        saveDateHistory()
        historyAdapter.addHistory()
        historyAdapter.notifyItemChanged(historyAdapter.itemCount -1)
    }

    private fun saveDateHistory() {
        idHistoryList.clear();
        skinHistoryList.clear();
        urlImageList.clear();

        for (holder: HistoryAdapter.HistoryViewHolder in historyAdapter.historyHolderList) {
            skinHistoryList.add(holder.listimage);
            urlImageList.add(holder.urlImageList)
            //holder.saveDate();
        }
    }

        fun saveDateScreen() {

        }

        fun queryHistory(token: Int): History {
            var history: History = History()
            history.token = token
            history.id = 0
            history.skin = ""
            //history.screenList =
            return history
        }

        fun queryScreen(token: Int): Screen {
            var screen: Screen = Screen()
    /*        screen.token
        screen.id
        screen.skin
        screen.time
        screen.DateStart
        screen.DateEnd
        screen.title
        screen.subtitle
        screen.url*/
            return screen
        }

        fun query() {

        }

        class History {

            var token: Int = 0

            var id: Int = 0

            lateinit var skin: String

            lateinit var screenList: MutableList<Screen>

        }

        class Screen {

            var token: Int = 0

            var id: Int = 0

            lateinit var skin: String

            var time: Int = 0

            lateinit var DateStart: Date

            lateinit var DateEnd: Date

            lateinit var title: String

            lateinit var subtitle: String

            lateinit var url: String

        }
    }

