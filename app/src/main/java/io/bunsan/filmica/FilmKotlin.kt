package io.bunsan.filmica

data class FilmKotlin(
    val title: String = "Title",
    val overview: String = "Overview",
    val rating: Float = 0.0f,
    val genre: String = "None",
    val date: String = "1999 / 09 / 09",
    val url: String = "http://example.com"
)