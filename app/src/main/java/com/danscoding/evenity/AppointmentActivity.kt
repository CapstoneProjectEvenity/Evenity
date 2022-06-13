package com.danscoding.evenity

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class AppointmentActivity : AppCompatActivity() {

    private lateinit var btnBookNow : Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_appointment)
        //Intent
        btnBookNow = findViewById(R.id.btnBookNow)
        val intent = Intent(this@AppointmentActivity, SuccessAppointmentActivity::class.java)
        startActivity(intent)
    }
}