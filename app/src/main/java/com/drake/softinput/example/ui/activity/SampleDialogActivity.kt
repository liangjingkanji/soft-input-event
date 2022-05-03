package com.drake.softinput.example.ui.activity

import android.view.View
import com.drake.softinput.example.R
import com.drake.softinput.example.base.BaseMenuActivity
import com.drake.softinput.example.databinding.ActivitySampleDialogBinding
import com.drake.softinput.example.ui.dialog.SampleBottomDialogFragment
import com.drake.softinput.example.ui.dialog.SampleDialog
import com.drake.softinput.example.ui.dialog.SampleDialogFragment

class SampleDialogActivity : BaseMenuActivity<ActivitySampleDialogBinding>(R.layout.activity_sample_dialog) {

    override fun initView() {
        binding.v = this
        supportActionBar?.subtitle = "SampleDialogActivity"
    }

    override fun initData() {
    }

    override fun onClick(v: View) {
        when (v) {
            binding.button -> SampleDialog(this).show()
            binding.button2 -> SampleDialogFragment().show(supportFragmentManager, null)
            binding.button3 -> SampleBottomDialogFragment().show(supportFragmentManager, null)
        }
    }
}