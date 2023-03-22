package com.example.dochat.data

import com.example.dochat.R
import com.example.dochat.model.Message
import com.example.dochat.model.ConversationUiState
import com.example.dochat.model.ProfileScreenState

val initialMessages = listOf(
    Message(
        author = "me",
        timestamp = "8:07 PM",
        content = "加油吧少年" +
                "加油吧大叔" +
                "加油吧骚年 \uD83D\uDC49" +
                "https://github.com/android/compose-samples/tree/master/JetNews"
    ),
    Message(
        author = "me",
        timestamp = "8:06 PM",
        content = "what are you 弄啥捏",
        image = R.drawable.yue
    ),
    Message(
        author = "me",
        timestamp = "8:05 PM",
        content = "大家好，我叫dorunto，是个主题设计师，也是独立开发者，希望可以在未来将学到的编程知识，将想要做的想法编程现实，加油吧少年！"
    ),
    Message(
        author = "瑞青",
        timestamp = "8:04 PM",
        content = "我是个臭驴" + "加油吧少年" +
                "加油吧大叔" +
                "加油吧骚年 \uD83D\uDC49" +
                "https://github.com/android/compose-samples/tree/master/JetNews",
        authorImage = R.drawable.rui
    ),
    Message(
        author = "瑞青",
        timestamp = "8:03 PM",
        content = "大家好，我是dorunto的老婆",
        authorImage = R.drawable.rui
    ),
    Message(
        author = "妈妈",
        timestamp = "8:02 PM",
        content = "哎，怎么能这么说话，应该说聊你妈个爸子啊，我去接玥玥买好吃的，你赶快工作去。",
        authorImage = R.drawable.ma
    ),
    Message(
        author = "瑞青",
        timestamp = "8:01 PM",
        content = "聊你妹啊！",
        authorImage = R.drawable.rui
    ),
    Message(
        author = "me",
        timestamp = "8:00 PM",
        content = "我们开始聊天吧"
    ),
)

val conversationUiState = ConversationUiState(
    channelName = "#compose",
    channelMembers = 5,
    initialMessages = initialMessages,
)

/**
 * Example colleague profile
 */
val maProfile = ProfileScreenState(
    userId = "12345",
    photo = R.drawable.rui,
    name = "pan",
    status = "Away",
    displayName = "老妈",
    position = "Senior Android Dev at Openlane",
    twitter = "twitter.com/taylorbrookscodes",
    timeZone = "12:25 AM local time (Eastern Daylight Time)",
    commonChannels = "2"
)

/**
 * Example colleague profile
 */
val ruiProfile = ProfileScreenState(
    userId = "12345",
    photo = R.drawable.rui,
    name = "rui",
    status = "Away",
    displayName = "老婆",
    position = "Senior Android Dev at Openlane",
    twitter = "twitter.com/taylorbrookscodes",
    timeZone = "12:25 AM local time (Eastern Daylight Time)",
    commonChannels = "2"
)

/**
 * Example "me" profile.
 */
val meProfile = ProfileScreenState(
    userId = "me",
    photo = R.drawable.dorunto,
    name = "壮兔dorunto",
    status = "Online",
    displayName = "dorunto",
    position = "Senior Android Dev at Yearin\nGoogle Developer Expert",
    twitter = "twitter.com/aliconors",
    timeZone = "In your timezone",
    commonChannels = null
)
