package com.example.muntheraloraini.myapplication;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;


public class sginIn extends Activity {



    private EditText nme1 ,pas1;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sgin_in);
        nme1=(EditText)findViewById(R.id.editText1);
        pas1=(EditText)findViewById(R.id.editText2);


    }






    public void signin(View view){

        String name1 = nme1.getText().toString();
        String pass1 = pas1.getText().toString();
        Intent t = new Intent(this,MainActivity.class);
        t.putExtra("name1",name1);
        t.putExtra("pass1",pass1);
        startActivity(t);
        finish();
    }








}
