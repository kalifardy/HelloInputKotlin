package com.keyalive.kotlin.hellokotlin

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_output.*

class OutputActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_output)

        val bundle = intent.extras

        txtOutput.text=("Hello "+ bundle.getCharSequence(MainActivity.INPUT))
    }
}
