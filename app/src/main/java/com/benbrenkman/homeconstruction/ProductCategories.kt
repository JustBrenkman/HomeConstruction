package com.benbrenkman.homeconstruction

import android.content.Context
import android.os.Bundle
import android.support.design.widget.Snackbar
import android.support.design.widget.TabLayout
import android.support.v4.app.Fragment
import android.support.v4.app.FragmentManager
import android.support.v4.app.FragmentPagerAdapter
import android.support.v4.view.ViewPager
import android.support.v7.app.AppCompatActivity
import android.text.Layout
import android.view.LayoutInflater
import android.view.View

import kotlinx.android.synthetic.main.activity_product_categories.*
import kotlinx.android.synthetic.main.fragment_product_categories.*

class ProductCategories : AppCompatActivity() {

    private lateinit var mPageAdapter: ContentFragmentPageAdapter
    private lateinit var mViewPager: ViewPager

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_product_categories)
        setSupportActionBar(toolbar)

        // Set the tab layout listeners
        category_tabs.addOnTabSelectedListener(object : TabLayout.OnTabSelectedListener {
            override fun onTabSelected(tab: TabLayout.Tab) {
                supportActionBar?.setTitle(tab?.text)
                mViewPager.currentItem = tab.position
            }

            override fun onTabReselected(tab: TabLayout.Tab?) {
                //supportActionBar?.setTitle("None")
            }

            override fun onTabUnselected(tab: TabLayout.Tab?) {
                //supportActionBar?.setTitle("Other")
            }
        })

        mPageAdapter = ContentFragmentPageAdapter(supportFragmentManager)
        mViewPager = findViewById(R.id.pager)
        mViewPager.adapter = mPageAdapter

        mViewPager.setOnPageChangeListener(
                object : ViewPager.SimpleOnPageChangeListener() {
                    override fun onPageSelected(position: Int) {
                        // When swiping between pages, select the
                        // corresponding tab.
                        val tab = category_tabs.getTabAt(position)
                        tab?.select()
                    }
                })
    }
}

class ContentFragmentPageAdapter(fm: FragmentManager) : FragmentPagerAdapter(fm) {

    val mList: List<ProductCategoriesFragment> = listOf<ProductCategoriesFragment>()

    fun init() {

    }

    override fun getItem(position: Int): Fragment {
//        TODO("not implemented") //To change body of created functions use File | Settings | File Templates

        return mList.get(position)
    }

    override fun getCount(): Int {
//        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
        return 5;
    }

}
