package com.example.madpractical6_20012021042

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.MediaController
import android.widget.VideoView
import com.google.android.material.floatingactionbutton.FloatingActionButton

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val myvideoview = findViewById<VideoView>(R.id.vv)
        val myactionbutton = findViewById<FloatingActionButton>(R.id.fb)

        myactionbutton.setOnClickListener(){
            Intent(this, YoutubeActivity ::class.java).apply { startActivity(this) }
        }



        val mediaController = MediaController(this)
        val uri = Uri.parse("android.resource://" + packageName + "/" + R.raw.thestoryoflight)
        myvideoview.setMediaController(mediaController)
        mediaController.setAnchorView(myvideoview)
        myvideoview.setVideoURI(uri)
        myvideoview.requestFocus()
        myvideoview.start()


    }
}