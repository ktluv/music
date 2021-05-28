package com.example.demo;

import android.app.Activity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class LoginActivity extends Activity {
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.login);
		Button btn =(Button)findViewById(R.id.login);
		btn.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				String number =((EditText)findViewById(R.id.usrname)).getText().toString();
				String pwd =((EditText)findViewById(R.id.usrpwd)).getText().toString();
				boolean flag=false;
				for(int i=0;i<usersql.user.length;i++)
				{
					if(number.equals(usersql.user[i][0])) {
						if(pwd.equals(usersql.user[i][1])) {
							flag=true;
							break;
						}
					}
				}
				if(flag)
				{
					Intent main =new Intent(LoginActivity.this,MainActivity.class);
					startActivity(main);
				}
				else {
					Toast toast=Toast.makeText(LoginActivity.this, "ÄãÊäÈëµÄÕËºÅ»òÃÜÂë´íÎó£¡", Toast.LENGTH_SHORT);
					toast.setGravity(Gravity.BOTTOM, 0, 0);
					toast.show();
				}
			}
		});
		Button sign=(Button)findViewById(R.id.sign);
		sign.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Intent n=new Intent(LoginActivity.this,sign.class);
				startActivity(n);
			}
		});
		
	}
}
