package com.example.demo;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.Toast;

public class success extends Activity {
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
//		setContentView(R.layout.login);
		Intent k=getIntent();
		Bundle b=k.getExtras();
		{
			usersql.user[1][0]=b.getString("user");
			usersql.user[1][1]=b.getString("passwd");
		}
		Toast.makeText(getApplicationContext(), "×¢²á³É¹¦£¡",
			     Toast.LENGTH_SHORT).show();
		finish();
	}
}
