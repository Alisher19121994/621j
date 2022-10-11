package com.example.a621j.managers;

import android.content.SharedPreferences;

import com.example.a621j.App;
import com.example.a621j.models.Users;
import com.google.gson.Gson;

public class MyManager  {
    SharedPreferences sharedPreferences  = new App().getMySharedPreferences();

    public void saveData(Users users) {
        SharedPreferences.Editor editor = sharedPreferences.edit();
        Gson gson = new Gson();
        String json = gson.toJson(users);
        editor.putString("data", json);
        editor.apply();
    }

}
