package com.drake.softinput.example.ui.activity

import android.annotation.SuppressLint
import android.util.Log
import android.view.View
import com.drake.brv.utils.addModels
import com.drake.brv.utils.models
import com.drake.brv.utils.setup
import com.drake.softinput.example.R
import com.drake.softinput.example.base.BaseMenuActivity
import com.drake.softinput.example.databinding.ActivityMainBinding
import com.drake.softinput.example.model.ChatMessage
import com.drake.softinput.example.model.ChatModel
import com.drake.softinput.hasSoftInput
import com.drake.softinput.hideSoftInput
import com.drake.softinput.setWindowSoftInput

class MainActivity : BaseMenuActivity<ActivityMainBinding>(R.layout.activity_main) {

    private val model = ChatModel()

    @SuppressLint("ClickableViewAccessibility")
    override fun initView() {
        supportActionBar?.subtitle = "MainActivity"
        binding.v = this
        binding.m = model

        setWindowSoftInput(
            float = binding.llInput,
            onChanged = {
                Log.d("SoftInput", "visibility = ${hasSoftInput()}")
            }
        )

        // Use BRV to setup the recycler view : https://github.com/liangjingkanji/BRV/
        binding.rv.setup {
            addType<ChatMessage> {
                if (isMine()) {
                    R.layout.item_msg_right
                } else {
                    R.layout.item_msg_left
                }
            }
        }
        binding.rv.setOnTouchListener { v, _ ->
            v.clearFocus() // 清除文字选中状态
            hideSoftInput() // 隐藏键盘
            false
        }
    }

    override fun initData() {
        binding.rv.models = model.fetchHistory()
    }

    override fun onClick(v: View) {
        when (v) {
            binding.btnSend -> {
                binding.rv.addModels(model.getMessages()) // 添加一条消息
                binding.rv.smoothScrollToPosition(binding.rv.adapter!!.itemCount - 1) // 保证最新一条消息显示
            }
            binding.rv -> {
                hideSoftInput()
            }
        }
    }

}