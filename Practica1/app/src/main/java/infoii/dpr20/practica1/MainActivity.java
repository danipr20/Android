package infoii.dpr20.practica1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import javax.xml.transform.Result;

public class MainActivity extends AppCompatActivity {


    private Button puls1;
    private Button puls2;

    private TextView texto;
    private TextView Resultado;
    private int contador=0;
    private String valorA="";
    private String valorB="";
    private double res=0;

    private char operacion='0';

    private Button boton1; Button boton2;Button boton3;Button boton4;Button boton5;Button boton6;Button boton7;Button boton8;Button boton9;Button boton0;
    private Button botonAC;Button botonC;Button botonSuma;Button botonResta;Button botonMulti;Button botonDivi;Button botonIgual;Button botonComa;

    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        puls1 = (Button) findViewById(R.id.boton);
        puls2 = (Button) findViewById(R.id.pulsador);
        texto = (TextView) findViewById(R.id.text_cont);

        //Calculadora

        boton1 = (Button) findViewById(R.id.boton1);
        boton2 = (Button) findViewById(R.id.boton2);
        boton3 = (Button) findViewById(R.id.boton3);
        boton4 = (Button) findViewById(R.id.boton4);
        boton5 = (Button) findViewById(R.id.boton5);
        boton6 = (Button) findViewById(R.id.boton6);
        boton7 = (Button) findViewById(R.id.boton7);
        boton8 = (Button) findViewById(R.id.boton8);
        boton9 = (Button) findViewById(R.id.boton9);
        boton0 = (Button) findViewById(R.id.boton0);
        botonComa = (Button) findViewById(R.id.boton11);
        botonSuma = (Button) findViewById(R.id.suma);
        botonResta = (Button) findViewById(R.id.resta);
        botonDivi = (Button) findViewById(R.id.division);
        botonMulti= (Button) findViewById(R.id.multiplicacion);
        botonIgual = (Button) findViewById(R.id.igual);
        botonAC = (Button) findViewById(R.id.boton16);
        botonC = (Button) findViewById(R.id.boton12);
        Resultado = (TextView) findViewById(R.id.result);


        puls1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
            contador++;
            texto.setText("CONTADOR= "+contador);
            }


        });
        puls2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                contador--;
                texto.setText("CONTADOR= "+contador);
            }


        });
        boton1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (operacion=='='){valorA="";valorB="";operacion='0';}

                valorA=valorA.concat("1");
                Resultado.setText(valorA);
            }
        });

        boton2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (operacion=='='){valorA="";valorB="";operacion='0';}

                valorA=valorA.concat("2");
                Resultado.setText(valorA);
            }
        });

        boton3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (operacion=='='){valorA="";valorB="";operacion='0';}

                valorA=valorA.concat("3");
                Resultado.setText(valorA);
            }
        });

        boton4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (operacion=='='){valorA="";valorB="";operacion='0';}

                valorA=valorA.concat("4");
                Resultado.setText(valorA);
            }
        });

        boton5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (operacion=='='){valorA="";valorB="";operacion='0';}

                valorA=valorA.concat("5");
                Resultado.setText(valorA);
            }
        });

        boton6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (operacion=='='){valorA="";valorB="";operacion='0';}

                valorA=valorA.concat("6");
                Resultado.setText(valorA);
            }
        });

        boton7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (operacion=='='){valorA="";valorB="";operacion='0';}

                valorA=valorA.concat("7");
                Resultado.setText(valorA);
            }
        });

        boton8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (operacion=='='){valorA="";valorB="";operacion='0';}


                valorA=valorA.concat("8");
                Resultado.setText(valorA);
            }
        });

        boton9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (operacion=='='){valorA="";valorB="";operacion='0';}

                valorA=valorA.concat("9");
                Resultado.setText(valorA);
            }
        });

        boton0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (operacion=='='){valorA="";valorB="";operacion='0';}

                valorA=valorA.concat("0");
                Resultado.setText(valorA);
            }
        });

        botonComa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (operacion=='='){valorA="";valorB="";}

                valorA=valorA.concat(".");
                Resultado.setText(valorA);
            }
        });

        botonSuma.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                operacion='+';
                valorB=valorA;
                valorA="";
                Resultado.setText(valorB+" + ");

            }
        });

        botonResta.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                operacion='-';
                valorB=valorA;
                valorA="";
                Resultado.setText(valorB+" - ");
            }
        });

        botonMulti.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                operacion='*';
                valorB=valorA;
                valorA="";
                Resultado.setText(valorB+" X ");
            }
        });

        botonDivi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                operacion='/';
                valorB=valorA;
                valorA="";
                Resultado.setText(valorB+" : ");
            }
        });

        botonAC.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                valorA="0";
                valorB="0";
                Resultado.setText(valorA);
            }
        });

        botonC.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                valorA=valorA.concat("1");
                Resultado.setText(valorA);
            }
        });

        botonIgual.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                switch (operacion){
                    case '+':
                        res=Float.parseFloat(valorA)+Float.parseFloat(valorB);
                        valorA= String.valueOf(res);
                        valorB="0";
                    Resultado.setText("RESULTADO= "+valorA);
                operacion='=';
                break;
                    case '-':
                        res=Float.parseFloat(valorB)-Float.parseFloat(valorA);
                        valorA= String.valueOf(res);
                        valorB="0";
                        Resultado.setText("RESULTADO= "+valorA);
                        operacion='=';
                break;

                    case '*':
                        res=Float.parseFloat(valorA)*Float.parseFloat(valorB);
                        valorA= String.valueOf(res);
                        valorB="0";
                        Resultado.setText("RESULTADO= "+valorA);
                        operacion='=';
                break;

                    case '/':
                        res=Float.parseFloat(valorB)/Float.parseFloat(valorA);
                        valorA= String.valueOf(res);
                        valorB="0";
                        Resultado.setText("RESULTADO= "+valorA);
                        operacion='=';
                break;

                    default:

                        Resultado.setText("RESULTADO= "+valorA);
                        break;
                }

            }
        });





















    }

}
