package com.keyalive.kotlin.hellokotlin

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    companion object {
        val INPUT:String? ="input"
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        input.setOnClickListener{

            if ((edt_input.text.isEmpty())){
                Toast("Harus di Isi",Toast.LENGTH_SHORT)

            }else if (edt_input.text.isNotEmpty()){
                Toast("Terimakasih",Toast.LENGTH_SHORT)

            val intent = Intent(this, OutputActivity::class.java)
                val bundle =Bundle()
                bundle.putString(INPUT, edt_input.text.toString())

                intent.putExtras(bundle)
                startActivity(intent)
            }
        }
    }

    private fun Toast(message: String, lenght: Int=Toast.LENGTH_LONG) {
        Toast.makeText(this,message,lenght).show()
    }
}
