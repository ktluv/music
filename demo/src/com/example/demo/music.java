package com.example.demo;

import java.io.IOException;

import android.app.Activity;
import android.content.res.AssetFileDescriptor;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class music extends Activity{
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.music);
		final MediaPlayer play2 = new MediaPlayer();
		AssetFileDescriptor file=getResources().openRawResourceFd(R.raw.music);
		Button play =(Button)findViewById(R.id.music_p);
		Button stop =(Button)findViewById(R.id.music_s);
		try {
            play2.setDataSource(file.getFileDescriptor(), file.getStartOffset(),
                    file.getLength());
            play2.prepare();
            file.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
		play.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				play2.setVolume(0.5f, 0.5f);
				play2.setLooping(true);
				play2.start();//²¥·Å
			}
		});
		stop.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				play2.pause();//ÔÝÍ£
			}
		});
		
	}
}