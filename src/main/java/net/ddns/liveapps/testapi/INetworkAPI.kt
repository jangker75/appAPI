package net.ddns.liveapps.testapi
import io.reactivex.Observable
import retrofit2.http.GET
import retrofit2.http.POST

interface INetworkAPI {
    @GET("posts/")
    fun getAllPosts(): Observable<List<POST>>
}