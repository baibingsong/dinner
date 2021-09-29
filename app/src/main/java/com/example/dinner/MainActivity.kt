package com.example.dinner

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import java.util.*
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun myClick(view: View){
        var arrayList = arrayListOf("Hamburger", "Pizza", "Mexican", "American", "Chinese")

        decideBtn.setOnClickListener {
            var random = Random()
            var abc = arrayList.size
            var a = random.nextInt(abc)
            mainTxt.text = arrayList[a]
        }

        addBtn.setOnClickListener {
            if (addTxt.text.toString() != ""){
                var qw = addTxt.text.toString()
                arrayList.add(qw)
                addTxt.text.clear()
            }
        }
    }
}