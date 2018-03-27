package com.example.android.takehomeassignment07_stephaniey;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Movie;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void startActionBarActivity(View view) {
        Intent intent = new Intent(this, ActionBarActivity.class);
        startActivity(intent);
    }
}
