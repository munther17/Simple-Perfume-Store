package com.example.muntheraloraini.myapplication;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.Toast;

public class MainActivity extends Activity {


    ImageButton a;
    ImageButton b;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



    a=(ImageButton) findViewById(R.id.image1);

        a.setOnClickListener(new View.OnClickListener()

    {
        @Override
        public void onClick (View v){




            Intent i1 = new Intent(getApplicationContext(), firstAc.class);
        startActivity(i1);
        finish();


    }
    });




    b=(ImageButton) findViewById(R.id.image2);

        b.setOnClickListener(new View.OnClickListener()

    {
        @Override
        public void onClick (View v){


          //  Toast.makeText(MainActivity.this,"its work11",Toast.LENGTH_LONG).show();


        Intent i2 = new Intent(getApplicationContext(), secondAc.class);
        startActivity(i2);
        finish();




    }
    });






}




    public void sign1(View view){
        Intent t = new Intent(this,signUp.class);
        startActivity(t);
        finish();
    }

    public void sign2(View view){
        Intent t1 = new Intent(this,sginIn.class);
        startActivity(t1);
        finish();
    }



    public void account1(View view){
        Intent t = new Intent(this,MyAccount.class);
        startActivity(t);
        finish();
    }
}
