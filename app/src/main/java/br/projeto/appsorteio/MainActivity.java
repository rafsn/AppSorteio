package br.projeto.appsorteio;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import org.w3c.dom.Text;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    @SuppressLint("SetTextI18n")
    public void jogar(View view){
        TextView textResultado;
        textResultado = findViewById(R.id.textResultado);

        int numero = new Random().nextInt(11);

        textResultado.setText("Número sorteado: " + numero);
    }
}