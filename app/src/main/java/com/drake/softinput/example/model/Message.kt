package com.drake.softinput.example.model

private val currentUserId = 0 // 假设这是当前用户ID

data class Message(val content: String, val userId: Int) {

    fun isMine(): Boolean {
        return currentUserId == userId
    }
}
