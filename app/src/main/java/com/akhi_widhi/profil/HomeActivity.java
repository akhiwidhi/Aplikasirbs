package com.akhi_widhi.profil;

import android.content.DialogInterface;
import android.content.Intent;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.view.View;
import android.widget.CalendarView;
import android.widget.Toast;

public class HomeActivity extends AppCompatActivity {
CardView kartu;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        kartu = findViewById(R.id.card);
        kartu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(HomeActivity.this,Activity_input.class));
            }
        });
    }

    public void about(View view) {
        new AlertDialog.Builder(this)
                .setIcon(R.drawable.elephant)
                .setTitle("About This App")
                .setMessage("Ini adalah aplikasi buatan saya\n\nWidhiSableng' akhi")
                .setPositiveButton("OK", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {

                    }
                })
                .create()
                .show();
        Toast.makeText(this, "Nama paket ini adalah blalalalaalal", Toast.LENGTH_SHORT).show();
    }
}

