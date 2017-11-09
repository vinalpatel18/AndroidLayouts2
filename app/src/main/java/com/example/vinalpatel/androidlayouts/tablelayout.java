package com.example.vinalpatel.androidlayouts;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import com.example.tech1.androidlayout.R;

/**
 * Created by tech1 on 29/05/17.
 */

public class tablelayout extends Activity{
    TextView Email;
    TextView password;

    public void Close(View view){

     finish();


    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.table_layout);

        Email =(TextView) findViewById(R.id.textview4);
        password =(TextView) findViewById(R.id.textview5);

        Intent in = getIntent();

        Email.setText(in.getStringExtra("email"));
        password.setText(in.getStringExtra("password"));



    }
}


