package br.com.emmersonapp.minhacalculadora;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends Activity implements View.OnClickListener {

    //Inicializado, recebe os numeros

    Double resultado;
    Double btnnumeros;
    Double total ;
    Double  valorglobal;

    String operacao;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final TextView tela = (TextView) findViewById(R.id.resultado);


    }
    public void num0(View view) {
        TextView tela = (TextView) findViewById(R.id.resultado);
        String global = tela.getText().toString();
        int inteiro = 0;
        tela.setText(global+inteiro);
        String aux = tela.getText().toString();
        btnnumeros = Double.parseDouble(aux);
    }

    public void num00(View view) {
        TextView tela = (TextView) findViewById(R.id.resultado);
        String global = tela.getText().toString();
        tela.setText(global+"00");
        String aux = tela.getText().toString();
        btnnumeros = Double.parseDouble(aux);
    }

    public void num1(View view) {
        TextView tela = (TextView) findViewById(R.id.resultado);
        String global = tela.getText().toString();
        int inteiro = 1;
        tela.setText(global+inteiro);
        String aux = tela.getText().toString();
        btnnumeros = Double.parseDouble(aux);
    }

    public void num2(View view) {
        TextView tela = (TextView) findViewById(R.id.resultado);
        String global = tela.getText().toString();
        int inteiro = 2;
        tela.setText(global+inteiro);
        String aux = tela.getText().toString();
        btnnumeros = Double.parseDouble(aux);
    }

    public void num3(View view) {
        TextView tela = (TextView) findViewById(R.id.resultado);
        String global = tela.getText().toString();
        int inteiro = 3;
        tela.setText(global+inteiro);
        String aux = tela.getText().toString();
        btnnumeros = Double.parseDouble(aux);
    }

    public void num4(View view) {
        TextView tela = (TextView) findViewById(R.id.resultado);
        String global = tela.getText().toString();
        int inteiro = 4;
        tela.setText(global+inteiro);
        String aux = tela.getText().toString();
        btnnumeros = Double.parseDouble(aux);
    }

    public void num5(View view) {
        TextView tela = (TextView) findViewById(R.id.resultado);
        String global = tela.getText().toString();
        int inteiro = 5;
        tela.setText(global+inteiro);
        String aux = tela.getText().toString();
        btnnumeros = Double.parseDouble(aux);
    }

    public void num6(View view) {
        TextView tela = (TextView) findViewById(R.id.resultado);
        String global = tela.getText().toString();
        int inteiro = 6;
        tela.setText(global+inteiro);
        String aux = tela.getText().toString();
        btnnumeros = Double.parseDouble(aux);
    }

    public void num7(View view) {
        TextView tela = (TextView) findViewById(R.id.resultado);
        String global = tela.getText().toString();
        int inteiro = 7;
        tela.setText(global+inteiro);
        String aux = tela.getText().toString();
        btnnumeros = Double.parseDouble(aux);
    }

    public void num8(View view) {
        TextView tela = (TextView) findViewById(R.id.resultado);
        String global = tela.getText().toString();
        int inteiro = 8;
        tela.setText(global+inteiro);
        String aux = tela.getText().toString();
        btnnumeros = Double.parseDouble(aux);
    }

    public void num9(View view) {
        TextView tela = (TextView) findViewById(R.id.resultado);
        String global = tela.getText().toString();
        int inteiro = 9;
        tela.setText(global+inteiro);
        String aux = tela.getText().toString();
        btnnumeros = Double.parseDouble(aux);
    }

    public void btnSoma(View view) {
        TextView tela = (TextView) findViewById(R.id.resultado);
        tela.setText("");
        operacao = "soma";
        //tela.setText(btnnumeros+"+");
        if(resultado !=null){
            total = resultado;
        }else {
            total = btnnumeros;
        }
    }

    public void btnSubtracao(View view) {
        TextView tela = (TextView) findViewById(R.id.resultado);
        tela.setText("");
        operacao = "menos";
        //tela.setText(btnnumeros+"-");
        if(resultado !=null){
            total = resultado;
        }else {
            total = btnnumeros;
        }
    }

    public void btnMulti(View view) {
        TextView tela = (TextView) findViewById(R.id.resultado);
        tela.setText("");
        operacao = "multi";
        //tela.setText(btnnumeros+"*");
        if(resultado !=null){
            total = resultado;
        }else {
            total = btnnumeros;
        }
    }

    public void btnDivisao(View view) {
        TextView tela = (TextView) findViewById(R.id.resultado);
        tela.setText("");
        operacao = "divisao";
        //tela.setText(btnnumeros+"/");
        if(resultado !=null){
            total = resultado;
        }else {
            total = btnnumeros;
        }
    }

    public void btnPorcent(View view) {
        TextView tela = (TextView) findViewById(R.id.resultado);
        operacao = "porcentagem";
        //tela.setText(btnnumeros+"/");
        if(total==null){
            total = btnnumeros;
        }else {
            btnnumeros = btnnumeros;

        }
    }

    public void btnRaiz(View view) {
        TextView tela = (TextView) findViewById(R.id.resultado);
        operacao = "raiz";
        //tela.setText(btnnumeros+"sqr");
        resultado=Math.sqrt(btnnumeros);
        tela.setText(String.valueOf(resultado));
    }

    public void btnExpoente(View view) {
        TextView tela = (TextView) findViewById(R.id.resultado);
        operacao = "expoente";
        if(total==null){
            total = btnnumeros;
        }else {
            btnnumeros = btnnumeros;

        }
    }

    public void btnClear(View view) {
        TextView tela = (TextView) findViewById(R.id.resultado);
        total = null;
        btnnumeros = null;
        resultado = null;
        tela.setText("");
    }

    public void btnigual(View view) {
        TextView tela = (TextView) findViewById(R.id.resultado);

        switch (operacao) {
            case "soma":
                resultado = total + btnnumeros;
                tela.setText(String.valueOf(resultado));
                break;

            case "menos":
                resultado = total - btnnumeros;
                tela.setText(String.valueOf(resultado));
                break;

            case "multi":
                resultado = total * btnnumeros;
                tela.setText(String.valueOf(resultado));
                break;

            case "divisao":
                resultado = total / btnnumeros;
                tela.setText(String.valueOf(resultado));
                break;

            case "porcentagem":
                resultado = (total * btnnumeros)/100;
                tela.setText(String.valueOf(resultado));
                break;

            case "raiz":
                tela.setText("Operação Invalida");
                break;

            case "expoente":
                resultado = Math.pow(total, btnnumeros);
                tela.setText(String.valueOf(resultado));
                break;

        }
    }

    public void onClick(View v) {


    }
}