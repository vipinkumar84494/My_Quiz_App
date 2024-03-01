package com.majorproject.myquizapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.TextView

class ResultActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_result)
        val intent = intent
        val currectAns = intent.getStringExtra("mCorrectAnswers")
        val name = intent.getStringExtra("name_")
        Log.e("kkfka",name!!)
        val textViewName:TextView = findViewById(R.id.tv_name)
        textViewName.text = name
        val textView:TextView = findViewById(R.id.tv_score)
          textView.text = "Your Score is ${currectAns} out of 10"
        val btn:Button = findViewById(R.id.btn_finish)

        btn.setOnClickListener {
            finish()
        }
    }
}