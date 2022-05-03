package com.drake.softinput.example.ui.dialog

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.drake.engine.base.EngineBottomSheetDialogFragment
import com.drake.engine.dialog.setMaxWidth
import com.drake.softinput.example.R
import com.drake.softinput.example.databinding.FragmentSampleBottomDialogBinding
import com.drake.softinput.setWindowSoftInput

class SampleBottomDialogFragment : EngineBottomSheetDialogFragment<FragmentSampleBottomDialogBinding>() {

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_sample_bottom_dialog, container, false)
    }

    override fun initView() {
        setMaxWidth()
        setWindowSoftInput(binding.btn, rootView)
    }

    override fun initData() {
    }
}