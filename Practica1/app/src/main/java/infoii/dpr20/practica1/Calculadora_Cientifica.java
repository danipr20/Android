package infoii.dpr20.practica1;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class Calculadora_Cientifica extends AppCompatActivity {





    private TextView Resultado;
    private int contador = 0;
    private String valorA = "";
    private String valorB = "";
    private double res = 0;

    private String textoPantalla = "";

    private char operacion = '0';

    private Button boton1;
    private Button boton2;
    private Button boton3;
    private Button boton4;
    private Button boton5;
    private Button boton6;
    private Button boton7;
    private  Button boton8;
    private  Button boton9;
    private  Button boton0;
    private Button botonAC;
    private Button botonC;
    private Button botonSuma;
    private Button botonResta;
    private Button botonMulti;
    private Button botonDivi;
    private Button botonIgual;
    private Button botonComa;
    private Button autor; //autor
    private Button botonCos;
    private Button botonSen;
    private Button botonTan;
    private Button cambio;
    private Button botonxy;

    private void showToast(String mensaje) {
        Toast.makeText(this, mensaje, Toast.LENGTH_SHORT).show();
    }

    @SuppressLint("MissingInflatedId")
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calculadora_cientifica);


        Intent intent = getIntent();
         valorA = intent.getStringExtra("valorA");
         valorB = intent.getStringExtra("valorB");
         res = intent.getDoubleExtra("res", 0.0);




        //Calculadora basica
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
        botonMulti = (Button) findViewById(R.id.multiplicacion);
        botonIgual = (Button) findViewById(R.id.igual);
        botonAC = (Button) findViewById(R.id.boton16);
        botonC = (Button) findViewById(R.id.boton12);
        Resultado = (TextView) findViewById(R.id.result);
        autor = (Button) findViewById(R.id.boton14);
        cambio=(Button) findViewById(R.id.boton17);

        // Calculadora cientifica

        botonSen = (Button) findViewById(R.id.sen);
        botonCos = (Button) findViewById(R.id.cos);
        botonTan = (Button) findViewById(R.id.tan);
        botonxy = (Button) findViewById(R.id.xy);




        Resultado.setText(valorA);





        autor.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                valorA = "Autor: Daniel Prieto Romero \nNIA: 100405671 \nFecha de creación: 30/11/2023";
                Resultado.setText(valorA);
                valorA="";
            }


        });

        boton1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (operacion == '=') {
                    valorA = "";
                    valorB = "";
                    operacion = '0';
                }

                valorA = valorA.concat("1");
                Resultado.setText(valorA);
            }
        });

        boton2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (operacion == '=') {
                    valorA = "";
                    valorB = "";
                    operacion = '0';
                }

                valorA = valorA.concat("2");
                Resultado.setText(valorA);
            }
        });

        boton3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (operacion == '=') {
                    valorA = "";
                    valorB = "";
                    operacion = '0';
                }

                valorA = valorA.concat("3");
                Resultado.setText(valorA);
            }
        });

        boton4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (operacion == '=') {
                    valorA = "";
                    valorB = "";
                    operacion = '0';
                }

                valorA = valorA.concat("4");
                Resultado.setText(valorA);
            }
        });

        boton5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (operacion == '=') {
                    valorA = "";
                    valorB = "";
                    operacion = '0';
                }

                valorA = valorA.concat("5");
                Resultado.setText(valorA);
            }
        });

        boton6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (operacion == '=') {
                    valorA = "";
                    valorB = "";
                    operacion = '0';
                }

                valorA = valorA.concat("6");
                Resultado.setText(valorA);
            }
        });

        boton7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (operacion == '=') {
                    valorA = "";
                    valorB = "";
                    operacion = '0';
                }

                valorA = valorA.concat("7");
                Resultado.setText(valorA);
            }
        });

        boton8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (operacion == '=') {
                    valorA = "";
                    valorB = "";
                    operacion = '0';
                }


                valorA = valorA.concat("8");
                Resultado.setText(valorA);
            }
        });

        boton9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (operacion == '=') {
                    valorA = "";
                    valorB = "";
                    operacion = '0';
                }

                valorA = valorA.concat("9");
                Resultado.setText(valorA);
            }
        });

        boton0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (operacion == '=') {
                    valorA = "";
                    valorB = "";
                    operacion = '0';
                }

                valorA = valorA.concat("0");
                Resultado.setText(valorA);
            }
        });

        botonComa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (operacion == '=') {
                    valorA = "";
                    valorB = "";
                }

                valorA = valorA.concat(".");
                Resultado.setText(valorA);
            }
        });

        botonSuma.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (valorB.equals("")) {
                    valorB = "0";
                }
                if (valorA.equals("")) {
                    valorA = "0";
                }
                else if (operacion == '0') {
                    res = Double.parseDouble(valorA) + Double.parseDouble(valorB);
                } else if (operacion == '=') {
                    valorB = String.valueOf(res);
                    Resultado.setText(valorB + " + ");
                } else {
                    res = Double.parseDouble(valorB) + Float.parseFloat(valorA);
                }
                valorB = String.valueOf(res);
                Resultado.setText(valorB + " + ");
                valorA = "";
                operacion = '+';
            }
        });

        botonResta.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (valorB.equals("")) {
                    valorB = "0";
                }
                if (valorA.equals("")) {
                    valorA = "0";
                }
                else if (operacion == '0') {
                    res = Double.parseDouble(valorA) - Double.parseDouble(valorB);
                } else if (operacion == '=') {
                    valorB = String.valueOf(res);
                    Resultado.setText(valorB + " - ");
                } else {
                    res = Double.parseDouble(valorB) - Float.parseFloat(valorA);
                }
                valorB = String.valueOf(res);
                Resultado.setText(valorB + " - ");
                valorA = "";
                operacion = '-';
            }
        });

        botonMulti.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (valorB.equals("")) {
                    valorB = "1";
                }
                if (valorA.equals("")) {
                    valorA = "0";
                }
                else if (operacion == '0') {
                    res = Double.parseDouble(valorA) * Double.parseDouble(valorB);
                } else if (operacion == '=') {
                    valorB = String.valueOf(res);
                    Resultado.setText(valorB + " X ");
                } else {
                    res = Double.parseDouble(valorB) * Float.parseFloat(valorA);
                }
                valorB = String.valueOf(res);
                Resultado.setText(valorB + " X ");
                valorA = "";
                operacion = '*';
            }
        });

        botonDivi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (valorB.equals("")) {
                    valorB = "1";
                }
                if (valorA.equals("")) {
                    valorA = "0";
                }
                else if (operacion == '0') {
                    res = Double.parseDouble(valorA) / Double.parseDouble(valorB);
                } else if (operacion == '=') {
                    valorB = String.valueOf(res);
                    Resultado.setText(valorB + " / ");
                } else {
                    res = Double.parseDouble(valorB) / Float.parseFloat(valorA);
                }
                valorB = String.valueOf(res);
                Resultado.setText(valorB + " / ");
                valorA = "";
                operacion = '/';
            }
        });

        botonAC.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                valorA = "";
                valorB = "";
                res = 0;
                operacion = '0';
                Resultado.setText(valorA);
            }
        });

        botonC.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (valorA.length()>0){
                    valorA = valorA.substring(0, valorA.length() - 1);
                    Resultado.setText(valorA);}
            }
        });

        //Botones calculadora cientifica
        /////////////////////////////////
        botonSen.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Resultado.setText("Sen(");
                valorA = "";
                valorB = "";

                operacion = 's';
            }
        });


        botonCos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Resultado.setText("Cos(");
                valorA = "";
                valorB = "";

                operacion = 'c';
            }
        });


        botonTan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Resultado.setText("Tan(");
                valorA = "";
                valorB = "";

                operacion = 't';
            }
        });

        botonxy.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Resultado.setText(valorA+"^");

                valorB = valorA;
                valorA = "";

                operacion = '^';
            }
        });


        cambio.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent (Calculadora_Cientifica.this, MainActivity.class);
                if (res!=0){intent.putExtra("valorA", String.valueOf(res));}
                else {
                    intent.putExtra("valorA", valorA);}
                valorB="";
                res=0;
                intent.putExtra("valorB", valorB);
                intent.putExtra("res", res);
                intent.putExtra("contador", 1);

                startActivity(intent);



            }
        });

        //////////////////////////////////



        botonIgual.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (valorB.equals("")) {
                    valorB = "0";
                }
                if (valorA.equals("")) {
                    valorA = "0";
                }
                try {


                    switch (operacion) {
                        case '+':
                            res = Double.parseDouble(valorB) + Float.parseFloat(valorA);
                            Resultado.setText(valorB + " + " + valorA + " = " + res);
                            valorB = String.valueOf(res);
                            operacion = '=';
                            break;
                        case '-':
                            res = Double.parseDouble(valorB) - Float.parseFloat(valorA);
                            Resultado.setText(valorB + " - " + valorA + " = " + res);
                            valorB = String.valueOf(res);
                            operacion = '=';
                            break;

                        case '*':
                            res = Double.parseDouble(valorB) * Float.parseFloat(valorA);
                            Resultado.setText(valorB + " X " + valorA + " = " + res);
                            valorB = String.valueOf(res);
                            operacion = '=';
                            break;

                        case '/':
                            res = Double.parseDouble(valorB) / Float.parseFloat(valorA);
                            Resultado.setText(valorB + " / " + valorA + " = " + res);
                            valorB = String.valueOf(res);
                            operacion = '=';
                            break;


                        case 's':
                            res = Math.sin(Math.toRadians(Double.parseDouble(valorA)));
                            Resultado.setText("Sen(" + valorA + "º) = " + res);
                            valorA = "";
                            valorB = "";
                            operacion = '=';
                            break;

                        case 'c':
                            res = Math.cos(Math.toRadians(Double.parseDouble(valorA)));
                            Resultado.setText("Cos(" + valorA + "º) = " + res);
                            valorA = "";
                            valorB = "";
                            operacion = '=';
                            break;

                        case 't':
                            res = Math.tan(Math.toRadians(Double.parseDouble(valorA)));
                            Resultado.setText("Tan(" + valorA + "º) = " + res);
                            valorA = "";
                            valorB = "";
                            operacion = '=';
                            break;

                        case '^':
                            res = Math.pow(Double.parseDouble(valorB), Double.parseDouble(valorA));
                            Resultado.setText(valorB + "^" + valorA + " = " + res);
                            valorB = String.valueOf(res);
                            operacion = '=';

                            break;

                        default:
                            res = Double.parseDouble(valorA);
                            Resultado.setText("RESULTADO= " + res);
                            valorA = "";
                            break;
                    }
                }catch (NumberFormatException e) {
                    // Manejo de error: Los valores ingresados no son numéricos
                    showToast("Ingrese valores numéricos válidos");
                } catch (Exception e) {
                    // Manejo de otros errores
                    showToast("Error al realizar la operación");
                }

            }
        });


    }

}