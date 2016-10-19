package com.futureprogress.another.playsqlite1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText teacherInput;
    TextView teacherText;
    DatabaseHelper dbHelper;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }
    public void addButtonClicked(View view){
        Students student = new Students(teacherInput.getText().toString());
        dbHelper.addStudent(student);
        printDatabase();
    }

    public void deleteButtonClicked(View view){
        String inputText = teacherInput.getText().toString();
        dbHelper.deleteStudent(inputText);
        printDatabase();
    }

    public void printDatabase(){
        String dbString  = dbHelper.databseToString();
        teacherText.setText(dbString);
        teacherInput.setText("");
    }
}
