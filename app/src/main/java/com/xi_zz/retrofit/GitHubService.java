package com.xi_zz.retrofit;


import retrofit.Callback;
import retrofit.http.GET;
import retrofit.http.Path;

public interface GitHubService {
	@GET("/users/{user}")
	void getUserInfo(@Path("user") String user, Callback<User> response);
}
