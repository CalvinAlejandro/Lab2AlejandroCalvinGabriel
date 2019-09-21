package com.alejandro.lab2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class ValidateCourse extends AppCompatActivity {

    EditText etCheck;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_validate_course);
        etCheck = findViewById(R.id.editCheck);
    }

    public void validateData(View view)
    {
        SharedPreferences sp = getSharedPreferences("myCourses", MODE_PRIVATE);
        String c1 = sp.getString("course1", null);
        String c2 = sp.getString("course2", null);
        String c3 = sp.getString("course3", null);
        String c4 = sp.getString("course4", null);
        String c5 = sp.getString("course5", null);
        String c6 = sp.getString("course6", null);
        String c7 = sp.getString("course7", null);
        String c8 = sp.getString("course8", null);

        String etCk = etCheck.getText().toString();

        if(etCk.equals(c1) || etCk.equals(c2) || etCk.equals(c3) || etCk.equals(c4) || etCk.equals(c5) || etCk.equals(c6) || etCk.equals(c7) || etCk.equals(c8))
        {
            Toast.makeText(this, "Course Exists", Toast.LENGTH_LONG).show();
        }
        else
        {
            Toast.makeText(this, "Invalid Course", Toast.LENGTH_LONG).show();
        }
    }

    public void backActivity(View view)
    {
        Intent intent = new Intent(getApplicationContext(), MainActivity.class);
        startActivity(intent);
    }
}
