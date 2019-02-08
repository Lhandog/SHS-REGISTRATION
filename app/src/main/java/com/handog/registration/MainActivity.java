package com.handog.registration;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Spinner;

public class MainActivity extends AppCompatActivity {

    Spinner spinnerTracks;
    EditText etLastName, etFirstName, etMiddleName;
    RadioButton rbMale, rbFemale;
    CheckBox cbxReq1, cbxReq2, cbxReq3, cbxReq4;

    String academicProgram, lastname, firstname, middlename, gender, requirements;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        spinnerTracks = findViewById(R.id.spinnerTracks);
        etLastName = findViewById(R.id.etLastName);
        etFirstName = findViewById(R.id.etFirstName);
        etMiddleName = findViewById(R.id.etMiddleName);
        rbFemale = findViewById(R.id.rbFemale);
        rbMale = findViewById(R.id.rbMale);
        cbxReq1 = findViewById(R.id.cbxReq1);
        cbxReq2 = findViewById(R.id.cbxReq2);
        cbxReq3 = findViewById(R.id.cbxReq3);
        cbxReq4 = findViewById(R.id.cbxReq4);
    }


    public void submit(View view) {
        academicProgram = spinnerTracks.getSelectedItem().toString();
        lastname = etLastName.getText().toString();
        firstname = etFirstName.getText().toString();
        middlename = etMiddleName.getText().toString();
        if(rbMale.isChecked()) {
            gender = "Male";
        }
        else {
            gender = "Female";
        }

        requirements = ""; // always set the requirement to null when the submit button is clicked
        if(cbxReq1.isChecked()) {
            requirements = cbxReq1.getText().toString() + "\n";
        }
        if(cbxReq2.isChecked()) {
            requirements = requirements + cbxReq2.getText().toString() + "\n";
        }
        if(cbxReq3.isChecked()) {
            requirements = requirements + cbxReq3.getText().toString() + "\n";
        }
        if(cbxReq4.isChecked()) {
            requirements = requirements + cbxReq4.getText().toString() + "\n";
        }

        // Navigating to another activity with the data (user input)
        Intent intent = new Intent(this, DisplayMessageActivity.class);
        intent.putExtra("academicProgram", academicProgram);
        intent.putExtra("lastname", lastname);
        intent.putExtra("firstname", firstname);
        intent.putExtra("middlename", middlename);
        intent.putExtra("gender", gender);
        intent.putExtra("requirements", requirements);
        startActivity(intent);


}
}
