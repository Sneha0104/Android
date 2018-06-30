package com.example.snehasaj.nhpc;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.TextView;

public class Employeedirec extends AppCompatActivity {

    private  TextView emp_direc;
    private  EditText last_Name;
    private  EditText first_Name;
    private  EditText title;
    private  EditText id;
    private  EditText department;
    private  EditText dept_id;
    private  EditText phno;
    private  EditText city;
    private  EditText email;
    private  EditText dob;
    private  EditText doj;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_employeedirec);
        emp_direc = (TextView)findViewById(R.id.empdir);
       last_Name = (EditText)findViewById(R.id.edit_lastname);
       first_Name = (EditText)findViewById(R.id.edit_firstname);
       title = (EditText)findViewById(R.id.edit_title);
       id = (EditText)findViewById(R.id.edit_id);
       department = (EditText)findViewById(R.id.edit_dept);
       dept_id = (EditText)findViewById(R.id.edit_dept_id);
       phno= (EditText)findViewById(R.id.edit_phno);
       city = (EditText)findViewById(R.id.edit_city);
       email = (EditText)findViewById(R.id.edit_emailadd);
       dob = (EditText)findViewById(R.id.edit_dob);
       doj = (EditText)findViewById(R.id.edit_doj);


    }

}
