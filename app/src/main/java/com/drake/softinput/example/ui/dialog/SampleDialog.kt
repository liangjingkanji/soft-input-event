package com.drake.softinput.example.ui.dialog

import android.content.Context
import android.os.Bundle
import com.drake.engine.base.EngineDialog
import com.drake.engine.dialog.setMaxWidth
import com.drake.softinput.example.R
import com.drake.softinput.example.databinding.FragmentSampleDialogBinding
import com.drake.softinput.setWindowSoftInput

// class SampleDialog(context: Context) : EngineDialog<FragmentSampleDialogBinding>(context,android.R.style.Theme_Black_NoTitleBar_Fullscreen) {
class SampleDialog(context: Context) : EngineDialog<FragmentSampleDialogBinding>(context) {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.fragment_sample_dialog)
        setMaxWidth()
    }

    override fun initView() {
        setWindowSoftInput(binding.btn, binding.root)
    }

    override fun initData() {
    }
}