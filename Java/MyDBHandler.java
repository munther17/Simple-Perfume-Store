package com.example.muntheraloraini.myapplication;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.util.Log;



public class MyDBHandler extends SQLiteOpenHelper{
    //DB info
    private static final int DATABASE_VERSION = 1;
    private static final String DATABASE_NAME = "info.db";


    //Tables and its columns
    public static final String TABLE_NAME = "customer";
    public static final String COLUMN_RECID = "recID";
    public static final String COLUMN_PASS= "password";
    public static final String COLUMN_NAME = "name";
    public static final String COLUMN_ADDRESS = "address";
    public static final String COLUMN_PHONE = "phone";
    public MyDBHandler(Context context)
    {
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
    }


    @Override
    public void onCreate(SQLiteDatabase db) {
        // A SQL statement to create a table of three columns


        String sqlStmt = "CREATE TABLE " + TABLE_NAME + "(" +
                COLUMN_RECID   + " INTEGER PRIMARY KEY AUTOINCREMENT ," +
                COLUMN_NAME    + " TEXT,"   +
                COLUMN_PHONE   + " TEXT,"   +
                COLUMN_ADDRESS + " TEXT,"    +
                COLUMN_PASS    + " TEXT " +  ");";

        db.execSQL(sqlStmt);
    }


    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion)
    {
        db.execSQL("DROP TABLE IF EXISTS " + TABLE_NAME);
        Log.d("DB", "The table has been removed!");
        onCreate(db);
    }

    public void addRecord(String naStr,String psStr, String phStr,String adStr)
    {
        SQLiteDatabase db = getWritableDatabase();
        ContentValues aa = new ContentValues();
        aa.put(COLUMN_NAME,naStr);
        aa.put(COLUMN_PASS,psStr);
        aa.put(COLUMN_PHONE,phStr);
        aa.put(COLUMN_ADDRESS,adStr);

        db.insert(TABLE_NAME,null, aa);
        db.close();


    }


    public void delRecord(String name)
    {
        SQLiteDatabase db = getWritableDatabase();




        String [] bb ={name};

        db.delete("customer","name = ?", bb);
        db.close();



    }

    public void updateRecord(String name,String add) {
        SQLiteDatabase db = getWritableDatabase();
        ContentValues aa = new ContentValues();


        aa.put("address",add);
        String [] bb ={name};


        db.update("customer",aa,"name = ?",bb);
        db.close();



    }



}
