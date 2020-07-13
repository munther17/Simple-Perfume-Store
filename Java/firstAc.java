package com.example.muntheraloraini.myapplication;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;


public class firstAc extends Activity {

    static  String prerchase ="";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_first);



        }


        public void p1 (View view) {

        String p_1=" Eros Fragrance Collection    Price : 88 $ \n" ;

            Toast.makeText(getApplicationContext(),"Item Selected ",Toast.LENGTH_SHORT).show();




            listing(p_1);
        }
    public void p2 (View view) {

        String p_1=" Davidoff Cool Water Men's     Price : 500 $ \n" ;

        Toast.makeText(getApplicationContext(),"Item Selected ",Toast.LENGTH_SHORT).show();




        listing(p_1);
    }
    public void p3 (View view) {

        String p_1=" vara wing for men             Price : 50 $ \n" ;

        Toast.makeText(getApplicationContext(),"Item Selected ",Toast.LENGTH_SHORT).show();




        listing(p_1);
    }
    public void p4 (View view) {

        String p_1=" Acqua di Parma               Price : 200 $ \n" ;

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











    public void on(View view) {



        Intent i3 = new Intent(getApplicationContext(), MainActivity.class);
        startActivity(i3);
        finish();


    }

}
