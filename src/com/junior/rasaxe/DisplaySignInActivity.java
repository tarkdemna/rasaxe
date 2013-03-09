package com.junior.rasaxe;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.widget.EditText;

public class DisplaySignInActivity extends Activity {
	public final static String USER_NAMEINTENT = "com.junior.rasaxe.USERNAMEMESSAGE";
	public final static String USER_PASSWORDINTENT = "com.junior.rasaxe.USERPASSWORDMESSAGE";
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_display_sign_in);
        // Make sure we're running on Honeycomb or higher to use ActionBar APIs

	}
	
	public void sendSignIn(View view) {
		Intent intent = new Intent(this, ChatActivity.class);
	    EditText editUsernameText = (EditText) findViewById(R.id.edit_username);
	    //EditText editPasswordText = (EditText) findViewById(R.id.edit_password);
	    String username = editUsernameText.getText().toString();
	    //String password = editPasswordText.getText().toString();
	    String password = "tietie999";
	    intent.putExtra(USER_NAMEINTENT, username);
	    intent.putExtra(USER_PASSWORDINTENT, password);
	    startActivity(intent);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.display_sign_in, menu);
		return true;
	}

}
