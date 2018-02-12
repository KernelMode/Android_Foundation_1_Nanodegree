package com.example.ankur.musicstructure;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class PaymentActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_payment);
        setTitle("Android Pay");

        Button backToMain = findViewById(R.id.MainMenuB);
        backToMain.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent back = new Intent(PaymentActivity.this, MainActivity.class);
                startActivity(back);
            }
        });
    }
}
