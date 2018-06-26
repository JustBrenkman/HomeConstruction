package com.benbrenkman.homeconstruction

import android.os.Bundle
import android.support.design.widget.Snackbar
import android.support.design.widget.TabLayout
import android.support.v7.app.AppCompatActivity
import android.view.View

import kotlinx.android.synthetic.main.activity_product_categories.*

class ProductCategories : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_product_categories)
        setSupportActionBar(toolbar)

        // Set the tab layout listeners
        category_tabs.addOnTabSelectedListener(object : TabLayout.OnTabSelectedListener {
            override fun onTabSelected(tab: TabLayout.Tab?) {
                supportActionBar?.setTitle(tab?.text)
            }

            override fun onTabReselected(tab: TabLayout.Tab?) {
                supportActionBar?.setTitle("None")
            }

            override fun onTabUnselected(tab: TabLayout.Tab?) {
                supportActionBar?.setTitle("Other")
            }
        })
    }
}
