package com.example.utsakb2022;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.util.Log;

public class DataHelper extends SQLiteOpenHelper {
    private static final String DATABASE_NAME = "mahasiswa.db";
    private static final int DATABASE_VERSION = 1;
    public DataHelper(Context context) {
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
    }
    @Override
    public void onCreate(SQLiteDatabase db) {
        //TODO Auto-generade method stub
        String sql = "create table biodata(" +
                "nim integer primary key," +
                "nama text null," +
                "kls text null," +
                "prodi text null);";
        Log.d("Data","onCreate: " + sql);
        db.execSQL(sql);
        sql = "INSERT INTO biodata (nim,nama,kls,prodi) VALUES ('10118340','Muhammad Umar Al Fajar','IF8','Teknik Informatika');";
        db.execSQL(sql);
    }
    @Override
    public void onUpgrade(SQLiteDatabase arg0, int arg1, int arg2) {
        //TODO Auto-generated method stub
    }
}
