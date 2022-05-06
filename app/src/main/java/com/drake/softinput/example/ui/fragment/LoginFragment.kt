package com.drake.softinput.example.ui.fragment

import com.drake.engine.base.EngineFragment
import com.drake.softinput.example.R
import com.drake.softinput.example.databinding.FragmentLoginBinding
import com.drake.softinput.setWindowSoftInput
import com.drake.softinput.showSoftInput

class LoginFragment : EngineFragment<FragmentLoginBinding>(R.layout.fragment_login) {
    override fun initView() {
        // 如果Fragment不是立即创建, 请为Fragment所在的Activity配置[[WindowManager.LayoutParams.SOFT_INPUT_ADJUST_NOTHING]]
        setWindowSoftInput(binding.btnLogin, binding.root)
    }

    override fun onResume() {
        super.onResume()
        binding.etUserName.showSoftInput()
    }

    override fun initData() {
    }
}