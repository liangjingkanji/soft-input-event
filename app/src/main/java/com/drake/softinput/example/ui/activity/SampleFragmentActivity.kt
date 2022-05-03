package com.drake.softinput.example.ui.activity

import com.drake.softinput.example.R
import com.drake.softinput.example.base.BaseMenuActivity
import com.drake.softinput.example.databinding.ActivitySampleFragmentBinding

/** 测试嵌套Fragment软键盘遮挡 */
class SampleFragmentActivity : BaseMenuActivity<ActivitySampleFragmentBinding>(R.layout.activity_sample_fragment) {
    override fun initView() {
        supportActionBar?.subtitle = "SampleFragmentActivity"
    }

    override fun initData() {
    }
}