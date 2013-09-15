package com.example.myfirstapp;

import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.Random;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends Activity 
{

	public final static String EXTRA_MESSAGE = "com.example.myfirstapp.MESSAGE"; 
	//define keys for intent extras using your app's package name as a prefix. Ensures uniqueness in App ecosystem.


	@Override
	protected void onCreate(Bundle savedInstanceState) 
	{
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
	}


	@Override
	public boolean onCreateOptionsMenu(Menu menu) 
	{
		// Inflate the menu items for use in the action bar
		MenuInflater inflater = getMenuInflater();
		inflater.inflate(R.menu.main_activity_actions, menu);
		return super.onCreateOptionsMenu(menu);
	}

	/**Called when the user clicks the Send button */
	public void sendMessage (View view)
	{
		//Intent intent = new Intent(this, DisplayMessageActivity.class);
		//EditText editText = (EditText) findViewById(R.id.edit_message);

		//Randomize Text
		String message = Randomize(16);

		//intent.putExtra(EXTRA_MESSAGE, message);
		
		TextView t = (TextView) findViewById(R.id.editText2);
		t.setText(message);
		//startActivity(intent);
	}


	private String Randomize(int size) 
	{
		// Make the symbol list!
		String symbols = "0123456789abcdefghijklmnopqrstuvwxyz!@#$%^&*()-=+[]{}"; //List is 53 elements long

		// Initialize the randomized string
		String output = "";

		// Initialize SecureRandom
		SecureRandom rnd = new SecureRandom();

		for (int i = 0; i < size; i++)
		{
				output += symbols.charAt(rnd.nextInt(53));
		}

		return output;

	}

}
