package ru.skillbranch.dev_intensive_2019.models

class Chat(
    id: String,
    val members: MutableList<User> = mutableListOf(),
    val messages: MutableList<BaseMessage> = mutableListOf()
) {
}