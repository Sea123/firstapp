package com.example.myfirstapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.app.ActionBarActivity;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.TextView;

public class GuessingGame extends ActionBarActivity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		Intent intent = getIntent();
		setContentView(R.layout.activity_guessing_game);
		boolean playing=true;
		int choice = (int) Math.random() * 21, wins = 0, lose = 0, guesses = 0, win = 0;
		TextView disp = new TextView(this);
		disp.setText("What number have I generated? \n hint its between 0 and 20");
		EditText edit = new EditText(this);
		setContentView(disp);
		/*
		while(playing){
			if(guesses == 20){
				playing = false;
				guesses = 0;
				lose++;
				disp.setText("Too many guesses play again? 1: yes 2: no");
				edit.addTextChangedListener(null);
			}
			guesses++;
		  }
		switch(win){
			case 1:
				if(wins < lose)
					disp.setText("Do you always quit when you start to succeed?");
				else if(wins > lose){
					disp.setText("your just afraid I'll beat you next time");
				}else{
					disp.setText("until we meet again");
				}	
				setContentView(disp);
				break;
			default:
				disp.setText("how dare you choose to abandon me D:<");
				setContentView(disp);
				break;
		}
		setContentView(disp);
		*/
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {

		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.guessing_game, menu);
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

	/**
	 * A placeholder fragment containing a simple view.
	 */
	public static class PlaceholderFragment extends Fragment {

		public PlaceholderFragment() {
		}

		@Override
		public View onCreateView(LayoutInflater inflater, ViewGroup container,
				Bundle savedInstanceState) {
			View rootView = inflater.inflate(R.layout.fragment_guessing_game,
					container, false);
			return rootView;
		}
	}

}
