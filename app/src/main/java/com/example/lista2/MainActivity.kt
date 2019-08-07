package com.example.lista2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.content.Intent


class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
    var weight:Double = 0.0
    var height:Double = 0.0
    override fun onStart() {
        super.onStart()
        val intent = intent;
        val value = intent.getStringExtra("value")
        if(value != null)
        {
            val element = intent.getStringArrayExtra("buttonId")
            if(element.toString() == R.id.changeHeight.toString()) height = value.toDouble()
            else weight = value.toDouble()
        }
    }


    fun next(view: View)
    {
        val intent = Intent(this, ChangeData::class.java)
        intent.putExtra("buttonId", view.id)
        this.startActivity(intent);
    }

    fun calcIMC()
    {}
}
