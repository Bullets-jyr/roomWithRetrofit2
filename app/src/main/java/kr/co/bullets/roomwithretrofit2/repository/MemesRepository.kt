package kr.co.bullets.roomwithretrofit2.repository

import android.util.Log
import kr.co.bullets.roomwithretrofit2.api.ApiInterface

class MemesRepository(private val apiInterface: ApiInterface) {

    suspend fun getMemes() {
        val result = apiInterface.getJokes()
        if (result.body() != null) {
            Log.d("MemesRepository", "${result.body()}")
        }
    }
}