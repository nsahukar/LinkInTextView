package com.dev.nik;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;

public class Method2Activity extends Activity {
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		final TextView textView = (TextView) findViewById(R.id.method1);
		textView.setText(getResources().getString(R.string.content2));
		
	}

}
