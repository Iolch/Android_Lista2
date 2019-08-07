package com.example.lista2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.content.Intent
import android.view.View
import android.widget.EditText

class ChangeData : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_change_data)
    }
    fun back(view: View)
    {
        val i = intent;
        val element = i.getStringExtra("buttonId")

        val input: EditText = findViewById(R.id.inputElement);
        val intent = Intent(this, MainActivity::class.java)

        intent.putExtra("buttonId", element)
        intent.putExtra("value", input.text)

        this.startActivity(intent)
    }


}
