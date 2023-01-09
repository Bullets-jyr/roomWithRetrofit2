package kr.co.bullets.roomwithretrofit2.model

data class Meme(
    val id: String,
    val name: String,
    val url: String,
    val width: Int,
    val height: Int,
    val box_count: Int,
    val captions: Int
)
