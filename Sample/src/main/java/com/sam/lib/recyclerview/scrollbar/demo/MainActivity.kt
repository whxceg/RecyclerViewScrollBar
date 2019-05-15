package com.sam.lib.recyclerview.scrollbar.demo

import android.annotation.SuppressLint
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.support.v7.widget.LinearLayoutManager
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        horizontalScrollBar()
        verticalScrollBar()
    }

    private fun horizontalScrollBar(){
        mRecyclerView.adapter = ItemAdapter(20)
        mRecyclerView.layoutManager = LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false)
        mScrollBar.attachToRecyclerView(mRecyclerView)
    }

    private fun verticalScrollBar(){
        mRecyclerView2.adapter = ItemAdapter(40)
        mRecyclerView2.layoutManager = LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false)
        mScrollBar2.attachToRecyclerView(mRecyclerView2)
    }


    class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

        val textView: TextView = itemView.findViewById(R.id.text)
    }

    class ItemAdapter(var size:Int) : RecyclerView.Adapter<ViewHolder>() {


        override fun onCreateViewHolder(parent: ViewGroup, viewType: Int) =
            ViewHolder(LayoutInflater.from(parent.context).inflate(R.layout.item, parent, false))

        override fun getItemCount() = size

        @SuppressLint("SetTextI18n")
        override fun onBindViewHolder(holder: ViewHolder, position: Int) {
            holder.textView.text = "Item $position"
        }

    }
}
