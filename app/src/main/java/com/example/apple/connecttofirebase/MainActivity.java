package com.example.apple.connecttofirebase;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    void onButtonCLick(View v){

        String message = ((EditText)findViewById(R.id.editText)).getText().toString().trim();

        ((TextView)findViewById(R.id.preview)).setText(message+firebaseRef.getInstance().count);
        //Adding values

        firebaseRef.getInstance().myRef.child("message"+firebaseRef.getInstance().count).setValue(message);
        firebaseRef.getInstance().myRef.push().setValue(message);
        firebaseRef.getInstance().count++;
    }
}
