package com.e.Adapter

import android.app.Activity
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.ImageView
import android.widget.TextView
import com.e.Model.User
import com.e.kotlin_listview.R

class ListViewAdapter(private val context:Activity,private val arrayList: ArrayList<User>):ArrayAdapter<User>(context,
    R.layout.list_item,arrayList) {
    override fun getView(position: Int, convertView: View?, parent: ViewGroup): View {

        val inflater:LayoutInflater= LayoutInflater.from(context)
        val view=inflater.inflate(R.layout.list_item,null)

        val imageView:ImageView=view.findViewById(R.id.profile_image)
        val name:TextView=view.findViewById(R.id.name)
        val msg:TextView=view.findViewById(R.id.msg)
        val msgTime:TextView=view.findViewById(R.id.msgTime)

        name.text=arrayList[position].name
        msg.text=arrayList[position].msg
        msgTime.text=arrayList[position].msgTime
        imageView.setImageResource(arrayList[position].imageId)


        return view
    }
}