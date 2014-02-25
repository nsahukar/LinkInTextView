package com.dev.nik;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.text.Html;
import android.text.SpannableString;
import android.text.Spanned;
import android.text.method.LinkMovementMethod;
import android.text.style.ClickableSpan;
import android.view.Menu;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		final TextView method1TextView = (TextView) findViewById(R.id.method1);
		final SpannableString content1 = new SpannableString(Html.fromHtml(getResources().getString(R.string.method1)));
		
		final ClickableSpan clickableSpan = new ClickableSpan() {
			
			@Override
			public void onClick(View widget) {
				startActivity(new Intent(MainActivity.this, Method1Activity.class));
			}
		};
		// following is the manual spanning i've talked about. See those numbers, 375 and 379.
		// Those are manually done to accurately find 'here' word in the complete text.
		content1.setSpan(clickableSpan, 375, 379, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
		method1TextView.setText(content1);
		method1TextView.setMovementMethod(LinkMovementMethod.getInstance());
		
		final TextView method2TextView = (TextView) findViewById(R.id.method2);
		final SpannableString content2 = new SpannableString(Html.fromHtml(getResources().getString(R.string.method2)));
		method2TextView.setText(content2);
		method2TextView.setMovementMethod(LinkMovementMethod.getInstance());
		
		
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

}
