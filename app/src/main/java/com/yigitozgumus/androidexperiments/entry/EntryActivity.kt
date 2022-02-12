package com.yigitozgumus.androidexperiments.entry

import android.os.Bundle
import androidx.activity.ComponentActivity
import com.yigitouzgumus.androidexperiments.databinding.ActivityEntryBinding

class EntryActivity : ComponentActivity() {

    private lateinit var binding: ActivityEntryBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityEntryBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }
}
