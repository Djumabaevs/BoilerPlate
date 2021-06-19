package com.bignerdranch.android.boilerplate

import androidx.recyclerview.widget.DiffUtil

abstract class ViewBindingDiffUtilCallback<Item: ViewBindingAdapterItem> :
DiffUtil.ItemCallback<Item>()
