package com.example.intentsarefun;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        findViewById(R.id.button_openScreenTwo).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Explicit Intent
                Intent i = new Intent(MainActivity.this, SecondActivity.class);
                startActivity(i);
            }
        });

        findViewById(R.id.button_openUdacityWebiste).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Implicit Intent
                String url = "https://www.udacity.com";
                Intent i = new Intent(Intent.ACTION_VIEW);
                i.setData(Uri.parse(url));
                startActivity(i);
            }
        });
    }
}
