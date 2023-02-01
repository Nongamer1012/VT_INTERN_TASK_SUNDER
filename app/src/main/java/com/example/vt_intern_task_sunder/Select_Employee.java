package com.example.vt_intern_task_sunder;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.Spinner;

public class Select_Employee extends AppCompatActivity {
Spinner employee_name;
Button get_summary;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_select_employee);
        employee_name = findViewById(R.id.SUMMARY_employee_name);
        get_summary = findViewById(R.id.SUMMARY_get_summary);

        employee_name.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                if(employee_name.getSelectedItem().toString().equals("Employee 1"))
                {
                    storage.EMPLOYEE_INDEX=1;
                }
                if(employee_name.getSelectedItem().toString().equals("Employee 2"))
                {
                    storage.EMPLOYEE_INDEX=2;
                }
                if(employee_name.getSelectedItem().toString().equals("Employee 3"))
                {
                    storage.EMPLOYEE_INDEX=3;
                }
                if(employee_name.getSelectedItem().toString().equals("Employee 4"))
                {
                    storage.EMPLOYEE_INDEX=4;
                }
                if(employee_name.getSelectedItem().toString().equals("Employee 5"))
                {
                    storage.EMPLOYEE_INDEX=5;
                }


            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });
        get_summary.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(Select_Employee.this,Summary_Page.class));
            }
        });


    }
}