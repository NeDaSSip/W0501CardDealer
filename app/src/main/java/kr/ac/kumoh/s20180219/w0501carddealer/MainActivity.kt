package kr.ac.kumoh.s20180219.w0501carddealer

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kr.ac.kumoh.s20180219.w0501carddealer.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //setContentView(R.layout.activity_main)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }
}