package com.example.asus.panicbutton;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class PanicButton extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_panic_button);
    }

    public void sendingLaporan(View view){
        Intent intent = new Intent(this,Laporan.class);
        startActivity(intent);
    }
}
