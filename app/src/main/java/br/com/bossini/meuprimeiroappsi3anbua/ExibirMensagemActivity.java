package br.com.bossini.meuprimeiroappsi3anbua;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

public class ExibirMensagemActivity extends AppCompatActivity {

    private TextView exibeTextoTextView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_exibir_mensagem);
        exibeTextoTextView = (TextView) findViewById(R.id.exibeTextoTextView);
        Intent i = getIntent();
        Bundle b = i.getExtras();
        String texto = b.getString("txt");
        exibeTextoTextView.setText(texto);
    }
}
