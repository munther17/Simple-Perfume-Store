package com.example.muntheraloraini.myapplication;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class Checkout extends Activity {

    private TextView  textViewaa;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_checkout);

        textViewaa = (TextView) findViewById(R.id.textView3);

        Intent data = getIntent();

        String order =  data.getStringExtra( "ss") ;

        textViewaa.setText(order);


    }



    public void on(View view) {



        Intent i3 = new Intent(getApplicationContext(), MainActivity.class);
        startActivity(i3);
        finish();


    }





}


