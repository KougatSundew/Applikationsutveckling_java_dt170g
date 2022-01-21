package com.jool1904.labb1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button refreshBtn = findViewById(R.id.btnRefresh);
        refreshBtn.setOnClickListener(view -> {
            Log.i(refreshBtn.getClass().toString(), "Refresh button clicked");
        });
    }
}