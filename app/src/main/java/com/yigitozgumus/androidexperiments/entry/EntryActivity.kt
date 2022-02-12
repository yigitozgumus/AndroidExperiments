package com.yigitozgumus.androidexperiments.entry

import android.content.Intent
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.viewModels
import com.yigitouzgumus.androidexperiments.databinding.ActivityEntryBinding

class EntryActivity : ComponentActivity() {

    private lateinit var binding: ActivityEntryBinding

    private val viewModel by viewModels<EntryViewModel>()

    private val entryAdapter by lazy { EntryAdapter(::onClickEntry) }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityEntryBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.bindEntryList()
        viewModel.entryList.observe(this) {
            entryAdapter.submitList(it)
        }
    }

    private fun ActivityEntryBinding.bindEntryList() {
        with(activityEntryTopicList) {
            adapter = entryAdapter
        }
    }

    private fun onClickEntry(entry: EntryItem) {
        Intent(this, entry.entryPoint.java).also { startActivity(it) }
    }

}
