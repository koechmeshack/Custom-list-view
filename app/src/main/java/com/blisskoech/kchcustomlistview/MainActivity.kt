package com.blisskoech.kchcustomlistview

import android.graphics.ColorSpace.Model
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ListView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var listView=findViewById<ListView>(R.id.listview)
        var list = mutableListOf<models>()

        //adding images
        list.add(models("l1", "this is my lambo1 car", R.drawable.l1))
        list.add(models("l2", "this is my lambo2 car", R.drawable.l2))
        list.add(models("l3", "this is my lambo3 car", R.drawable.l3))
        list.add(models("l4", "this is my lambo4 car ", R.drawable.l4))
        list.add(models("l5", "this is my lambo5 car", R.drawable.l5))
        list.add(models("l6", "this is my lambo6 car", R.drawable.l6))

        listView.adapter=MyAdapter(this,R.layout.row,list)
    }

    }
