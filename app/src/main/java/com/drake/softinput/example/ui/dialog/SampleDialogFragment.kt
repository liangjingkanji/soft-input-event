package com.drake.softinput.example.ui.dialog

import com.drake.engine.base.EngineDialogFragment
import com.drake.engine.dialog.setMaxWidth
import com.drake.softinput.example.R
import com.drake.softinput.example.databinding.FragmentSampleDialogBinding
import com.drake.softinput.setWindowSoftInput

class SampleDialogFragment : EngineDialogFragment<FragmentSampleDialogBinding>(R.layout.fragment_sample_dialog) {

    override fun initView() {
        setMaxWidth()
        setWindowSoftInput(binding.btn)
    }

    override fun initData() {

    }
}