package com.vermeersch.vincent.guitune.controller;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.vermeersch.vincent.guitune.R;

public class MainActivity extends AppCompatActivity {

    private Button mTunguit;
    private Button mText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mTunguit = (Button) findViewById(R.id.activity_main_accorded);
        mText = (Button) findViewById(R.id.activity_text);

        mTunguit.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                // User wants tune
                Intent tuneActivityIntent = new Intent(MainActivity.this, TuneActivity.class);
                startActivity(tuneActivityIntent);
            }
        } );

        mText.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                // User wants tune
                Intent textActivityIntent = new Intent(MainActivity.this, TextActivity.class);
                startActivity(textActivityIntent);
            }
        } );
    }
}
