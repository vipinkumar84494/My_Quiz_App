package com.majorproject.myquizapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val et_name = findViewById<EditText>(R.id.et_name)
        val btn_start = findViewById<Button>(R.id.btn_start)


        btn_start.setOnClickListener{

            if (et_name.text.isEmpty()){
                Toast.makeText(this,"Please enter your name.", Toast.LENGTH_LONG).show()
            }
            else{
                val intent = Intent(this, QuizQuestionsActivity::class.java)
                intent.putExtra("myname",et_name.text.toString())
                Log.e("llllld",et_name.text.toString())
                startActivity(intent)
            }
        }


    }
}