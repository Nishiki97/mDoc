package com.industrialmaster.mdoc;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class DocHomeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_doc_home);
    }

    public void myPatients(View v){

        Intent intent = new Intent(this, MyPatientsActivity.class);
        startActivity(intent);
    }

    public void myPlaces(View v){

        Intent intent =  new Intent(this, MyPlacesOfPractice.class);
        startActivity(intent);
    }

    public void profile(View v){

        Intent intent = new Intent(this, DocProfile.class);
        startActivity(intent);
    }
}
