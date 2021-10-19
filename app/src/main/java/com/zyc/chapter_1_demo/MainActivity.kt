package com.zyc.chapter_1_demo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Toast
import com.zyc.chapter_1_demo.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        supportActionBar?.hide()

        //查询按钮点击事件
        binding.sendRequestBtn.setOnClickListener {
            val words = binding.editText.text.toString()
            runOnUiThread{
                Toast.makeText(this, words, Toast.LENGTH_SHORT).show()
            }
            Log.d("debug", words)
        }
    }
}