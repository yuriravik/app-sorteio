package br.com.yuriravik.appsorteio;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void alterarTexto(View view){
        TextView texto = findViewById(R.id.textView);
        EditText x = findViewById(R.id.editTextTextPersonName2);
        int i = new Integer(x.getText().toString());
        int numero = new Random().nextInt(i) ;

        texto.setText("o numero sorteado foi:"+numero);

    }

}