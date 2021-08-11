package com.example.tictactoeoe;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class PlayerSetup extends AppCompatActivity {

    private EditText player1;
    private EditText player2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.player_setup);

        player1 = findViewById(R.id.player1Name);
        player2 = findViewById(R.id.player2Name);
    }
    public void startGame(View view){
        String player1Name = player1.getText().toString();
        String player2Name = player2.getText().toString();

        Intent intent = new Intent(PlayerSetup.this, GameActivity.class);
        intent.putExtra("player_name1", player1Name);
        intent.putExtra("player_name2", player2Name);
        startActivity(intent);
    }
}