package com.example.vt_intern_task_sunder;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

public class Expense_Login extends AppCompatActivity {
Spinner employee_name;
Button submit_button;
TextView password;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_expense_login);
        employee_name = findViewById(R.id.LOGIN_employee_name_spinner);
        submit_button = findViewById(R.id.LOGIN_submit);
        password = findViewById(R.id.LOGIN_password);

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

    submit_button.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            if(password.getText().toString().equals("1")){
                   startActivity(new Intent(Expense_Login.this,Expense_entry.class));
            }else
            {
                Toast.makeText(Expense_Login.this, "Invali", Toast.LENGTH_SHORT).show();
            }
        }
    });


    }
}