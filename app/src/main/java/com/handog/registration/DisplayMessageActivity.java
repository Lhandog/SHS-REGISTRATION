package com.handog.registration;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class DisplayMessageActivity extends AppCompatActivity {

    TextView tvAcademicProgram, tvFullName, tvGender, tvRequirements;

    String academicProgram, lastname, firstname, middlename, gender, requirements, full_name;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display_message);

        tvAcademicProgram = findViewById(R.id.tvAcademicProgram);
        tvFullName = findViewById(R.id.tvFullName);
        tvGender = findViewById(R.id.tvGender);
        tvRequirements = findViewById(R.id.tvRequirements);

        // Getting the value of passed data from previous activity
        Intent intent = getIntent();
        academicProgram = intent.getStringExtra("academicProgram");
        lastname = intent.getStringExtra("lastname");
        firstname = intent.getStringExtra("firstname");
        middlename = intent.getStringExtra("middlename");
        gender = intent.getStringExtra("gender");
        requirements = intent.getStringExtra("requirements");

        full_name = firstname + " " + middlename + " " + lastname;

        // Setting value of the objects
        tvAcademicProgram.setText(academicProgram);
        tvFullName.setText(full_name);
        tvGender.setText(gender);
        tvRequirements.setText(requirements);

    }
}
