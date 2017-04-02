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
        Button btnSubtracao=(Button)findViewById(R.id.subtracao);
        Button btnDivisao=(Button)findViewById(R.id.divisao);
        Button btnMultiplicarcao=(Button)findViewById(R.id.mutiplicacao);
        Button btnPorcentagem=(Button)findViewById(R.id.porcentagem);
        Button btnExponencial=(Button)findViewById(R.id.exponencial);
        Button btnclear=(Button)findViewById(R.id.clear);
        Button btnraiz=(Button)findViewById(R.id.raiz);
        Button btnIgual=(Button)findViewById(R.id.igual);
        Button btnnun7=(Button)findViewById(R.id.num7);
        Button btnnun8=(Button)findViewById(R.id.num8);
        Button btnnun9=(Button)findViewById(R.id.num9);
        Button btnnun4=(Button)findViewById(R.id.num4);
        Button btnnun5=(Button)findViewById(R.id.num5);
        Button btnnun6=(Button)findViewById(R.id.num6);
        Button btnnun1=(Button)findViewById(R.id.num1);
        Button btnnun2=(Button)findViewById(R.id.num2);
        Button btnnun3=(Button)findViewById(R.id.num3);
        Button btnponto=(Button)findViewById(R.id.ponto);
        Button btnnun0=(Button)findViewById(R.id.num0);
        Button btnnun00=(Button)findViewById(R.id.num00);

        btnSoma.setOnClickListener(new Button.OnClickListener(){
            public void onClick(View v){
                String resultado = tela.getText().toString();
                tela.setText(resultado+"+");
            }
        });
        btnclear.setOnClickListener(new Button.OnClickListener(){
            public void onClick(View v){
                tela.setText("");
            }
        });
        btnSubtracao.setOnClickListener(new Button.OnClickListener(){
            public void onClick(View v){
                String resultado = tela.getText().toString();
                tela.setText(resultado+"-");
            }
        });

        btnDivisao.setOnClickListener(new Button.OnClickListener(){
            public void onClick(View v){
                String resultado = tela.getText().toString();
                tela.setText(resultado+"/");
            }
        });
        btnMultiplicarcao.setOnClickListener(new Button.OnClickListener(){
            public void onClick(View v){
                String resultado = tela.getText().toString();
                tela.setText(resultado+"*");
            }
        });
        btnPorcentagem.setOnClickListener(new Button.OnClickListener(){
            public void onClick(View v){
                String resultado = tela.getText().toString();
                tela.setText(resultado+"%");
            }
        });
        btnExponencial.setOnClickListener(new Button.OnClickListener(){
            public void onClick(View v){
                String resultado = tela.getText().toString();
                tela.setText(resultado+"^");
            }
        });

        btnIgual.setOnClickListener(new Button.OnClickListener(){
            public void onClick(View v){
                tela.setText("botão igual pressionado");
            }
        });


        btnnun7.setOnClickListener(new Button.OnClickListener(){
            public void onClick(View v){
                String resultado = tela.getText().toString();
                tela.setText(resultado+"7");
            }
        });
        btnnun8.setOnClickListener(new Button.OnClickListener(){
            public void onClick(View v){
                String resultado = tela.getText().toString();
                tela.setText(resultado+"8");
            }
        });
        btnnun9.setOnClickListener(new Button.OnClickListener(){
            public void onClick(View v){
                String resultado = tela.getText().toString();
                tela.setText(resultado+"9");
            }
        });
        btnnun4.setOnClickListener(new Button.OnClickListener(){
            public void onClick(View v){
                String resultado = tela.getText().toString();
                tela.setText(resultado+"4");
            }
        });
        btnnun5.setOnClickListener(new Button.OnClickListener(){
            public void onClick(View v){
                String resultado = tela.getText().toString();
                tela.setText(resultado+"5");
            }
        });
        btnnun6.setOnClickListener(new Button.OnClickListener(){
            public void onClick(View v){
                String resultado = tela.getText().toString();
                tela.setText(resultado+"6");
            }
        });
        btnnun3.setOnClickListener(new Button.OnClickListener(){
            public void onClick(View v){
                String resultado = tela.getText().toString();
                tela.setText(resultado+"3");
            }
        });
        btnnun2.setOnClickListener(new Button.OnClickListener(){
            public void onClick(View v){
                String resultado = tela.getText().toString();
                tela.setText(resultado+"2");
            }
        });
        btnnun1.setOnClickListener(new Button.OnClickListener(){
            public void onClick(View v){
                String resultado = tela.getText().toString();
                tela.setText(resultado+"1");
            }
        });
        btnponto.setOnClickListener(new Button.OnClickListener(){
            public void onClick(View v){
                String resultado = tela.getText().toString();
                tela.setText(resultado+".");
            }
        });
        btnnun0.setOnClickListener(new Button.OnClickListener(){
            public void onClick(View v){
                String resultado = tela.getText().toString();
                tela.setText(resultado+"0");
            }
        });
        btnnun00.setOnClickListener(new Button.OnClickListener(){
            public void onClick(View v){
                String resultado = tela.getText().toString();
                tela.setText(resultado+"00");
            }
        });
    }
}
