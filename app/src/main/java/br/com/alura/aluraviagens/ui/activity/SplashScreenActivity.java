package br.com.alura.aluraviagens.ui.activity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

import androidx.appcompat.app.AppCompatActivity;

import br.com.alura.aluraviagens.R;

public class SplashScreenActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_screen);
        adicionaDelay();
    }

    private void adicionaDelay() {
        Handler handle = new Handler();
        handle.postDelayed(new Runnable() {
            @Override public void run() {
                mostraListaDePacotes();
            }
        }, 2000);
    }

    private void mostraListaDePacotes() {
        Intent intent = new Intent(SplashScreenActivity.this, ListaPacotesActivity.class);
        startActivity(intent);
    }
}
