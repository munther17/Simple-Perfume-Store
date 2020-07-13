package com.example.muntheraloraini.myapplication;

import android.app.Activity;
import android.content.Intent;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MyAccount extends Activity {

    private EditText etNAME,naTxtView;
    private MyDBHandler dbHandler;
    private SQLiteDatabase database;
    private SQLiteDatabase db;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my_account);

        etNAME = (EditText)findViewById(R.id.editText1);
        naTxtView = (EditText) findViewById(R.id.addtextView);
        dbHandler = new MyDBHandler(this);
        dbHandler = new MyDBHandler(getApplicationContext());
        database = dbHandler.getWritableDatabase();
    }

    public void shwIDInfo(View V){

        String name = etNAME.getText().toString();

        if(name.isEmpty()){

            Toast.makeText(getApplicationContext(),"Please, fill-in missing data",Toast.LENGTH_LONG).show();
            return;
        }

        String sqltStmt = "Select * from " + dbHandler.TABLE_NAME
                + " where " + dbHandler.COLUMN_NAME + " = ?";

        Cursor c = database.rawQuery(sqltStmt, new String[] {name});

        if(!c.moveToFirst()){
            Toast.makeText(getApplicationContext(),"This User Name Is't Exist",Toast.LENGTH_LONG).show();
            return;
        };
        naTxtView.setText(c.getString(3));
        c.close();
    }


    public void delTsk(View view) {
        String id = etNAME.getText().toString();


        if (id.isEmpty()) {
            Toast.makeText(getApplicationContext(), "Please, fill-in missing data", Toast.LENGTH_LONG).show();
            return;
        }


        String nameStr = etNAME.getText().toString();


        dbHandler.delRecord(nameStr);

        Toast.makeText(getApplicationContext(), "Account deleted", Toast.LENGTH_LONG).show();

    }


    public void upTsk(View view) {
        String id = etNAME.getText().toString();


        if (id.isEmpty()) {
            Toast.makeText(getApplicationContext(), "Please, fill-in missing data", Toast.LENGTH_LONG).show();
            return;
        }


        String nameStr = etNAME.getText().toString();
        String addStr = naTxtView.getText().toString();



        dbHandler.updateRecord(nameStr,addStr);

        Toast.makeText(getApplicationContext(), "address Updated", Toast.LENGTH_LONG).show();

    }







    public void backTo2(View view){
        Intent t = new Intent(this,MainActivity.class);
        startActivity(t);
        finish();
    }
}
