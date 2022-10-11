package com.example.a621j;

import android.app.Application;
import android.content.ContentValues;
import android.content.Context;
import android.content.SharedPreferences;

public class App extends Application {
    public SharedPreferences mySharedPreferences;
    @Override
    public void onCreate() {
        super.onCreate();
        mySharedPreferences = getSharedPreferences("MyShared", Context.MODE_PRIVATE);
    }

    public SharedPreferences getMySharedPreferences() {
        return mySharedPreferences;
    }
}
