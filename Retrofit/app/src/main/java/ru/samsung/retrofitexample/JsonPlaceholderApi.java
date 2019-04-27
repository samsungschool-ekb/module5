package ru.samsung.retrofitexample;

import java.util.List;

import io.reactivex.Single;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface JsonPlaceholderApi {
    @GET("/posts")
    Single<List<Post>> getPostList();

    @GET("/posts")
    Single<List<Post>> getPostById(@Query("id") int id);

}
