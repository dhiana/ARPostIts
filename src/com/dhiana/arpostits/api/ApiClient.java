package com.dhiana.arpostits.api;

import com.dhiana.arpostits.model.Project;
import com.dhiana.arpostits.model.Item;

import java.util.List;

import retrofit.Callback;
import retrofit.RestAdapter;
import retrofit.http.GET;
import retrofit.http.Path;
import retrofit.http.Query;

public class ApiClient {
    private static ARPostItsApiInterface sARPostItsService;

    public static ARPostItsApiInterface getARPostItsApiClient() {
        if (sARPostItsService == null) {
            RestAdapter restAdapter = new RestAdapter.Builder()
                    .setEndpoint("http://arpostits.herokuapp.com/api/v1")
                    .build();

            sARPostItsService = restAdapter.create(ARPostItsApiInterface.class);
        }

        return sARPostItsService;
    }

    public interface ARPostItsApiInterface {
        @GET("/project/{id}/?format=json")
        void getProjects(Callback<List<Project>> callback);

        @GET("/project/{id}/?format=json")
        void getProject(@Path("id") int id, Callback<Project> callback);
    }
}
