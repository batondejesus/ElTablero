package com.iesmurgi.eltablero

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.SeekBar
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    private lateinit var btnPlay: Button
    private lateinit var xTilesSeekBar: SeekBar
    private lateinit var yTilesSeekBar: SeekBar
    private lateinit var colorsSeekBar: SeekBar
    private lateinit var xTilesTextView: TextView
    private lateinit var yTilesTextView: TextView
    private lateinit var colorsTextView: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btnPlay = findViewById(R.id.btnStart)
        btnPlay.setOnClickListener { startPlay() }

        xTilesSeekBar = findViewById(R.id.seek_bar_x_tiles)
        xTilesSeekBar.setOnSeekBarChangeListener(object : SeekBar.OnSeekBarChangeListener {
            override fun onProgressChanged(seekBar: SeekBar, progress: Int, fromUser: Boolean) {
                updateXTiles(progress)
            }

            override fun onStartTrackingTouch(seekBar: SeekBar) {}

            override fun onStopTrackingTouch(seekBar: SeekBar) {}
        })
        updateXTiles(xTilesSeekBar.progress)

        yTilesSeekBar = findViewById(R.id.seek_bar_y_tiles)
        yTilesSeekBar.setOnSeekBarChangeListener(object : SeekBar.OnSeekBarChangeListener {
            override fun onProgressChanged(seekBar: SeekBar, progress: Int, fromUser: Boolean) {
                updateYTiles(progress)
            }

            override fun onStartTrackingTouch(seekBar: SeekBar) {}

            override fun onStopTrackingTouch(seekBar: SeekBar) {}
        })
        updateYTiles(yTilesSeekBar.progress)

        colorsSeekBar = findViewById(R.id.seek_bar_colors)
        colorsSeekBar.setOnSeekBarChangeListener(object : SeekBar.OnSeekBarChangeListener {
            override fun onProgressChanged(seekBar: SeekBar, progress: Int, fromUser: Boolean) {
                updateColors(progress)
            }

            override fun onStartTrackingTouch(seekBar: SeekBar) {}

            override fun onStopTrackingTouch(seekBar: SeekBar) {}
        })
        updateColors(colorsSeekBar.progress)

        xTilesTextView = findViewById(R.id.text_view_x_tiles)
        yTilesTextView = findViewById(R.id.text_view_y_tiles)
        colorsTextView = findViewById(R.id.text_view_colors)
    }

    private fun startPlay() {
        // Aquí colocaría el código para iniciar el juego
    }
}