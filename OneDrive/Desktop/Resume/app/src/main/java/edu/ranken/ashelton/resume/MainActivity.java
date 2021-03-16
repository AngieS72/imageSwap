package edu.ranken.ashelton.resume;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.content.Intent;
import android.view.View;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onClickGoToEducation(View view){
        Intent e = new Intent(this, Education_Activity.class);
        startActivity (e);


    }

    public void onClickGoToWorkHistory(View view){
        Intent w = new Intent(this,Work_History_Activity.class);
        startActivity(w);
    }
}