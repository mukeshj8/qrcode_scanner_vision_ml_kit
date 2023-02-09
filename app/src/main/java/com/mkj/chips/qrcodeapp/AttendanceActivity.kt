package com.mkj.chips.qrcodeapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class AttendanceActivity : AppCompatActivity() {

    lateinit var qr_val: String

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_attendance)
        qr_val = intent.getStringExtra("QR_VAL").toString()
        Log.d("Joker", "Value: ${qr_val}")
    }
}