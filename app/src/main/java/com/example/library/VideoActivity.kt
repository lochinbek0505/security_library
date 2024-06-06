package com.example.library

import android.R
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.library.databinding.ActivityVideoBinding
import com.example.library.models.doc_model
import com.pierfrancescosoffritti.androidyoutubeplayer.core.player.YouTubePlayer
import com.pierfrancescosoffritti.androidyoutubeplayer.core.player.listeners.AbstractYouTubePlayerListener
import com.pierfrancescosoffritti.androidyoutubeplayer.core.player.views.YouTubePlayerView


class VideoActivity : AppCompatActivity() {

    private lateinit var binding: ActivityVideoBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding=ActivityVideoBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val data=intent.getSerializableExtra("res_v") as doc_model

        val youTubePlayerView =binding.youtubePlayerView

//        getLifecycle().addObserver(youTubePlayerView)
        lifecycle.addObserver(youTubePlayerView)

        youTubePlayerView.addYouTubePlayerListener(object : AbstractYouTubePlayerListener() {
            override fun onReady(youTubePlayer: YouTubePlayer) {
                val videoId = data.file
                youTubePlayer.loadVideo(videoId, 0f)
            }
        })
    }
}