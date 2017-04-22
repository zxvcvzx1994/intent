package com.example.kh.intent;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
EditText etpassingdata ;
    EditText etNum;
    int b;
    Button bt;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        bt =(Button) findViewById(R.id.btnPassingData);
        bt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                etpassingdata = (EditText) findViewById(R.id.etData);
                etNum = (EditText) findViewById(R.id.etNum);
               Intent m = new Intent(MainActivity.this, MainActivitySecond.class);
                String ten = etpassingdata.getText().toString();
                if(ten.length()>50){
                    Toast.makeText(MainActivity.this, "Vuot 50 ky tu", Toast.LENGTH_SHORT).show();
                    return;
                }else if(ten.length()==0){
                    Toast.makeText(MainActivity.this, "chua nhap", Toast.LENGTH_SHORT).show();
                    return;
                }

                try{
                     b = Integer.parseInt(etNum.getText().toString());
                }catch (Exception e){
                    b=-1;
                }

                if(String.valueOf(b).length()>4){
                    Toast.makeText(MainActivity.this, "Vuot qua so 9999", Toast.LENGTH_SHORT).show();
                    return;
                }else if(b<0){
                    Toast.makeText(MainActivity.this, "chua nhap", Toast.LENGTH_SHORT).show();
                    return;
                }


                m.putExtra("name",ten);
                m.putExtra("page",b);
                startActivity(m);
            }
        });



    }
}
