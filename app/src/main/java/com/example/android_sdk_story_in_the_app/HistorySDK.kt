package com.example.android_sdk_story_in_the_app

import android.support.v4.view.ViewPager
import android.support.v7.widget.LinearLayoutManager
import android.support.v7.widget.RecyclerView
import android.widget.ImageButton
import android.widget.ImageView
import java.net.URL
import java.util.*

class HistorySDK() {

    init {

    }

    //Инициализация адаптера историй(MainActivity можно заменить на другое своё)

    fun initHistory(view: MainActivity) {
        view.setContentView(R.layout.activity_main)

        var historyList : RecyclerView = view.findViewById(R.id.recycler_histories)

        historyList.layoutManager = LinearLayoutManager(view, LinearLayoutManager.HORIZONTAL, false)

        historyList.setHasFixedSize(true)

        historyList.adapter = HistoryAdapter(getHistory())
    }


    //Получение экранов истории

    fun getScreen(tokenHistory: Int): MutableList<Screen> {

        var screenList : MutableList<Screen> = arrayListOf()

        for(screen in screenList)
        {
        if(screen.tokenHistory == tokenHistory) {
            screenList.add(screen)
        }
        }
        screenList.add(Screen(1, 1,1, "R.drawable.fake_history_background", 5, "10.10.2020", "10.12.2020", "Cat", "More Cats", "nul"))
        screenList.add(Screen(2, 1,2, "R.drawable.fake_history_background", 5, "10.10.2020", "10.12.2020", "Dog", "More Dogs", "nul"))
        return screenList
    }

    //Получение историй

    private fun getHistory() :  MutableList<HistorySDK.History>
    {

        var historyList: MutableList<HistorySDK.History> = arrayListOf()

        for(history in historyList)
        {
            historyList.add(history)
        }
        historyList.add(HistorySDK.History(0,0,"R.drawable.fake_history_background",getScreen(0)))
        historyList.add(HistorySDK.History(1,1,"R.drawable.fake_history_background",getScreen(1)))

        return historyList
    }


/*    fun addHistory()
    {
        saveDateHistory()
        historyAdapter.addHistory()
        historyAdapter.notifyItemChanged(historyAdapter.itemCount -1)
    }*/

/*    private fun saveDateHistory() {
        idHistoryList.clear();
        skinHistoryList.clear();
        urlImageList.clear();

        for (holder: HistoryAdapter.HistoryViewHolder in historyAdapter.historyHolderList) {
            skinHistoryList.add(holder.listimage);
            urlImageList.add(holder.urlImageList)
            //holder.saveDate();
        }*/


    fun saveDateScreen() {

    }

/*    fun queryHistory(token: Int): History {
        var history: History = History()
        history.token = token
        history.id = 0
        history.skin = ""
        //history.screenList =
        return history
    }*/

/*    fun queryScreen(token: Int): Screen {
        lateinit var screen: Screen
        screen.token
        screen.tokenHistory
        screen.id
        screen.skin
        screen.time
        screen.DateStart
        screen.DateEnd
        screen.title
        screen.subtitle
        screen.url
        return screen
    }*/

    fun query() {

    }

    class History {

        constructor(token: Int, id: Int, skin: String, screenList: MutableList<Screen>) {
            this.token = token
            this.id = id
            this.skin = skin
            this.screenList = screenList
        }

        var token: Int = 0

        var id: Int = 0

        var skin: String

        var screenList: MutableList<Screen>

    }

    class Screen {
        constructor(token: Int,tokenHistory: Int, id: Int, skin: String, time: Int, DateStart: String, DateEnd: String, title: String, subtitle: String, url: String) {
            this.token = token
            this.tokenHistory = tokenHistory
            this.id = id
            this.skin = skin
            this.time = time
            this.DateStart = DateStart
            this.DateEnd = DateEnd
            this.title = title
            this.subtitle = subtitle
            this.url = url
        }

        var token: Int = 0

        var tokenHistory : Int = 0

        var id: Int = 0

        lateinit var skin: String

        var time: Int = 0

        lateinit var DateStart: String

        lateinit var DateEnd: String

        lateinit var title: String

        lateinit var subtitle: String

        lateinit var url: String

    }
}


