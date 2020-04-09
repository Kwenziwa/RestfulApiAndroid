package com.example.restfulapiandroid.api;

import com.example.restfulapiandroid.models.Data;
import com.example.restfulapiandroid.models.Data;

import java.util.List;

public class PostsResponse {


    private String error;
    private List<Data> data ;

    public PostsResponse(String error, List<Data> data) {
        this.error = error;
        this.data = data;
    }

    public String getError() {
        return error;
    }

    public void setError(String error) {
        this.error = error;
    }

    public List<Data> getData() {
        return data;
    }

    public void setData(List<Data> data) {
        this.data = data;
    }
}
