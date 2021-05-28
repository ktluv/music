package com.example.demo;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.ImageButton;

public class MainActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		
		Button play =(Button)findViewById(R.id.play);
		ImageButton xians =(ImageButton)findViewById(R.id.xians);
		ImageButton cast =(ImageButton)findViewById(R.id.bcast);
		ImageButton share =(ImageButton)findViewById(R.id.share);
		ImageButton video =(ImageButton)findViewById(R.id.video);
		xians.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Intent intent = new Intent(MainActivity.this,re.class);    
				startActivity(intent);
			}
		});
		play.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Intent play =new Intent(MainActivity.this,music.class);
				startActivity(play);
			}
		});
		cast.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Intent it = new Intent();
				it.setAction(Intent.ACTION_VIEW);//过滤器》》？？？
				startActivity(it);
			}
		});
		share.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Intent read=new Intent();
				read.setAction(Intent.ACTION_VIEW);
				read.setData(Uri.parse("https://y.music.163.com/m/"));
				startActivity(read);
			}
		});
		video.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Intent play =new Intent(MainActivity.this,video.class);
				startActivity(play);
			}
		});

	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		// Handle action bar item clicks here. The action bar will
		// automatically handle clicks on the Home/Up button, so long
		// as you specify a parent activity in AndroidManifest.xml.
		int id = item.getItemId();
		if (id == R.id.action_settings) {
			return true;
		}
		return super.onOptionsItemSelected(item);
	}
}
