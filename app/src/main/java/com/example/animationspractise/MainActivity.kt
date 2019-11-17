package com.example.animationspractise

import android.graphics.drawable.AnimationDrawable
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    lateinit var imageView: ImageView
    lateinit var button: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        button = findViewById(R.id.start)
        imageView = findViewById(R.id.imageView)

        button.setOnClickListener { (imageView.background as AnimationDrawable).start() }

    }


}
