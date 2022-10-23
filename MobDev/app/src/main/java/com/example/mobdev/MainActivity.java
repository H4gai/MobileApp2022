package com.example.mobdev;

import static android.app.PendingIntent.getActivity;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void nextActivity(View v){
        Intent switchActivityIntent = new Intent(this, MainActivity2.class);
        startActivity(switchActivityIntent);
    }

    public void nextActivity(MenuItem item) {
        Intent switchActivityIntent = new Intent(this, MainActivity2.class);
        startActivity(switchActivityIntent);
    }

    public void kontakActivity(View v){
        Intent switchActivityIntent = new Intent(this, MainActivity4.class);
        startActivity(switchActivityIntent);
    }

    public void showQRActivity(View v){
        Intent switchActivityIntent = new Intent(this, MainActivity3.class);
        startActivity(switchActivityIntent);
    }

    public void callAlert(View v){
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setMessage("APLIKASI AKAN MENGIRIMKAN PANGGILAN SOS KE SETIAP KONTAK ANDA, TERUSKAN?")
                .setTitle("PANGGILAN SOS")
                .setPositiveButton("KIRIM", new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int id) {
                        // mulai
                    }
                })
                .setNegativeButton("BATAL", new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int id) {
                        // batal
                    }
                });

        AlertDialog dialog = builder.create();
        dialog.show();
    }
}


