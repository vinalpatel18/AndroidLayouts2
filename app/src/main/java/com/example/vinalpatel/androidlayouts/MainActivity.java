package com.example.vinalpatel.androidlayouts;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    public void gotolinear(View view){

        Log.d(" button click", "linearlayout");

        Intent i = new Intent(getApplicationContext(), linearlayout.class);

        startActivity(i);
        finish();

    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


}
