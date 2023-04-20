package com.blisskoech.kchcustomlistview

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.ImageView
import android.widget.TextView

class MyAdapter (val mycontxt:Context,val resources:Int,val item:List<models>):ArrayAdapter<models>(mycontxt,resources,item) {
    override fun getView(position: Int, convertView: View?, parent: ViewGroup): View {
        val layoutInflater = LayoutInflater.from(mycontxt)
        val view: View = layoutInflater.inflate(resources, null)
        val imageView:ImageView=view.findViewById(R.id.image)
        val Tv_titttle:TextView=view.findViewById(R.id.textView1)
        val Tv_description:TextView=view.findViewById(R.id.textView2)
        var myitems:models=item[position]
        imageView.setImageDrawable(mycontxt.resources.getDrawable(myitems.img))
        Tv_titttle.text=myitems.title
        Tv_description.text=myitems.discriptions
        return view
    }
}