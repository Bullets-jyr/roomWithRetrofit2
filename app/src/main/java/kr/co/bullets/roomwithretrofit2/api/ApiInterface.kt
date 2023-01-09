package kr.co.bullets.roomwithretrofit2.api

import kr.co.bullets.roomwithretrofit2.model.Jokes
import retrofit2.Response
import retrofit2.http.GET

interface ApiInterface {

    @GET("/get_memes")
    suspend fun getJokes(): Response<Jokes>
}