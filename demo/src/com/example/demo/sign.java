package com.example.demo;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;

public class sign extends Activity {
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.reg);
		Button submit=(Button)findViewById(R.id.submit);
		submit.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				String usr=((EditText)findViewById(R.id.user)).getText().toString();
				String pwd=((EditText)findViewById(R.id.passwd)).getText().toString();
//				String email=((EditText)findViewById(R.id.email)).getText().toString();	
				Intent sub=new Intent(sign.this,success.class);
				Bundle bundle =new Bundle();
				bundle.putCharSequence("user", usr);
				bundle.putCharSequence("passwd", pwd);
				sub.putExtras(bundle);
				startActivity(sub);
				finish();
			}
		});
	}
}
