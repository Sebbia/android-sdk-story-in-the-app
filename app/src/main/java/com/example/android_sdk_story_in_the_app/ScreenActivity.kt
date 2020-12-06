package com.example.android_sdk_story_in_the_app

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v4.view.ViewPager

class ScreenActivity : AppCompatActivity() {

    lateinit var screenList : ViewPager

    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        setContentView(R.layout.screen)

        screenList = findViewById(R.id.screen)

        title = findViewById(R.id.screen_title)

        var t : String = "Заголовок 2"

        val adapter = ScreenAdapter(supportFragmentManager)

        adapter.addFragment(ScreenAdapter.ScreenFragment(), "ScreenFragment")
        adapter.addFragment(ScreenAdapter.ScreenFragment(), t)

        screenList.adapter = adapter



    }
}