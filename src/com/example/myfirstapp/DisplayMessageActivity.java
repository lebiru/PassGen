package com.example.myfirstapp;

import android.annotation.TargetApi;
import android.app.Activity;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.view.MenuItem;
import android.widget.TextView;

public class DisplayMessageActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		
		// Turns the Home icon into a back icon for going to parent of this screen.
		getActionBar().setDisplayHomeAsUpEnabled(true);

		// Get the message from the intent
		Intent intent = getIntent();
		String message = intent.getStringExtra(MainActivity.EXTRA_MESSAGE);

		// Create the text view
		TextView textView = new TextView(this);
		textView.setTextSize(40);
		textView.setText(message);

		// Set the text view as the activity layout
		setContentView(textView);
	}

	/**
	 * Set up the {@link android.app.ActionBar}, if the API is available.
	 */
	@TargetApi(Build.VERSION_CODES.HONEYCOMB)
	private void setupActionBar() {
		if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.HONEYCOMB) {
			getActionBar().setDisplayHomeAsUpEnabled(true);
		}
	}

	@Override
	public boolean onOptionsItemSelected(MenuItem item) 
	{
		// Handle presses on the action bar items
		switch (item.getItemId())
		{
			case R.id.action_search:
				openSearch();
				return true;
				
			case R.id.action_settings:
				openSettings();
				return true;
				
			default:
				return super.onOptionsItemSelected(item);

		}
	}

	private void openSearch() {
		// TODO Auto-generated method stub
		
	}

	private void openSettings() {
		// TODO Auto-generated method stub
		
	}

}
