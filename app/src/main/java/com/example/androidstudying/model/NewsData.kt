package com.example.androidstudying.model

import java.sql.ClientInfoStatus

data class NewsData (
    val articles: List<Article>,
    val status: String,
    val totalResult: Int
)