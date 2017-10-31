package com.lilian.bmi;

import android.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void bmi(View view) {
//      System.out.println("what???");
        Log.d("MainActivity","testing bmi method");
        EditText edHeight = (EditText) findViewById(R.id.ed_height);
        EditText edWeight = (EditText) findViewById(R.id.ed_weight);
        float weight = Float.parseFloat(edWeight.getText().toString());
        float height = Float.parseFloat(edHeight.getText().toString());
        float bmi = weight / (height * height);
        new AlertDialog.Builder(this)
                .setMessage("Your BMI is" +bmi)
                .setTitle("my title")
                .setPositiveButton("OK",null)
                .show();
        /*Log.d("MainActivity","You BMI is : " + bmi);
        Toast.makeText(this,
                "You BMI is" +bmi,Toast.LENGTH_SHORT).show();*/
    }
}
