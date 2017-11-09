package com.example.vinalpatel.androidlayouts;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

/**
 * Created by tech1 on 29/05/17.
 */

public class relativelayout extends Activity {

    EditText password;
    String  emailid;

    public void loginclick(View view){

        Intent out = new Intent(getApplicationContext(), tablelayout.class);
        out.putExtra("password", password.getText().toString() );
        out.putExtra("email",emailid);
        startActivity(out);
        finish();
    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.relative_layout);

        password = (EditText) findViewById(R.id.inputpassword);
        TextView email = (TextView) findViewById(R.id.label2);

        Intent in = getIntent();
        emailid = in.getStringExtra("email");
        email.setText(emailid);



    }
}
