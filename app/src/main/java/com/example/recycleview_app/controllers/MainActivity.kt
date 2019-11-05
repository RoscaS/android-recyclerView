package com.example.recycleview_app.controllers

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.recycleview_app.BlogRecyclerAdapter
import com.example.recycleview_app.DataSource
import com.example.recycleview_app.R
import com.example.recycleview_app.TopSpacingItemDecoration
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

  /*------------------------------------------------------------------*\
  |*							               ATTRIBUTES
  \*------------------------------------------------------------------*/

  private lateinit var blogAdapter: BlogRecyclerAdapter

  /*------------------------------------------------------------------*\
  |*							                HOOKS
  \*------------------------------------------------------------------*/

  override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)
    setContentView(R.layout.activity_main)

    initRecycleView()
    addDataSet()
  }

  /*------------------------------------------------------------------*\
  |*							                METHODES
  \*------------------------------------------------------------------*/

  private fun initRecycleView() {
    recycler_view.apply {
      layoutManager = LinearLayoutManager(this@MainActivity)
      blogAdapter = BlogRecyclerAdapter()
      adapter = blogAdapter
      val topSpacingDecorator = TopSpacingItemDecoration(30)
      addItemDecoration(topSpacingDecorator)
    }
  }

  private fun addDataSet() = blogAdapter.submitList(DataSource.createDataSet())

}
