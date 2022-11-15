package com.example.androidstudying.ui.theme

import android.util.Log
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.androidstudying.model.Article
import com.example.androidstudying.network.Api
import kotlinx.coroutines.launch

class NewsViewModel : ViewModel() {
    init {
        getListNews()
    }
    fun getListNews() {
        viewModelScope.launch {
            val response = Api.newsApiService.getTopHeadline()
            val articles = response.articles

            articles.forEach{ article: Article ->
                Log.d("response", article.toString())
            }
        }
    }
}