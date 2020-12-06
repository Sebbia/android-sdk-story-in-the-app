package com.example.android_sdk_story_in_the_app

import android.content.Intent
import android.os.Bundle
import android.support.v4.app.Fragment
import android.support.v4.app.FragmentManager
import android.support.v4.app.FragmentPagerAdapter
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView

class ScreenAdapter(manager: FragmentManager) : FragmentPagerAdapter(manager) {

    private val fragmentList : MutableList<Fragment> = ArrayList()
    private val titleList : MutableList<String> = ArrayList()

    override fun getCount(): Int {
        return fragmentList.size
    }

    override fun getItem(position: Int): Fragment {
        return fragmentList[position]
    }

    fun addFragment(fragment: Fragment, title: String)
    {
        fragmentList.add(fragment)
        titleList.add(title)
    }

    override fun getPageTitle(position: Int): CharSequence? {
        return titleList[position]
    }



        class ScreenFragment: Fragment() {

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
                //super.onViewCreated(view, savedInstanceState)
                val title = itemView.findViewById<TextView>(R.id.screen_title)
                title.text = "GG"

                var button = itemView.findViewById<ImageView>(R.id.CloseButton)

                button.setOnClickListener {
                    finish()
                }

            }

            private fun finish() {
                this.finish()

            }
        }

}