package com.example.restfulapiandroid;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.widget.Toast;

import com.example.restfulapiandroid.api.APiClient;
import com.example.restfulapiandroid.api.ApiService;
import com.example.restfulapiandroid.api.PostsResponse;
import com.example.restfulapiandroid.models.Data;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainActivity extends AppCompatActivity {

    public static final String TAG = "MainActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        getPost();
    }

    /**
     *
     * Method Test
     */
    private  void getPost(){


        ApiService service = APiClient.getService();

        service.getAllPosts().enqueue(new Callback<PostsResponse>() {
            @Override
            public void onResponse(@NonNull Call<PostsResponse> call, @NonNull Response<PostsResponse> response) {

                if(response.isSuccessful()&& response.body() !=null){
                    //fetch data from api is sucesss
                    Log.i(TAG,"onResponse: im here" );

                    for(Data data : response.body().getData()){
                        Log.i(TAG,"onResponse: " + data);

                        Toast.makeText(MainActivity.this,"lol"+ data, Toast.LENGTH_LONG).show();

                    }
                }
            }

            @Override
            public void onFailure(@NonNull Call<PostsResponse> call, @NonNull Throwable t) {

                Toast.makeText(MainActivity.this,""+ t.getMessage(), Toast.LENGTH_LONG).show();
                Log.i(TAG,"onFailure : " + t);
            }
        });
    }
}
