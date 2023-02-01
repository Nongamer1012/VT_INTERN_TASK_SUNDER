package com.example.vt_intern_task_sunder;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

public class Summary_Page extends AppCompatActivity {
String buffer = "";
TextView TITLE,RESULT;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_summary_page);
        TITLE = findViewById(R.id.SUMMARY_title);
        RESULT = findViewById(R.id.SUMMARY_result);
        for (int i=2;i<=5;i++)
        {

            storage.employee_details[storage.EMPLOYEE_INDEX][6]+=storage.employee_details[storage.EMPLOYEE_INDEX][i];

        }
        buffer = "\nTrain : "+storage.employee_details[storage.EMPLOYEE_INDEX][2] + "\nMedical : "+storage.employee_details[storage.EMPLOYEE_INDEX][3] + "\nFlight : "+storage.employee_details[storage.EMPLOYEE_INDEX][4]+"\nOther : " + storage.employee_details[storage.EMPLOYEE_INDEX][5] + "\nTOTAL EXPENSES: " +storage.employee_details[storage.EMPLOYEE_INDEX][6];
        TITLE.setText("Summary of Employee "+storage.EMPLOYEE_INDEX);
        RESULT.setText(buffer);


    }
}