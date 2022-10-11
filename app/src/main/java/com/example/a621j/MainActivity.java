package com.example.a621j;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.example.a621j.managers.MyManager;
import com.example.a621j.managers.PrefsManager;
import com.example.a621j.models.Users;
import com.google.gson.Gson;

public class MainActivity extends AppCompatActivity {

    Button save;
    EditText age;
    EditText salary;
    EditText workH;
    EditText timeTable;
    Context context;

    SharedPreferences sharedPreferences;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

      sharedPreferences = getSharedPreferences("data", Context.MODE_PRIVATE);
        initViews();
    }

    public void initViews() {
        age = findViewById(R.id.editTextDataAge_id);
        salary = findViewById(R.id.editTextDataSalary_id);
        workH = findViewById(R.id.editTextDataWorkH_id);
        timeTable = findViewById(R.id.editTextDataAdayOff_id);

        save = findViewById(R.id.b_1_saveData_id);

        save.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                saveD();
            }
        });

    }

    public void saveD() {
        String getAge = age.getText().toString().trim();
        String getSalary = salary.getText().toString().trim();
        String getWorkH = workH.getText().toString().trim();
        String getTimeTable = timeTable.getText().toString().trim();

        Users users = new Users();
        users.setAge(getAge);
        users.setSalary(getSalary);
        users.setWorkH(getWorkH);
        users.setTimeTable(getTimeTable);

       new PrefsManager(context,sharedPreferences).saveData(users);


    }
}