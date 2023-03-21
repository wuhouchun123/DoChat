package com.example.dochat.model

import androidx.compose.runtime.toMutableStateList
import com.example.dochat.R

data class ConversationUiState(
    val channelName: String,
    val channelMembers: Int,
    val initialMessages: List<Message>
) {

}

data class Message(
    val author: String,
    val timestamp: String,
    val content: String,
    val image: Int? = null,
    val authorImage: Int = R.drawable.dorunto
)


