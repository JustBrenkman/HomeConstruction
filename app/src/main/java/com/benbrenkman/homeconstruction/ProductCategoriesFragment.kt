package com.benbrenkman.homeconstruction

import android.content.Context
import android.support.v4.app.Fragment
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import kotlinx.android.synthetic.main.fragment_product_categories.*

/**
 * A placeholder fragment containing a simple view.
 */
class ProductCategoriesFragment : Fragment() {

    val parentLinearLayout = scrolling_content_carp

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {

        return inflater.inflate(R.layout.fragment_product_categories, container, false)
    }

    fun onAddCard(view :View) {
        val inflater:LayoutInflater = activity.layoutInflater
        val view = inflater.inflate(R.layout.cardview_layout, null)
        scrolling_content_carp.addView(view)
    }
}
