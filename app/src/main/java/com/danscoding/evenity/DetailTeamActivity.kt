package com.danscoding.evenity

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView

class DetailTeamActivity : AppCompatActivity() {

    private lateinit var btnContinue : Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail_team)
        //Intent
        btnContinue = findViewById(R.id.btnContinue)
        val intent = Intent(this@DetailTeamActivity, AppointmentActivity::class.java)
        startActivity(intent)


        val team = intent.getParcelableExtra<Team>("team")
        if (team != null) {
            val textView : TextView = findViewById(R.id.tvDetailTeamName)
            val imageView : ImageView = findViewById(R.id.imageDetail)

            textView.text = team.name
            imageView.setImageResource(team.image)
        }

    }
}