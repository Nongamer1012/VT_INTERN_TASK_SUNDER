package com.example.vt_intern_task_sunder;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;


public class MainActivity extends AppCompatActivity {
Button add_expense,get_sumamry;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        add_expense = findViewById(R.id.add_expense);
        get_sumamry = findViewById(R.id.get_summary);
        add_expense.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this, Expense_Login.class));
            }
        });

        if(storage.once==0)
        {
            for(int i=1;i<=5;i++)
            {
                storage.employee_details[i][1] = 1;

            }
            for (int i=0;i<=5;i++)
            {
                for(int j=0;j<=6;j++)
                {
                    storage.employee_details[i][j]=0;
                }
            }
            storage.once=1;
        }


        get_sumamry.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this, Select_Employee.class));
            }
        });


    }
}