package com.example.movieupload

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.android.volley.Request
import com.android.volley.Response
import com.android.volley.VolleyError
import com.android.volley.toolbox.StringRequest
import com.android.volley.toolbox.Volley
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)



        val queue = Volley.newRequestQueue(this)

        val url = "http://ip.jsontest.com/ "

        btn_add.setOnClickListener {

            var name =  edname.text.toString()
            var link = edlink.text.toString()
            var year = edyear.text.toString()

            when {
                name.isEmpty() -> {
                    edname.error = "name is required"
                    return@setOnClickListener
                }
                link.isEmpty() -> {
                    edlink.error="Link is required"
                    return@setOnClickListener
                }
                year.isEmpty() -> {
                    edyear.error="year is required"
                    return@setOnClickListener
                }
                else -> {
                    val stringRequest =
                        StringRequest(Request.Method.POST, url, Response.Listener { response ->
                            Toast.makeText(applicationContext, response.toString(), Toast.LENGTH_LONG).show()
                        }, Response.ErrorListener {
                            Toast.makeText(applicationContext,Response.error<String>(VolleyError()).toString(), Toast.LENGTH_LONG).show()
                        })

                    queue.add(stringRequest)
                }
            }

        }
    }
}
