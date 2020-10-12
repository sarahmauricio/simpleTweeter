package com.codepath.apps.restclienttemplate;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class ComposeActivity1 extends AppCompatActivity {


    public static final int MAX_TWEET_LENGTH = 140;
    EditText etCompose;
    Button btnTweet;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_compose1);

        etCompose = findViewById(R.id.etCompose);
        btnTweet = findViewById(R.id.btnTweet);

        // Set a click listener on the button
        btnTweet.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String tweetContent = etCompose.getText().toString();
                if(tweetContent.isEmpty()){
                    Toast.makeText(ComposeActivity1.this, "Sorry, your tweet can't be empty", Toast.LENGTH_LONG).show();
                    return;
                }
                if(tweetContent.length()> MAX_TWEET_LENGTH){
                    Toast.makeText(ComposeActivity1.this, "Sorry, your tweet is too long", Toast.LENGTH_LONG).show();
                    return;
                }

                Toast.makeText(ComposeActivity1.this, tweetContent, Toast.LENGTH_LONG).show();

            }
        });
        //Make an API call to twitter to publish the tweet
    }
}