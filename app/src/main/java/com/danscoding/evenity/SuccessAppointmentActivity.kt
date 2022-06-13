package com.danscoding.evenity

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class SuccessAppointmentActivity : AppCompatActivity() {

    private lateinit var btnHomePage: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_success_appointment)
        //Intent Homepage
        btnHomePage = findViewById(R.id.btnHomepage)
        val intent = Intent(this@SuccessAppointmentActivity, MainActivity::class.java)
//        intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK or Intent.FLAG_ACTIVITY_CLEAR_TOP)
        startActivity(intent)
//        finish()
    }
}