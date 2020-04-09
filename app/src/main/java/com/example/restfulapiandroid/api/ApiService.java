package com.example.restfulapiandroid.api;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;

public interface ApiService {

    /**
     *
     * Get All Employees
     */
    @GET("employees") // Get All Employees
    Call<PostsResponse> getAllPosts();

    /**
     *
     * Get  Employees by ID
     */

    @GET("/api/v1/employee/{id}") // Get  Employee by id
    Call<PostsResponse> getPost(
            @Path("id") int id
    );
}
