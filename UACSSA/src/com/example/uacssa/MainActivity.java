package com.example.uacssa;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

/**
 *
 */
public class MainActivity extends Activity {
	private Button bbs,map;
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		bbs = (Button) findViewById(R.id.button1);
		map = (Button) findViewById(R.id.button2);
		bbs.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Intent tobbs = new Intent();
				tobbs.setClass(MainActivity.this, BbsBrowserActivity.class);
				startActivity(tobbs);
			}
		});
		map.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Intent tobbs = new Intent();
				tobbs.setClass(MainActivity.this, MapActivity.class);
				startActivity(tobbs);
			}
		});
		
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

}
