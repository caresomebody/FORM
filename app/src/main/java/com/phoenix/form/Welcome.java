package com.phoenix.form;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Welcome extends AppCompatActivity {
    Button signIn;
    Button signUp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_welcome);

        signIn= (Button) findViewById(R.id.SignIn);
        signUp= (Button) findViewById(R.id.SignUp);

        signIn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent signIn= new Intent(Welcome.this,SignIn.class);
                startActivity(signIn);
            }
        });

        signUp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent signUp= new Intent(Welcome.this,SignUp.class);
                startActivity(signUp);
            }
        });

    }
}
