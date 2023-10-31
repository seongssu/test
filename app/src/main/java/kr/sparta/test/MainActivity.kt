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
        val y = 222
        val z = 333
        val f = 44444
        val h = 555555
        val k = 666666
        val q = 77777
    }
}