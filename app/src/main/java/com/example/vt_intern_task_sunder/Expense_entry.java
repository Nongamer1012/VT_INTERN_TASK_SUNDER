package com.example.vt_intern_task_sunder;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;


public class Expense_entry extends AppCompatActivity {
TextView employee_name;
Spinner expense_type;
Button add,back;
EditText amount;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_expense_entry);
        employee_name = findViewById(R.id.ENTRY_employee_name);
        expense_type = findViewById(R.id.ENTRY_expense_type);
            employee_name.setText("Employee "+storage.EMPLOYEE_INDEX);
        add = findViewById(R.id.ENTRY_add);
        back = findViewById(R.id.ENTRY_back);
        amount = findViewById(R.id.ENTRY_expense_amount);
        amount.setHint("Enter value");
        expense_type.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                if(expense_type.getSelectedItem().toString().equals("Train"))
                {
                    storage.EXPENSE_INDEX=2;
                }
                if(expense_type.getSelectedItem().toString().equals("Flight"))
                {
                    storage.EXPENSE_INDEX=3;
                }
                if(expense_type.getSelectedItem().toString().equals("Medical"))
                {
                    storage.EXPENSE_INDEX=4;
                }
                if(expense_type.getSelectedItem().toString().equals("Other"))
                {
                    storage.EXPENSE_INDEX=5;
                }

            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(Expense_entry.this,MainActivity.class));
            }
        });

        add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                storage.employee_details[storage.EMPLOYEE_INDEX][storage.EXPENSE_INDEX] += Integer.parseInt(amount.getText().toString());
//                expense_type.setSelected(false);
                amount.setText("");
                amount.setHint("Enter value");
                Toast.makeText(Expense_entry.this, "Stored Successfully", Toast.LENGTH_SHORT).show();
            }
        });

    }
}