package com.example.alunoti.calculadora;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final TextView tela=(TextView)findViewById(R.id.resultado);
        Button btnSoma=(Button)findViewById(R.id.btnSoma);
        Button btnnun7=(Button)findViewById(R.id.num7);
        Button btnnun8=(Button)findViewById(R.id.num8);
        Button btnnun9=(Button)findViewById(R.id.num9);
        Button btnnun4=(Button)findViewById(R.id.num4);
        Button btnnun5=(Button)findViewById(R.id.num5);
        Button btnnun6=(Button)findViewById(R.id.num6);
        Button btnnun1=(Button)findViewById(R.id.num1);
        Button btnnun2=(Button)findViewById(R.id.num2);
        Button btnnun3=(Button)findViewById(R.id.num3);

        btnSoma.setOnClickListener(new Button.OnClickListener(){
            public void onClick(View v){

            }
        });
        btnnun7.setOnClickListener(new Button.OnClickListener(){
            public void onClick(View v){
                tela.setText("7");
            }
        });
        btnnun8.setOnClickListener(new Button.OnClickListener(){
            public void onClick(View v){
                tela.setText("8");
            }
        });
        btnnun9.setOnClickListener(new Button.OnClickListener(){
            public void onClick(View v){
                tela.setText("9");
            }
        });
        btnnun4.setOnClickListener(new Button.OnClickListener(){
            public void onClick(View v){
                tela.setText("4");
            }
        });
        btnnun5.setOnClickListener(new Button.OnClickListener(){
            public void onClick(View v){
                tela.setText("5");
            }
        });
        btnnun6.setOnClickListener(new Button.OnClickListener(){
            public void onClick(View v){
                tela.setText("6");
            }
        });
        btnnun3.setOnClickListener(new Button.OnClickListener(){
            public void onClick(View v){
                tela.setText("3");
            }
        });
        btnnun2.setOnClickListener(new Button.OnClickListener(){
            public void onClick(View v){
                tela.setText("2");
            }
        });
        btnnun1.setOnClickListener(new Button.OnClickListener(){
            public void onClick(View v){
                tela.setText("1");
            }
        });
    }
}
