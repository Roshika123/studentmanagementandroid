package com.texas.studentMangement;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {
    private Button grade;
    private Button routine;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Toolbar toolbar = findViewById ( R.id. main_toolbar );
        TextView toolbarTitle = findViewById ( R.id.titleText );
        TextView toolbarCounter = findViewById ( R.id.titleCounter );

        //first remove already present title
        toolbar.setTitle ( "" );
        toolbarTitle.setText ( "Student Management System" );
        toolbarCounter.setText ( "1" );
        setSupportActionBar ( toolbar );


        grade = findViewById ( R.id.grade );
        routine = findViewById ( R.id.grade );

        grade.setOnClickListener ( new View.OnClickListener ( ) {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent ( MainActivity.this, GradeActivity.class );
                startActivity ( intent );

            }
        } );

        routine.setOnClickListener ( new View.OnClickListener ( ) {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent ( MainActivity.this, RoutineActivity.class );
                startActivity ( intent );

            }
        } );
    }
}
