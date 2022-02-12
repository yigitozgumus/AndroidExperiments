package com.yigitozgumus.androidexperiments.entry

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.DiffUtil.ItemCallback
import androidx.recyclerview.widget.ListAdapter
import com.yigitouzgumus.androidexperiments.databinding.LayoutEntryItemBinding

class EntryAdapter(private val onClickToItem: (EntryItem) -> Unit) :
    ListAdapter<EntryItem, EntryViewHolder>(EntryDiffCallback()) {

    private class EntryDiffCallback : ItemCallback<EntryItem>() {
        override fun areItemsTheSame(oldItem: EntryItem, newItem: EntryItem): Boolean {
            return oldItem.title == newItem.title
        }

        override fun areContentsTheSame(oldItem: EntryItem, newItem: EntryItem): Boolean {
            return oldItem == newItem
        }

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): EntryViewHolder {
        val binding =
            LayoutEntryItemBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return EntryViewHolder(binding)
    }

    override fun onBindViewHolder(holder: EntryViewHolder, position: Int) {
        holder.bindData(getItem(position), onClickToItem)
    }
}