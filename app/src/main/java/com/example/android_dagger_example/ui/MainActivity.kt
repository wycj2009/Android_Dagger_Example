package com.example.android_dagger_example.ui

import android.os.Bundle
import com.example.android_dagger_example.R
import com.example.android_dagger_example.databinding.ActivityMainBinding
import dagger.android.support.DaggerAppCompatActivity
import javax.inject.Inject

class MainActivity : DaggerAppCompatActivity() {

    @Inject
    lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding.run {
            textView.text = "This is MainActivity"
        }

        supportFragmentManager.beginTransaction().replace(R.id.container, MainFragment()).commitNow()
    }

}