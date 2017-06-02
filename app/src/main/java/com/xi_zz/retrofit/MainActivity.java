package com.xi_zz.retrofit;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;
import android.widget.ProgressBar;
import android.widget.TextView;

import retrofit.Callback;
import retrofit.RequestInterceptor;
import retrofit.RestAdapter;
import retrofit.RetrofitError;
import retrofit.client.Response;

public class MainActivity extends AppCompatActivity {

	private static final GitHubService SERVICE;

	static {
		RequestInterceptor requestInterceptor = new RequestInterceptor() {
			@Override
			public void intercept(RequestFacade request) {
				request.addHeader("Authorization", "Basic [your GitHub personal access token]");
			}
		};
		RestAdapter restAdapter = new RestAdapter
				.Builder()
				.setEndpoint("https://api.github.com")
				.setRequestInterceptor(requestInterceptor)
				.build();
		SERVICE = restAdapter.create(GitHubService.class);
	}

	private TextView resultText;
	private EditText usernameText;
	private ProgressBar progressBar;


	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		usernameText = (EditText) findViewById(R.id.text_username);
		resultText = (TextView) findViewById(R.id.text_user_info);
		progressBar = (ProgressBar) findViewById(R.id.progress_bar);
	}

	public void getUser(View view) {
		progressBar.setVisibility(View.VISIBLE);
		String username = usernameText.getText().toString();

		SERVICE.getUserInfo(username, new Callback<User>() {
			@Override
			public void success(User user, Response response) {
				resultText.setText(user.toString());
				progressBar.setVisibility(View.INVISIBLE);
			}

			@Override
			public void failure(RetrofitError error) {
				resultText.setText(error.getMessage());
				progressBar.setVisibility(View.INVISIBLE);
			}
		});
	}
}
