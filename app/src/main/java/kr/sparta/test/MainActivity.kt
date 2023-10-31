package kr.sparta.test

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kr.sparta.test.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private val binding by lazy { ActivityMainBinding.inflate(layoutInflater) }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        binding.btnSharedpreference.setOnClickListener {

        }
        binding.btnGooglemaps.setOnClickListener {  }
        val x = 11
        val y = 2
        val z = 3
        val f = 4
        val h = 5
        val k = 6
        val q = 7
    }
}