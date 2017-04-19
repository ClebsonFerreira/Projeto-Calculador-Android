package com.example.alunoti.calculadora;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import br.com.emmersonapp.minhacalculadora.R;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends Activity implements View.OnClickListener {

    //Inicializado, recebe os numeros

    Double resultado;
    Double btnnumeros;
    Double total ;

    String operacao;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final TextView tela = (TextView) findViewById(R.id.resultado);
        final TextView inv = (TextView) findViewById(R.id.inv);


    }
    public void num0(View view) {
        TextView tela = (TextView) findViewById(R.id.resultado);
        String global = tela.getText().toString();
        tela.setText(global+"0");

        TextView inv = (TextView) findViewById(R.id.inv);
        String guarda = inv.getText().toString();
        inv.setText(guarda+"0");

        String aux = inv.getText().toString();
        btnnumeros = Double.parseDouble(aux);
    }

    public void num00(View view) {
        TextView tela = (TextView) findViewById(R.id.resultado);
        String global = tela.getText().toString();
        tela.setText(global+"00");

        TextView inv = (TextView) findViewById(R.id.inv);
        String guarda = inv.getText().toString();
        inv.setText(guarda+"00");

        String aux = inv.getText().toString();
        btnnumeros = Double.parseDouble(aux);
    }

    public void num1(View view) {
        TextView tela = (TextView) findViewById(R.id.resultado);
        String global = tela.getText().toString();
        tela.setText(global+"1");

        TextView inv = (TextView) findViewById(R.id.inv);
        String guarda = inv.getText().toString();
        inv.setText(guarda+"1");

        String aux = inv.getText().toString();
        btnnumeros = Double.parseDouble(aux);
    }

    public void num2(View view) {
        TextView tela = (TextView) findViewById(R.id.resultado);
        String global = tela.getText().toString();
        tela.setText(global+"2");

        TextView inv = (TextView) findViewById(R.id.inv);
        String guarda = inv.getText().toString();
        inv.setText(guarda+"2");

        String aux = inv.getText().toString();
        btnnumeros = Double.parseDouble(aux);
    }

    public void num3(View view) {
        TextView tela = (TextView) findViewById(R.id.resultado);
        String global = tela.getText().toString();
        tela.setText(global+"3");

        TextView inv = (TextView) findViewById(R.id.inv);
        String guarda = inv.getText().toString();
        inv.setText(guarda+"3");

        String aux = inv.getText().toString();
        btnnumeros = Double.parseDouble(aux);
    }

    public void num4(View view) {
        TextView tela = (TextView) findViewById(R.id.resultado);
        String global = tela.getText().toString();
        tela.setText(global+"4");

        TextView inv = (TextView) findViewById(R.id.inv);
        String guarda = inv.getText().toString();
        inv.setText(guarda+"4");

        String aux = inv.getText().toString();
        btnnumeros = Double.parseDouble(aux);
    }

    public void num5(View view) {
        TextView tela = (TextView) findViewById(R.id.resultado);
        String global = tela.getText().toString();
        tela.setText(global+"5");

        TextView inv = (TextView) findViewById(R.id.inv);
        String guarda = inv.getText().toString();
        inv.setText(guarda+"5");

        String aux = inv.getText().toString();
        btnnumeros = Double.parseDouble(aux);
    }

    public void num6(View view) {
        TextView tela = (TextView) findViewById(R.id.resultado);
        String global = tela.getText().toString();
        tela.setText(global+"6");

        TextView inv = (TextView) findViewById(R.id.inv);
        String guarda = inv.getText().toString();
        inv.setText(guarda+"6");

        String aux = inv.getText().toString();
        btnnumeros = Double.parseDouble(aux);
    }

    public void num7(View view) {
        TextView tela = (TextView) findViewById(R.id.resultado);
        String global = tela.getText().toString();
        tela.setText(global+"7");

        TextView inv = (TextView) findViewById(R.id.inv);
        String guarda = inv.getText().toString();
        inv.setText(guarda+"7");

        String aux = inv.getText().toString();
        btnnumeros = Double.parseDouble(aux);
    }

    public void num8(View view) {
        TextView tela = (TextView) findViewById(R.id.resultado);
        String global = tela.getText().toString();
        tela.setText(global+"8");

        TextView inv = (TextView) findViewById(R.id.inv);
        String guarda = inv.getText().toString();
        inv.setText(guarda+"8");

        String aux = inv.getText().toString();
        btnnumeros = Double.parseDouble(aux);
    }

    public void num9(View view) {
        TextView tela = (TextView) findViewById(R.id.resultado);
        String global = tela.getText().toString();
        tela.setText(global+"9");

        TextView inv = (TextView) findViewById(R.id.inv);
        String guarda = inv.getText().toString();
        inv.setText(guarda+"9");

        String aux = inv.getText().toString();
        btnnumeros = Double.parseDouble(aux);
    }

    public void btnSoma(View view) {
        TextView tela = (TextView) findViewById(R.id.resultado);
        String global = tela.getText().toString();
        tela.setText(global+"+");

        TextView inv = (TextView) findViewById(R.id.inv);
        String guarda = inv.getText().toString();
        inv.setText("");

        operacao = "soma";
        if(resultado !=null){
            total = resultado;
        }else {
            total = btnnumeros;
        }
    }

    public void btnSubtracao(View view) {
        TextView tela = (TextView) findViewById(R.id.resultado);
        String global = tela.getText().toString();
        tela.setText(global+"-");

        TextView inv = (TextView) findViewById(R.id.inv);
        String guarda = inv.getText().toString();
        inv.setText("");

        operacao = "menos";
        if(resultado !=null){
            total = resultado;
        }else {
            total = btnnumeros;
        }
    }

    public void btnMulti(View view) {
        TextView tela = (TextView) findViewById(R.id.resultado);
        String global = tela.getText().toString();
        tela.setText(global+"*");

        TextView inv = (TextView) findViewById(R.id.inv);
        String guarda = inv.getText().toString();
        inv.setText("");

        operacao = "multi";
        if(resultado !=null){
            total = resultado;
        }else {
            total = btnnumeros;
        }
    }

    public void btnDivisao(View view) {
        TextView tela = (TextView) findViewById(R.id.resultado);
        String global = tela.getText().toString();
        tela.setText(global+"/");

        TextView inv = (TextView) findViewById(R.id.inv);
        String guarda = inv.getText().toString();
        inv.setText("");

        operacao = "divisao";

        if(resultado !=null){
            total = resultado;
        }else {
            total = btnnumeros;
        }
    }

    public void btnPorcent(View view) {
        TextView tela = (TextView) findViewById(R.id.resultado);
        String global = tela.getText().toString();
        tela.setText(global+"%");

        TextView inv = (TextView) findViewById(R.id.inv);
        String guarda = inv.getText().toString();
        inv.setText("");

        operacao = "porcentagem";
        if(total==null){
            total = btnnumeros;
        }else {
            btnnumeros = btnnumeros;

        }
    }

    public void btnRaiz(View view) {
        TextView tela = (TextView) findViewById(R.id.resultado);
        String global = tela.getText().toString();
        tela.setText("Sqr"+global);

        TextView inv = (TextView) findViewById(R.id.inv);
        String guarda = inv.getText().toString();
        inv.setText("");

        operacao = "raiz";
        resultado=Math.sqrt(btnnumeros);
        tela.setText(String.valueOf(resultado));
        inv.setText(String.valueOf(resultado));
    }

    public void btnExpoente(View view) {
        TextView tela = (TextView) findViewById(R.id.resultado);
        String global = tela.getText().toString();
        tela.setText(global+"^");

        TextView inv = (TextView) findViewById(R.id.inv);
        String guarda = inv.getText().toString();
        inv.setText("");

        operacao = "expoente";
        if(total==null){
            total = btnnumeros;
        }else {
            btnnumeros = btnnumeros;

        }
    }

    public void btnPonto(View view) {
        TextView tela = (TextView) findViewById(R.id.resultado);
        String global = tela.getText().toString();
        tela.setText(global+".");

        TextView inv = (TextView) findViewById(R.id.inv);
        String guarda = inv.getText().toString();
        inv.setText(guarda+".");

        String aux = inv.getText().toString();
        btnnumeros = Double.parseDouble(aux);
    }

    public void btnClear(View view) {
        TextView tela = (TextView) findViewById(R.id.resultado);
        TextView inv = (TextView) findViewById(R.id.inv);
        total = null;
        btnnumeros = null;
        resultado = null;
        tela.setText("");
        inv.setText("");
    }

    public void btnApagar(View view) {
        TextView tela = (TextView) findViewById(R.id.resultado);
        TextView inv = (TextView) findViewById(R.id.resultado);
        // AQUI PEGO O TEXTO QUE QUERO APAGAR
        String texto = tela.getText().toString();
        String texto2 = inv.getText().toString();

        // AQUI EU FAÇO UM TESTE PARA VER SE O TAMANHO DO TEXTO É MAIOR QUE 0
        if(texto.length() > 0){

            // AQUI EU PEGO O TAMANHO DO TEXTO - 1 () É O ULTIMO CARACTERE A APAGAR
            int indice = texto.length() - 1;
            int indice2 = texto2.length() - 1;

            // AQUI EU SETO UMA SUBSTRING
            // ( OU SEJA O TEXTO ANTERIRO MENOS O ULTIMO CARACTERE)
            tela.setText(texto.substring(0, indice ));
            inv.setText(texto2.substring(0, indice2 ));
            String guarda = inv.getText().toString();
            if(guarda==null){
                btnnumeros = 0.0;
            }else{ btnnumeros = Double.parseDouble(guarda);}

        }
    }

    public void btnigual(View view) {
        TextView tela = (TextView) findViewById(R.id.resultado);
        TextView inv = (TextView) findViewById(R.id.inv);
        String global = tela.getText().toString();

        switch (operacao) {
            case "soma":
                resultado = total + btnnumeros;
                tela.setText(global+"\n="+String.valueOf(resultado));
                inv.setText(String.valueOf(resultado));
                break;

            case "menos":
                resultado = total - btnnumeros;
                tela.setText(global+"\n="+String.valueOf(resultado));
                inv.setText(String.valueOf(resultado));
                break;

            case "multi":
                resultado = total * btnnumeros;
                tela.setText(global+"\n="+String.valueOf(resultado));
                inv.setText(String.valueOf(resultado));
                break;

            case "divisao":
                resultado = total / btnnumeros;
                tela.setText(global+"\n="+String.valueOf(resultado));
                inv.setText(String.valueOf(resultado));
                break;

            case "porcentagem":
                resultado = (total * btnnumeros)/100;
                tela.setText(global+"\n="+String.valueOf(resultado));
                inv.setText(String.valueOf(resultado));
                break;

            case "raiz":
                tela.setText("Operação Invalida");
                inv.setText("");
                break;

            case "expoente":
                resultado = Math.pow(total, btnnumeros);
                tela.setText(global+"\n="+String.valueOf(resultado));
                inv.setText(String.valueOf(resultado));
                break;

        }
    }

    public void onClick(View v) {


    }
}