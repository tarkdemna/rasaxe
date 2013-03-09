package com.junior.rasaxe;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;

public class MainActivity extends Activity {
	//public final static String USER_NAME = "com.junior.rasaxe.USERNAMEMESSAGE";
	//public final static String USER_PASSWORD = "com.junior.rasaxe.PASSWORDMESSAGE";
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
	}

	public void topageSign(View view) {
	    // Displays the activity Sign In
	    Intent intent = new Intent(this, DisplaySignInActivity.class);
	    startActivity(intent);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

}
