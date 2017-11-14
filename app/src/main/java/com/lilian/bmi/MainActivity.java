package com.lilian.bmi;

import android.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    String s = new String("abc");
    View.OnClickListener listener = new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            new AlertDialog.Builder(MainActivity.this)
                    .setTitle("BMI說明")
                    .setMessage("BMI原來的設計是一個用於公眾健康研究的統計工具。當需要知道肥胖是否為某一疾病的致病原因時，可以把病人的身高及體重換算成BMI，再找出其數值及病發率是否有線性關連。由於BMI主要反應整體體重，無法區別體重中體脂肪組織與非脂肪組織（包括肌肉、器官），同樣身高體重的人可算出相同的BMI，但其實脂肪量不同[1]，因此其實BMI是整體營養狀態的指標。")
                    .setPositiveButton("OK",null)
                    .show();
        }
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getResources().getString(R.string.app_name);
        Button bhelp =(Button)findViewById(R.id.b_help);
        bhelp.setOnClickListener(listener);
    }
    public void bmi(View view) {
//      System.out.println("what???");
        Log.d("MainActivity","testing bmi method");
        EditText edHeight = (EditText) findViewById(R.id.ed_height);
        EditText edWeight = (EditText) findViewById(R.id.ed_weight);
        float weight = Float.parseFloat(edWeight.getText().toString());
        float height = Float.parseFloat(edHeight.getText().toString());
        float bmi = weight / (height * height);
        if (bmi<20) {
            new AlertDialog.Builder(this)
                    .setMessage(getString(R.string.Your_BMI_is) + bmi)
                    .setTitle("請多吃點")
                    .setPositiveButton(R.string.ok, null)
                    .show();
        /*Log.d("MainActivity","You BMI is : " + bmi);
        Toast.makeText(this,
                "You BMI is" +bmi,Toast.LENGTH_SHORT).show();*/
        }if(bmi>=20){
            new AlertDialog.Builder(this)
                    .setMessage("YOU BMI IS :")
                    .setTitle("結果")
                    .setPositiveButton("ok",null)
                    .show();
        }
    }
}
