package com.example.muntheraloraini.myapplication;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class secondAc extends Activity {
    static  String prerchase ="";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
    }








    public void p1 (View view) {

        String p_1=" Miss Dior by Christian Dior,     Price : 70 $ \n" ;

        Toast.makeText(getApplicationContext(),"Item Selected ",Toast.LENGTH_SHORT).show();




        listing(p_1);
    }
    public void p2 (View view) {

        String p_1=" Chance Eau de Toilette     Price : 80 $ \n" ;

        Toast.makeText(getApplicationContext(),"Item Selected ",Toast.LENGTH_SHORT).show();




        listing(p_1);
    }
    public void p3 (View view) {

        String p_1=" BOIS 100ml             Price : 100 $ \n" ;

        Toast.makeText(getApplicationContext(),"Item Selected ",Toast.LENGTH_SHORT).show();




        listing(p_1);
    }
    public void p4 (View view) {

        String p_1=" Women's  Fraiche Pour Elle 90ml Spray              Price : 76 $ \n" ;

        Toast.makeText(getApplicationContext(),"Item Selected ",Toast.LENGTH_SHORT).show();




        listing(p_1);
    }











    public void listing(String aa  ){

        prerchase += aa;


    }


    public void chekout(View v ){



        //print1(prerchase);

        Intent t1=new Intent(getApplicationContext(),Checkout.class);

        t1.putExtra("ss",prerchase);
        prerchase="";

        startActivity(t1);

        finish();


    }




    public void on2(View view) {



        Intent i4 = new Intent(getApplicationContext(), MainActivity.class);
        startActivity(i4);
        finish();


    }

}


