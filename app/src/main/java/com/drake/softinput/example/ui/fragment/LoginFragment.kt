package com.drake.softinput.example.ui.fragment

import com.drake.engine.base.EngineFragment
import com.drake.softinput.example.R
import com.drake.softinput.example.databinding.FragmentLoginBinding
import com.drake.softinput.setWindowSoftInput
import com.drake.softinput.showSoftInput

class LoginFragment : EngineFragment<FragmentLoginBinding>(R.layout.fragment_login) {
    override fun initView() {
        setWindowSoftInput(binding.btnLogin, binding.root)
    }

    override fun onResume() {
        super.onResume()
        binding.etUserName.showSoftInput()
    }

    override fun initData() {
    }
}