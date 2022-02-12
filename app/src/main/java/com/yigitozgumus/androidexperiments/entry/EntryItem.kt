package com.yigitozgumus.androidexperiments.entry

import com.yigitozgumus.androidexperiments.demos.ParentChildFragmentDemoActivity
import kotlin.reflect.KClass

open class EntryItem(val title: String, val description: String, val entryPoint: KClass<out Any>)

class ParentChildFragmentDemoItem : EntryItem(
    title = "Parent Child Fragment Demo",
    description = "Activity with parent and child activity showcasing the communication methods between components",
    entryPoint = ParentChildFragmentDemoActivity::class
)