package com.benbrenkman.homeconstruction

import android.os.Bundle
import android.support.design.widget.Snackbar
import android.support.v7.app.AppCompatActivity
import android.view.View
import kotlinx.android.synthetic.main.activity_products.*

class Products : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_products)
        setSupportActionBar(toolbar)
        setTitle("Carpentry")
    }

    fun onCarpTabClicked(view : View) {
        toolbar.setTitle("Electric")
    }
}
