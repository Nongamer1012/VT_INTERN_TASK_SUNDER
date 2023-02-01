package com.example.vt_intern_task_sunder;

public class storage {
    public static int once=0;
    public static int EMPLOYEE_INDEX=0,EXPENSE_INDEX;//index for globally storing related variables in below multi-dimensional array
    //convention of bellow array
    //Employee_index(0,0) , password(0,1) , Train(0,2) , Flight (0,3) , Medical(0,4) , Other (0,5) , Total(0,6)

   public static int[][] employee_details = new int[10][10];

}
