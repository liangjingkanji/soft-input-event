package com.drake.softinput.example.model

private const val currentUserId = 0 // 假设这是当前用户ID

data class ChatMessage(val content: String, val userId: Int) {

    fun isMine(): Boolean {
        return currentUserId == userId
    }
}
