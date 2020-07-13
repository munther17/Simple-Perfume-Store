package com.example.muntheraloraini.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class signUp extends Activity {

    private EditText etName,etPhone,etAdd,etPass;
    private MyDBHandler dbHandler;
    private SQLiteDatabase db;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up);

        etName = (EditText)findViewById(R.id.edName);
        etPass = (EditText)findViewById(R.id.edPass);
        etPhone = (EditText)findViewById(R.id.edPhon);
        etAdd = (EditText)findViewById(R.id.edAdd);


        dbHandler = new MyDBHandler(getApplicationContext());
        db = dbHandler.getWritableDatabase();




    }



    //Add a record to the database
    public void addButtonClicked(View view){

        String naStr = etName.getText().toString();
        String psStr = etPass.getText().toString();
        String phStr = etPhone.getText().toString();
        String adStr = etAdd.getText().toString();



        if(naStr.isEmpty() || phStr.isEmpty() || psStr.isEmpty() || adStr.isEmpty() ){
            Toast.makeText(getApplicationContext(),"Please, fill-in missing data",Toast.LENGTH_LONG).show();
            return;
        }




        dbHandler.addRecord(naStr,psStr,phStr,adStr);

        String tstMsg;
        tstMsg = "The Account : " + naStr +" is inserted";
        Toast.makeText(getApplicationContext(),tstMsg,Toast.LENGTH_LONG).show();
        etName.setText("");
        etPass.setText("");
        etPhone.setText("");
        etAdd.setText("");

    }


    public void backTo(View view){
        Intent t = new Intent(this,MainActivity.class);
        startActivity(t);
        dbHandler.close();
        finish();
    }
}
