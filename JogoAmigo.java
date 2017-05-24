package gabriela.jogodavelha;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.Toast;

public class JogoAmigo extends AppCompatActivity {
    Button Num1;
    Button Num2;
    Button Num3;
    Button Num4;
    Button Num5;
    Button Num6;
    Button Num7;
    Button Num8;
    Button Num9;
    String Jogador;
    String Jogador2;
    Button Jogar;
    Integer Jogada;
    RadioButton Opx;
    RadioButton Opo;
    String TextNum1;
    String TextNum2;
    String TextNum3;
    String TextNum4;
    String TextNum5;
    String TextNum6;
    String TextNum7;
    String TextNum8;
    String TextNum9;

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

        TextNum1 = Num1.getText().toString().trim();
        TextNum2 = Num2.getText().toString().trim();
        TextNum3 = Num3.getText().toString().trim();
        TextNum4 = Num4.getText().toString().trim();
        TextNum5 = Num5.getText().toString().trim();
        TextNum6 = Num6.getText().toString().trim();
        TextNum7 = Num7.getText().toString().trim();
        TextNum8 = Num8.getText().toString().trim();
        TextNum9 = Num9.getText().toString().trim();
        Jogada = 0;
        Opo  = (RadioButton)findViewById(R.id.opO);
        Opx  = (RadioButton)findViewById(R.id.opX);
        Jogar = (Button)findViewById(R.id.Jogar);
        Jogar.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Num1.setEnabled(true);
                Num2.setEnabled(true);
                Num3.setEnabled(true);
                Num4.setEnabled(true);
                Num5.setEnabled(true);
                Num6.setEnabled(true);
                Num7.setEnabled(true);
                Num8.setEnabled(true);
                Num9.setEnabled(true);

                Opo.setVisibility(View.GONE);
                Opx.setVisibility(View.GONE);
                Jogar.setVisibility(View.GONE);
                if(Opo.isChecked()){
                    Jogador = "O";
                    Jogador2 = "X";
                }else if(Opx.isChecked()){
                    Jogador = "X";
                    Jogador2 = "O";
                }
                Toast.makeText(JogoAmigo.this,"Começou", Toast.LENGTH_LONG).show();
            }
        });
    }
    public void onClick(View v) {

        switch(v.getId()){
            case R.id.Num1:
                Num1.setEnabled(false);
                if(Jogada % 2 == 0){
                    Num1.setText(Jogador);
                    Toast.makeText(JogoAmigo.this,"Vez do jogador " + Jogador2, Toast.LENGTH_LONG).show();
                }else{
                    Num1.setText(Jogador2);
                    Toast.makeText(JogoAmigo.this,"Vez do jogador " + Jogador, Toast.LENGTH_LONG).show();
                }
                Jogada++;
                VerificarJogo();
                break;
            case R.id.Num2:
                Num2.setEnabled(false);
                if(Jogada % 2 == 0){
                    Num2.setText(Jogador);
                    Toast.makeText(JogoAmigo.this,"Vez do jogador " + Jogador2, Toast.LENGTH_LONG).show();
                }else{
                    Num2.setText(Jogador2);
                    Toast.makeText(JogoAmigo.this,"Vez do jogador " + Jogador, Toast.LENGTH_LONG).show();
                }
                Jogada++;
                VerificarJogo();
                break;
            case R.id.Num3:
                Num3.setEnabled(false);
                if(Jogada % 2 == 0){
                    Num3.setText(Jogador);
                    Toast.makeText(JogoAmigo.this,"Vez do jogador " + Jogador2, Toast.LENGTH_LONG).show();
                }else{
                    Num3.setText(Jogador2);
                    Toast.makeText(JogoAmigo.this,"Vez do jogador " + Jogador, Toast.LENGTH_LONG).show();
                }
                Jogada++;
                VerificarJogo();
                break;
            case R.id.Num4:
                Num4.setEnabled(false);
                if(Jogada % 2 == 0){
                    Num4.setText(Jogador);
                    Toast.makeText(JogoAmigo.this,"Vez do jogador " + Jogador2, Toast.LENGTH_LONG).show();
                }else{
                    Num4.setText(Jogador2);
                    Toast.makeText(JogoAmigo.this,"Vez do jogador " + Jogador, Toast.LENGTH_LONG).show();
                }
                Jogada++;
                VerificarJogo();
                break;
            case R.id.Num5:
                Num5.setEnabled(false);
                if(Jogada % 2 == 0){
                    Num5.setText(Jogador);
                    Toast.makeText(JogoAmigo.this,"Vez do jogador " + Jogador2, Toast.LENGTH_LONG).show();
                }else{
                    Num5.setText(Jogador2);
                    Toast.makeText(JogoAmigo.this,"Vez do jogador " + Jogador, Toast.LENGTH_LONG).show();
                }
                Jogada++;
                VerificarJogo();
                break;
            case R.id.Num6:
                Num6.setEnabled(false);
                if(Jogada % 2 == 0){
                    Num6.setText(Jogador);
                    Toast.makeText(JogoAmigo.this,"Vez do jogador " + Jogador2, Toast.LENGTH_LONG).show();
                }else{
                    Num6.setText(Jogador2);
                    Toast.makeText(JogoAmigo.this,"Vez do jogador " + Jogador, Toast.LENGTH_LONG).show();
                }
                Jogada++;
                VerificarJogo();
                break;
            case R.id.Num7:
                Num7.setEnabled(false);
                if(Jogada % 2 == 0){
                    Num7.setText(Jogador);
                    Toast.makeText(JogoAmigo.this,"Vez do jogador " + Jogador2, Toast.LENGTH_LONG).show();
                }else{
                    Num7.setText(Jogador2);
                    Toast.makeText(JogoAmigo.this,"Vez do jogador " + Jogador, Toast.LENGTH_LONG).show();
                }
                Jogada++;
                VerificarJogo();
                break;
            case R.id.Num8:
                Num8.setEnabled(false);
                if(Jogada % 2 == 0){
                    Num8.setText(Jogador);
                    Toast.makeText(JogoAmigo.this,"Vez do jogador " + Jogador2, Toast.LENGTH_LONG).show();
                }else{
                    Num8.setText(Jogador2);
                    Toast.makeText(JogoAmigo.this,"Vez do jogador " + Jogador, Toast.LENGTH_LONG).show();
                }
                Jogada++;
                VerificarJogo();
                break;
            case R.id.Num9:
                Num9.setEnabled(false);
                if(Jogada % 2 == 0){
                    Num9.setText(Jogador);
                    Toast.makeText(JogoAmigo.this,"Vez do jogador " + Jogador2, Toast.LENGTH_LONG).show();
                }else{
                    Num9.setText(Jogador2);
                    Toast.makeText(JogoAmigo.this,"Vez do jogador " + Jogador, Toast.LENGTH_LONG).show();
                }
                Jogada++;
                VerificarJogo();
                break;
        }

    }
    private void VerificarJogo(){
        if(!TextNum1.equals("") && !TextNum2.equals("") && !TextNum3.equals("") && !TextNum4.equals("") && !TextNum5.equals("")&&
                !TextNum6.equals("") && !TextNum7.equals("") && !TextNum8.equals("") && !TextNum9.equals("")){
            Toast.makeText(JogoAmigo.this,"Deu velha!", Toast.LENGTH_LONG).show();
            Ganhou();
        }
        else if((TextNum1.equals(TextNum2) && TextNum2.equals(TextNum3)) && (!TextNum1.equals("") && !TextNum2.equals("") && !TextNum3.equals(""))){
            Toast.makeText(JogoAmigo.this,"O jogador " + TextNum1 + " Venceu!", Toast.LENGTH_LONG).show();
            Ganhou();
        }
        else if((TextNum4.equals(TextNum5) && TextNum5.equals(TextNum6)) && (!TextNum4.equals("") && !TextNum5.equals("") && !TextNum6.equals(""))){
            Toast.makeText(JogoAmigo.this,"O jogador " + TextNum4 + " Venceu!", Toast.LENGTH_LONG).show();
            Ganhou();
        }
        else if((TextNum7.equals(TextNum8) && TextNum8.equals(TextNum9)) && (!TextNum7.equals("") && !TextNum8.equals("") && !TextNum9.equals(""))){
            Toast.makeText(JogoAmigo.this,"O jogador " + TextNum7 + " Venceu!", Toast.LENGTH_LONG).show();
            Ganhou();
        }
        else if((TextNum1.equals(TextNum5) && TextNum5.equals(TextNum9)) && (!TextNum1.equals("") && !TextNum5.equals("") && !TextNum9.equals(""))){
            Toast.makeText(JogoAmigo.this,"O jogador " + TextNum1 + " Venceu!", Toast.LENGTH_LONG).show();
            Ganhou();
        }
        else if((TextNum3.equals(TextNum5) && TextNum5.equals(TextNum7)) && (!TextNum3.equals("") && !TextNum5.equals("") && !TextNum7.equals(""))){
            Toast.makeText(JogoAmigo.this,"O jogador " + TextNum3 + " Venceu!", Toast.LENGTH_LONG).show();
            Ganhou();
        }
        else if((TextNum1.equals(TextNum4) && TextNum4.equals(TextNum7)) && (!TextNum1.equals("") && !TextNum4.equals("") && !TextNum7.equals(""))){
            Toast.makeText(JogoAmigo.this,"O jogador " + TextNum1 + " Venceu!", Toast.LENGTH_LONG).show();
            Ganhou();
        }
        else if((TextNum2.equals(TextNum5) && TextNum5.equals(TextNum8)) && (!TextNum2.equals("") && !TextNum5.equals("") && !TextNum8.equals(""))){
            Toast.makeText(JogoAmigo.this,"O jogador " + TextNum2 + " Venceu!", Toast.LENGTH_LONG).show();
            Ganhou();
        }
        else if((TextNum3.equals(TextNum6) && TextNum6.equals(TextNum9)) && (!TextNum3.equals("") && !TextNum6.equals("") && !TextNum9.equals(""))){
            Toast.makeText(JogoAmigo.this,"O jogador " + TextNum3 + " Venceu!", Toast.LENGTH_LONG).show();
            Ganhou();
        }
    }
    private void Ganhou(){
        Num1.setEnabled(false);
        Num2.setEnabled(false);
        Num3.setEnabled(false);
        Num4.setEnabled(false);
        Num5.setEnabled(false);
        Num6.setEnabled(false);
        Num7.setEnabled(false);
        Num8.setEnabled(false);
        Num9.setEnabled(false);

        Num1.setText("");
        Num2.setText("");
        Num3.setText("");
        Num4.setText("");
        Num5.setText("");
        Num6.setText("");
        Num7.setText("");
        Num8.setText("");
        Num9.setText("");




    }

}
