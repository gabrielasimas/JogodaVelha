package gabriela.jogodavelha;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Random;

public class JogoSozinho extends AppCompatActivity {
    Button Num1;
    Button Num2;
    Button Num3;
    Button Num4;
    Button Num5;
    Button Num6;
    Button Num7;
    Button Num8;
    Button Num9;
    Integer Jogada = 0;
    String Jogador;
    String Computador;
    Integer randomInt;
    Boolean Passou = false;
    Boolean Encerrar = false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_jogo_amigo);

        Num1 = (Button)findViewById(R.id.Num1);
        Num2 = (Button)findViewById(R.id.Num2);
        Num3 = (Button)findViewById(R.id.Num3);
        Num4 = (Button)findViewById(R.id.Num4);
        Num5 = (Button)findViewById(R.id.Num5);
        Num6 = (Button)findViewById(R.id.Num6);
        Num7 = (Button)findViewById(R.id.Num7);
        Num8 = (Button)findViewById(R.id.Num8);
        Num9 = (Button)findViewById(R.id.Num9);
    }

    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.Num1:
                if(Num1.getText().equals(" ")) {
                    Num1.setText(Jogador);
                    Conferir();
                    Jogada++;
                    vez_Computador();
                }
                break;
            case R.id.Num2:
                if(Num2.getText().equals(" ")) {
                    Num2.setText(Jogador);
                    Conferir();
                    Jogada++;
                    vez_Computador();
                }
                break;
            case R.id.Num3:
                if(Num3.getText().equals(" ")) {
                    Num3.setText(Jogador);
                    Conferir();
                    Jogada++;
                    vez_Computador();
                }
                break;
            case R.id.Num4:
                if(Num4.getText().equals(" ")) {
                    Num4.setText(Jogador);
                    Conferir();
                    Jogada++;
                    vez_Computador();
                }
                break;
            case R.id.Num5:
                if(Num5.getText().equals(" ")) {
                    Num5.setText(Jogador);
                    Conferir();
                    Jogada++;
                    vez_Computador();
                }
                break;
            case R.id.Num6:
                if(Num6.getText().equals(" ")) {
                    Num6.setText(Jogador);
                    Conferir();
                    Jogada++;
                    vez_Computador();
                }
                break;
            case R.id.Num7:
                if(Num7.getText().equals(" ")) {
                    Num7.setText(Jogador);
                    Conferir();
                    Jogada++;
                    vez_Computador();
                }
                break;
            case R.id.Num8:
                if(Num8.getText().equals(" ")) {
                    Num8.setText(Jogador);
                    Conferir();
                    Jogada++;
                    vez_Computador();
                }
                break;
            case R.id.Num9:
                if(Num9.getText().equals(" ")) {
                    Num9.setText(Jogador);
                    Conferir();
                    Jogada++;
                    vez_Computador();
                }
                break;
        }
    }

    public void vez_Computador(){
        if(!Encerrar){
            if(     (Num2.getText().equals(Num3.getText()) && Num2.getText().equals(Computador) && Num1.getText().equals(" ")) ||
                    (Num5.getText().equals(Num9.getText()) && Num5.getText().equals(Computador) && Num1.getText().equals(" ")) ||
                    (Num4.getText().equals(Num7.getText()) && Num4.getText().equals(Computador) && Num1.getText().equals(" "))){

                Num1.setText(Computador);
                Conferir();
                Jogada++;
            }
            else if(    (Num1.getText().equals(Num3.getText()) && Num1.getText().equals(Computador) && Num2.getText().equals(" ")) ||
                    (Num5.getText().equals(Num8.getText()) && Num5.getText().equals(Computador) && Num2.getText().equals(" "))){

                Num2.setText(Computador);
                Conferir();
                Jogada++;
            }
            else if(    (Num1.getText().equals(Num2.getText()) && Num1.getText().equals(Computador) && Num3.getText().equals(" ")) ||
                    (Num5.getText().equals(Num7.getText()) && Num5.getText().equals(Computador) && Num3.getText().equals(" ")) ||
                    (Num6.getText().equals(Num9.getText()) && Num6.getText().equals(Computador) && Num3.getText().equals(" "))){

                Num3.setText(Computador);
                Conferir();
                Jogada++;
            }
            else if(    (Num5.getText().equals(Num6.getText()) && Num6.getText().equals(Computador) && Num4.getText().equals(" ")) ||
                    (Num1.getText().equals(Num7.getText()) && Num7.getText().equals(Computador) && Num4.getText().equals(" "))){

                Num4.setText(Computador);
                Conferir();
                Jogada++;
            }
            else if(    (Num4.getText().equals(Num6.getText()) && Num4.getText().equals(Computador) && Num5.getText().equals(" ")) ||
                    (Num2.getText().equals(Num8.getText()) && Num2.getText().equals(Computador) && Num5.getText().equals(" ")) ||
                    (Num1.getText().equals(Num9.getText()) && Num1.getText().equals(Computador) && Num5.getText().equals(" ")) ||
                    (Num3.getText().equals(Num7.getText()) && Num3.getText().equals(Computador) && Num5.getText().equals(" "))){

                Num5.setText(Computador);
                Conferir();
                Jogada++;
            }
            else if(    (Num4.getText().equals(Num5.getText()) && Num4.getText().equals(Computador) && Num6.getText().equals(" ")) ||
                    (Num3.getText().equals(Num9.getText()) && Num3.getText().equals(Computador) && Num6.getText().equals(" "))){

                Num6.setText(Computador);
                Conferir();
                Jogada++;
            }
            else if(    (Num8.getText().equals(Num9.getText()) && Num8.getText().equals(Computador) && Num7.getText().equals(" ")) ||
                    (Num3.getText().equals(Num5.getText()) && Num3.getText().equals(Computador) && Num7.getText().equals(" ")) ||
                    (Num1.getText().equals(Num4.getText()) && Num1.getText().equals(Computador) && Num7.getText().equals(" "))){

                Num7.setText(Computador);
                Conferir();
                Jogada++;
            }
            else if(    (Num7.getText().equals(Num9.getText()) && Num7.getText().equals(Computador) && Num8.getText().equals(" ")) ||
                    (Num2.getText().equals(Num5.getText()) && Num2.getText().equals(Computador) && Num8.getText().equals(" "))){

                Num8.setText(Computador);
                Conferir();
                Jogada++;
            }
            else if(    (Num8.getText().equals(Num7.getText()) && Num8.getText().equals(Computador) && Num9.getText().equals(" ")) ||
                    (Num3.getText().equals(Num6.getText()) && Num3.getText().equals(Computador) && Num9.getText().equals(" ")) ||
                    (Num1.getText().equals(Num5.getText()) && Num1.getText().equals(Computador) && Num9.getText().equals(" "))){

                Num9.setText(Computador);
                Conferir();
                Jogada++;
            }/*Bloquear*/
            else if(    (Num2.getText().equals(Num3.getText()) && !Num2.getText().equals(" ") && Num1.getText().equals(" ")) ||
                    (Num5.getText().equals(Num9.getText()) && !Num5.getText().equals(" ") && Num1.getText().equals(" ")) ||
                    (Num4.getText().equals(Num7.getText()) && !Num4.getText().equals(" ") && Num1.getText().equals(" "))){

                Num1.setText(Computador);
                Conferir();
                Jogada++;
            }
            else if(    (Num1.getText().equals(Num3.getText()) && !Num1.getText().equals(" ") && Num2.getText().equals(" ")) ||
                    (Num5.getText().equals(Num8.getText()) && !Num5.getText().equals(" ") && Num2.getText().equals(" "))){

                Num2.setText(Computador);
                Conferir();
                Jogada++;
            }
            else if(    (Num1.getText().equals(Num2.getText()) && !Num1.getText().equals(" ") && Num3.getText().equals(" ")) ||
                    (Num5.getText().equals(Num7.getText()) && !Num5.getText().equals(" ") && Num3.getText().equals(" ")) ||
                    (Num6.getText().equals(Num9.getText()) && !Num6.getText().equals(" ") && Num3.getText().equals(" "))){

                Num3.setText(Computador);
                Conferir();
                Jogada++;
            }
            else if(    (Num5.getText().equals(Num6.getText()) && !Num6.getText().equals(" ") && Num4.getText().equals(" ")) ||
                    (Num1.getText().equals(Num7.getText()) && !Num7.getText().equals(" ") && Num4.getText().equals(" "))){

                Num4.setText(Computador);
                Conferir();
                Jogada++;
            }
            else if(    (Num4.getText().equals(Num6.getText()) && !Num4.getText().equals(" ") && Num5.getText().equals(" ")) ||
                    (Num2.getText().equals(Num8.getText()) && !Num2.getText().equals(" ") && Num5.getText().equals(" ")) ||
                    (Num1.getText().equals(Num9.getText()) && !Num1.getText().equals(" ") && Num5.getText().equals(" ")) ||
                    (Num3.getText().equals(Num7.getText()) && !Num3.getText().equals(" ") && Num5.getText().equals(" "))){

                Num5.setText(Computador);
                Conferir();
                Jogada++;
            }
            else if(    (Num4.getText().equals(Num5.getText()) && !Num4.getText().equals(" ") && Num6.getText().equals(" ")) ||
                    (Num3.getText().equals(Num9.getText()) && !Num3.getText().equals(" ") && Num6.getText().equals(" "))){

                Num6.setText(Computador);
                Conferir();
                Jogada++;
            }
            else if(    (Num8.getText().equals(Num9.getText()) && !Num8.getText().equals(" ") && Num7.getText().equals(" ")) ||
                    (Num3.getText().equals(Num5.getText()) && !Num3.getText().equals(" ") && Num7.getText().equals(" ")) ||
                    (Num1.getText().equals(Num4.getText()) && !Num1.getText().equals(" ") && Num7.getText().equals(" "))){

                Num7.setText(Computador);
                Conferir();
                Jogada++;
            }
            else if(    (Num7.getText().equals(Num9.getText()) && !Num7.getText().equals(" ") && Num8.getText().equals(" ")) ||
                    (Num2.getText().equals(Num5.getText()) && !Num2.getText().equals(" ") && Num8.getText().equals(" "))){

                Num8.setText(Computador);
                Conferir();
                Jogada++;
            }
            else if(    (Num8.getText().equals(Num7.getText()) && !Num8.getText().equals(" ") && Num9.getText().equals(" ")) ||
                    (Num3.getText().equals(Num6.getText()) && !Num3.getText().equals(" ") && Num9.getText().equals(" ")) ||
                    (Num1.getText().equals(Num5.getText()) && !Num1.getText().equals(" ") && Num9.getText().equals(" "))){

                Num9.setText(Computador);
                Conferir();
                Jogada++;
            }
            else{
                Computador_randomize();
            }
        }
    }

    public void Computador_randomize() {
        Passou = false;

        while (!Passou){
            Random randomGenerator = new Random();
            randomInt = randomGenerator.nextInt(10);
            /*Toast.makeText(this,randomInt.toString(),Toast.LENGTH_SHORT).show();*/
            switch (randomInt){
                case 1:
                    if(Num1.getText().equals(" ")){
                        Num1.setText(Computador);
                        Conferir();
                        Jogada++;
                        Passou = true;
                    }
                    break;
                case 2:
                    if(Num2.getText().equals(" ")){
                        Num2.setText(Computador);
                        Conferir();
                        Jogada++;
                        Passou = true;
                    }
                    break;
                case 3:
                    if(Num3.getText().equals(" ")){
                        Num3.setText(Computador);
                        Conferir();
                        Jogada++;
                        Passou = true;
                    }
                    break;
                case 4:
                    if(Num4.getText().equals(" ")){
                        Num4.setText(Computador);
                        Conferir();
                        Jogada++;
                        Passou = true;
                    }
                    break;
                case 5:
                    if(Num5.getText().equals(" ")){
                        Num5.setText(Computador);
                        Conferir();
                        Jogada++;
                        Passou = true;
                    }
                    break;
                case 6:
                    if(Num6.getText().equals(" ")) {
                        Num6.setText(Computador);
                        Conferir();
                        Jogada++;
                        Passou = true;
                    }
                    break;
                case 7:
                    if(Num7.getText().equals(" ")){
                        Num7.setText(Computador);
                        Conferir();
                        Jogada++;
                        Passou = true;
                    }
                    break;
                case 8:
                    if(Num8.getText().equals(" ")){
                        Num8.setText(Computador);
                        Conferir();
                        Jogada++;
                        Passou = true;
                    }
                    break;
                case 9:
                    if(Num9.getText().equals(" ")){
                        Num9.setText(Computador);
                        Conferir();
                        Jogada++;
                        Passou = true;
                    }
                    break;
                default:

                    break;
            }
        }
    }

    public void Conferir(){
        if(
                (Num1.getText().equals(Num2.getText()) && Num2.getText().equals(Num3.getText()) && !Num3.getText().equals(" ")) ||
                        (Num4.getText().equals(Num5.getText()) && Num5.getText().equals(Num6.getText()) && !Num6.getText().equals(" ")) ||
                        (Num7.getText().equals(Num8.getText()) && Num8.getText().equals(Num9.getText()) && !Num9.getText().equals(" ")) ||
                        (Num1.getText().equals(Num4.getText()) && Num4.getText().equals(Num7.getText()) && !Num7.getText().equals(" ")) ||
                        (Num2.getText().equals(Num5.getText()) && Num5.getText().equals(Num8.getText()) && !Num8.getText().equals(" ")) ||
                        (Num3.getText().equals(Num6.getText()) && Num6.getText().equals(Num9.getText()) && !Num9.getText().equals(" ")) ||
                        (Num1.getText().equals(Num5.getText()) && Num5.getText().equals(Num9.getText()) && !Num9.getText().equals(" ")) ||
                        (Num3.getText().equals(Num5.getText()) && Num5.getText().equals(Num7.getText()) && !Num7.getText().equals(" "))
                ){
            Encerrar();
        }
        else if(
                !Num1.getText().equals(" ") &&
                        !Num2.getText().equals(" ") &&
                        !Num3.getText().equals(" ") &&
                        !Num4.getText().equals(" ") &&
                        !Num5.getText().equals(" ") &&
                        !Num6.getText().equals(" ") &&
                        !Num7.getText().equals(" ") &&
                        !Num8.getText().equals(" ") &&
                        !Num9.getText().equals(" ")
                ){
            deu_velha();
        }
    }

    public void Encerrar(){
        Encerrar = true;
        Passou = true;

        if((Jogador.equals("X") && Jogada%2 == 1) || (Jogador.equals("O") && Jogada%2 == 0)){
            Toast.makeText(JogoSozinho.this,"Você perdeu!", Toast.LENGTH_LONG).show();
        }
        else{
            Toast.makeText(JogoSozinho.this,"Você ganhou!", Toast.LENGTH_LONG).show();
        }

        if(Num1.getText().equals(" ")){
            Num1.setText("");
        }
        if(Num2.getText().equals(" ")){
            Num2.setText("");
        }
        if(Num3.getText().equals(" ")){
            Num3.setText("");
        }
        if(Num4.getText().equals(" ")){
            Num4.setText("");
        }
        if(Num5.getText().equals(" ")){
            Num5.setText("");
        }
        if(Num6.getText().equals(" ")){
            Num6.setText("");
        }
        if(Num7.getText().equals(" ")){
            Num7.setText("");
        }
        if(Num8.getText().equals(" ")){
            Num8.setText("");
        }
        if(Num9.getText().equals(" ")){
            Num9.setText("");
        }
    }
    public void deu_velha(){
        Encerrar = true;
        Passou = true;
        Toast.makeText(JogoSozinho.this,"Deu velha!", Toast.LENGTH_LONG).show();
    }

    public void jogar_como_x(View view) {
        Num1.setText(" ");
        Num2.setText(" ");
        Num3.setText(" ");
        Num4.setText(" ");
        Num5.setText(" ");
        Num6.setText(" ");
        Num7.setText(" ");
        Num8.setText(" ");
        Num9.setText(" ");
        Jogada = 0;
        Jogador = "X";
        Computador = "O";
        Encerrar = false;
    }

    public void jogar_como_o(View view) {
        Num1.setText(" ");
        Num2.setText(" ");
        Num3.setText(" ");
        Num4.setText(" ");
        Num5.setText(" ");
        Num6.setText(" ");
        Num7.setText(" ");
        Num8.setText(" ");
        Num9.setText(" ");
        Jogada = 1;
        Jogador = "O";
        Computador = "X";
        Encerrar = false;
    }
}