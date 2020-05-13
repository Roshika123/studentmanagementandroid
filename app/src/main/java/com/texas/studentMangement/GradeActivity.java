package com.texas.studentMangement;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.Toast;


public class GradeActivity extends AppCompatActivity {

    private Spinner spinner;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate ( savedInstanceState );
        setContentView ( R.layout.activity_grade );

        spinner = findViewById ( R.id.Spinner );

        final String[] array = getResources ().getStringArray ( R.array.Grade );

        ArrayAdapter arrayAdapter = new ArrayAdapter
                ( GradeActivity.this, R.layout.support_simple_spinner_dropdown_item,array );

        spinner.setAdapter ( arrayAdapter );

        spinner.setOnItemSelectedListener ( new AdapterView.OnItemSelectedListener ( ) {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {

                Toast.makeText ( GradeActivity.this, "" +array[position], Toast.LENGTH_SHORT ).show ( );
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        } );
    }
}
