package com.example.aula2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class DashBoardActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_dash_board)
setTitle("DashBOard")
        val parametro = intent.getStringExtra(PARAM_NAME)
        val textView = findViewById<TextView>(R.id.tv1DashBoard)

        textView.text = parametro

    }
}