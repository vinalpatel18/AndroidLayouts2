package com.example.vinalpatel.androidlayouts;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;

/**
 * Created by tech1 on 29/05/17.
 */

public class linearlayout extends Activity {


    EditText email;

    public void loginclick(View view){

        Log.d(" button click", "linearlayout");

        Intent i = new Intent(getApplicationContext(), relativelayout.class);
        i.putExtra("email", email.getText().toString() );
        Log.d(" button click", email.getText().toString());
        startActivity(i);
        finish();
    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.linear_layout);

        email = (EditText) findViewById(R.id.inputEmailaddress);



    }
}
