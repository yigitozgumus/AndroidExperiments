package com.yigitozgumus.androidexperiments.entry

import com.yigitozgumus.androidexperiments.demos.ParentChildFragmentDemoActivity
import kotlin.reflect.KClass

sealed class EntryItem(
    open val title: String,
    open val description: String,
    open val entryPoint: KClass<out Any>
)

data class ParentChildFragmentDemoItem(
    override val title: String = "Parent Child Fragment Demo",
    override val description: String = "Activity with parent and child activity showcasing the communication methods between components",
    override val entryPoint: KClass<out Any> = ParentChildFragmentDemoActivity::class
) : EntryItem(title, description, entryPoint)