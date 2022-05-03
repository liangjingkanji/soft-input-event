package com.drake.softinput.example.model

import androidx.databinding.BaseObservable

class ChatModel : BaseObservable() {

    /** 消息输入框内容 */
    var input: String = ""
        set(value) {
            field = value
            notifyChange()
        }

    /** 是否可以发送消息 */
    fun isSendEnable(): Boolean {
        return input.isNotEmpty()
    }

    /** 当前输入的消息数据类 */
    fun getMessage(): List<Message> {
        val messages = listOf(Message(input, 0))
        input = ""
        return messages
    }

    /** 模拟拉取历史消息记录 */
    fun fetchHistory(): MutableList<Message> {
        return mutableListOf<Message>(
            Message("Hello, I'm Tom. I'm a chatbot.", 1),
            Message("What's your name?", 1),
            Message("My name is Mike.", 0),
        )
    }
}