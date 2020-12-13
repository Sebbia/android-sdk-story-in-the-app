package com.example.android_sdk_story_in_the_app

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v4.view.ViewPager

class ScreenActivity : AppCompatActivity() {

    lateinit var screenList : ViewPager

    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        setContentView(R.layout.screen)

        var screen : HistorySDK = HistorySDK()

        screenList = findViewById(R.id.screen)


        var bundle : Bundle? = this.intent.getBundleExtra("token")

        var default : Int = 0

        var token : Int = bundle?.getInt("token") ?: default;

        var screenListOnHistory : MutableList<HistorySDK.Screen> = screen.getScreen(token)

        val adapter = ScreenAdapter(supportFragmentManager)

        for(screen in screenListOnHistory)
        {
            adapter.addFragment(ScreenAdapter.ScreenFragment(), screen)
        }

        //adapter.addFragment(ScreenAdapter.ScreenFragment(), HistorySDK.Screen(1, 1,1, "R.drawable.fake_history_background", 5, "10.10.2020", "10.12.2020", "Cat", "More Cats", "nul"))
        //adapter.addFragment(ScreenAdapter.ScreenFragment(), HistorySDK.Screen(2, 1,1, "R.drawable.fake_history_background", 5, "10.10.2020", "10.12.2020", "Cat", "More Cats", "nul"))

        screenList.adapter = adapter
    }
}