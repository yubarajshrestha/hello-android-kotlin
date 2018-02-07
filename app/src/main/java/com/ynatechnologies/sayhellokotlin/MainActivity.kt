package com.ynatechnologies.sayhellokotlin

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        hello_button.setOnClickListener({
            hello_text_view.text = hello_edit_text.text.toString()
            hello_edit_text.text = null
        })
    }
}
