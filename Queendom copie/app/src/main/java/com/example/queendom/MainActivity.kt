package com.example.chessapp

import android.content.Context
import android.content.Intent
import android.media.AudioManager
import android.media.MediaPlayer
import android.os.Bundle
import android.widget.ImageButton
import android.widget.SeekBar
import androidx.appcompat.app.AppCompatActivity
import com.example.queendom.R


class MainActivity : AppCompatActivity() {
    lateinit var seekBar: SeekBar
    private var song = mutableListOf(R.raw.song)
    private var mp: MediaPlayer? = null
    private lateinit var audioManager: AudioManager
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Récupération des ImageButton
        val image1 = findViewById<ImageButton>(R.id.image1)
        val image2 = findViewById<ImageButton>(R.id.image2)
        val image3 = findViewById<ImageButton>(R.id.image3)


        // Navigation vers la page des règlements
        image1.setOnClickListener {
            val intent = Intent(this, ReglementActivity::class.java)
            startActivity(intent)
        }

        // Navigation vers la page des pions
        image2.setOnClickListener {
            val intent = Intent(this, PionActivity::class.java)
            startActivity(intent)
        }

        // Navigation vers la page des ouvertures
        image3.setOnClickListener {
            val intent = Intent(this, OuvertureActivity::class.java)
            startActivity(intent)
        }
        //trouver les id pour la musique et le volume
        seekBar = findViewById(R.id.volumeSeekBar)
        audioManager = getSystemService(Context.AUDIO_SERVICE) as AudioManager
        setupVolumeControl()
        controlSong(song[0])

    }
    //lancer la musique
    private fun controlSong(id: Int){
        if (mp == null){
            mp = MediaPlayer.create(this,id)
        }
        mp?.start()
        initSeekBar()
    }
    //set le volume
    private fun setupVolumeControl() {
        val maxVolume = audioManager.getStreamMaxVolume(AudioManager.STREAM_MUSIC)
        val currentVolume = audioManager.getStreamVolume(AudioManager.STREAM_MUSIC)

        seekBar.max = maxVolume
        seekBar.progress = currentVolume

        seekBar.setOnSeekBarChangeListener(object : SeekBar.OnSeekBarChangeListener {
            override fun onProgressChanged(seekBar: SeekBar?, progress: Int, fromUser: Boolean) {
                if (fromUser) {
                    audioManager.setStreamVolume(AudioManager.STREAM_MUSIC, progress, 0)
                }
            }
            override fun onStartTrackingTouch(seekBar: SeekBar?) {}
            override fun onStopTrackingTouch(seekBar: SeekBar?) {}
        })
    }
    private fun initSeekBar(){
        seekBar.max = mp!!.duration
    }

}
