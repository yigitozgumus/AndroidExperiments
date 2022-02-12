package com.yigitozgumus.androidexperiments.entry

import androidx.recyclerview.widget.RecyclerView
import com.yigitouzgumus.androidexperiments.databinding.LayoutEntryItemBinding

class EntryViewHolder(private val binding: LayoutEntryItemBinding) :
    RecyclerView.ViewHolder(binding.root) {

    private val title get() = binding.layoutEntryExperimentTitle
    private val description get() = binding.layoutEntryExperimentDescription

    fun bindData(data: EntryItem, onClick: (EntryItem) -> Unit) {
        title.text = data.title
        description.text = data.description
        itemView.setOnClickListener { onClick(data) }
    }
}