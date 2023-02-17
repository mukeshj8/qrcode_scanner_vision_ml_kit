package com.mkj.chips.qrcodeapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.mkj.chips.qrcodeapp.databinding.ActivityAttendanceBinding

class AttendanceActivity : AppCompatActivity() {

    lateinit var qr_val: String
    private lateinit var binding: ActivityAttendanceBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityAttendanceBinding.inflate(layoutInflater)
        setContentView(binding.root)
        //qr_val = intent.getStringExtra("QR_VAL").toString()
        //Log.d("Joker", "Value: ${qr_val}")

        binding.button.setOnClickListener {
            finish()
        }
    }
}