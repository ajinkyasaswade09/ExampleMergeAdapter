package com.example.trymergeadapter

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.MergeAdapter
import com.example.trymergeadapter.adapter.ListAdapter
import com.example.trymergeadapter.adapter.HeaderAdapter
import com.example.trymergeadapter.model.Model
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    private val footerImageURL =
        "https://images.unsplash.com/photo-1423483641154-5411ec9c0ddf?ixlib=rb-1.2.1&ixid=eyJhcHBfaWQiOjEyMDd9&auto=format&fit=crop&w=2850&q=80"
    private val headerImageURL =
        "https://images.unsplash.com/photo-1476224203421-9ac39bcb3327?ixlib=rb-1.2.1&ixid=eyJhcHBfaWQiOjEyMDd9&auto=format&fit=crop&w=1650&q=80"
    private val contactList = ArrayList<Model>()
    private lateinit var listAdapter: ListAdapter
    private lateinit var footerAdapter: HeaderAdapter
    private lateinit var headerAdapter: HeaderAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        populateList()
        initView()

    }

    private fun initView() {
        val linearLayoutManager = LinearLayoutManager(this)
        linearLayoutManager.orientation = LinearLayoutManager.VERTICAL
        recyclerView.layoutManager = linearLayoutManager

        listAdapter = ListAdapter(contactList)
        footerAdapter =
            HeaderAdapter(true, this, resources.getString(R.string.thank_you), footerImageURL)
        headerAdapter = HeaderAdapter(
            true, this, resources.getString(R.string.welcome_to_aj_foods), headerImageURL
        )
        val mergeAdapter = MergeAdapter(headerAdapter, listAdapter, footerAdapter)
        recyclerView.adapter = mergeAdapter
    }

    private fun populateList() {
        for (i in 0..25) {
            contactList.add(Model("AJ $i", i))
        }
    }
}
