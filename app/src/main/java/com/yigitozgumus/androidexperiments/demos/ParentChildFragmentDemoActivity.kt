package com.yigitozgumus.androidexperiments.demos

import android.os.Bundle
import androidx.activity.ComponentActivity
import com.yigitouzgumus.androidexperiments.databinding.ActivityParentChildFragmentDemoBinding

class ParentChildFragmentDemoActivity : ComponentActivity() {
    private lateinit var binding: ActivityParentChildFragmentDemoBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityParentChildFragmentDemoBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }
}