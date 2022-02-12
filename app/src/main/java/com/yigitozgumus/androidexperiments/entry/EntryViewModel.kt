package com.yigitozgumus.androidexperiments.entry

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class EntryViewModel : ViewModel() {
    private val _entryList = MutableLiveData<List<EntryItem>>()
    val entryList: LiveData<List<EntryItem>> get() = _entryList

    init {
        _entryList.value = listOf(
            ParentChildFragmentDemoItem()
        )
    }

}