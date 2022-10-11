package com.example.a621j.managers;

import android.app.Application;
import android.content.Context;
import android.content.SharedPreferences;

import com.example.a621j.models.Users;
import com.google.gson.Gson;

public class PrefsManager  {
    Context context;
    SharedPreferences sharedPreferences;

    public PrefsManager(Context context, SharedPreferences sharedPreferences) {
        this.context=context;
        this.sharedPreferences = sharedPreferences;
    }


    public void saveData(Users users) {
       SharedPreferences.Editor editor = sharedPreferences.edit();
        Gson gson = new Gson();
        String json = gson.toJson(users);
        editor.putString("data", json);
        editor.apply();
    }

}
