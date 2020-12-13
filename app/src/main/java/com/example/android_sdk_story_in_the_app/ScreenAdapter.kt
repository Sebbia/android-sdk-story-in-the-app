package com.example.android_sdk_story_in_the_app

import android.os.Bundle
import android.support.v4.app.Fragment
import android.support.v4.app.FragmentManager
import android.support.v4.app.FragmentPagerAdapter
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import kotlin.properties.Delegates

class ScreenAdapter(manager: FragmentManager) : FragmentPagerAdapter(manager) {

    private val fragmentList : MutableList<ScreenFragment> = ArrayList()

    private val titleList : MutableList<String> = ArrayList()
    private val subtitleList : MutableList<String> = ArrayList()
    private val urlList : MutableList<String> = ArrayList()

    private val skinList : MutableList<String> = ArrayList()

    private val timeList : MutableList<Int> = ArrayList()
    private val startDateList : MutableList<String> = ArrayList()
    private val endDateList : MutableList<String> = ArrayList()


    override fun getCount(): Int {
        return fragmentList.size
    }

    override fun getItem(position: Int): ScreenFragment {
        fragmentList[position].position = position
        fragmentList[position].titleText = titleList[position]
        fragmentList[position].subtitleText = subtitleList[position]
        return fragmentList[position]
    }

    fun addFragment(fragment: ScreenFragment, screen: HistorySDK.Screen)
    {
        fragmentList.add(fragment)
        titleList.add(screen.title)
        subtitleList.add(screen.subtitle)
        urlList.add(screen.url)
        skinList.add(screen.skin)
        timeList.add(screen.time)
        startDateList.add(screen.DateStart)
        endDateList.add(screen.DateEnd)
    }

/*    override fun getPageTitle(position: Int): CharSequence? {
        return titleList[position]
    }*/

        class ScreenFragment: Fragment() {
            
            var position by Delegates.notNull<Int>()

            lateinit var titleText : String
            lateinit var subtitleText : String

            override fun onCreate(savedInstanceState: Bundle?) {
                super.onCreate(savedInstanceState)

            }

            override fun onCreateView(
                inflater: LayoutInflater, container: ViewGroup?,
                savedInstanceState: Bundle?
            ): View? {
                // Inflate the layout for this fragment


                return inflater.inflate(R.layout.screen_item, container, false)
            }

            override fun onViewCreated(itemView: View, savedInstanceState: Bundle?) {

                //var titleText : String = title
                //var subtitleText : String =

                //Привязка
                val title = itemView.findViewById<TextView>(R.id.screen_title)
                val subtitle = itemView.findViewById<TextView>(R.id.subtitle)

                //Инициализация
                title.text = titleText
                subtitle.text = subtitleText

                //Кнопка закрытия активности
                var button = itemView.findViewById<ImageView>(R.id.CloseButton)

                button.setOnClickListener {
                    finish()
                }

            }


            //Закрытие активности
            private fun finish() {
                finish()
            }
        }

}