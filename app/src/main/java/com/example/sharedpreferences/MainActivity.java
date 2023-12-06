package com.example.sharedpreferences;

import androidx.appcompat.app.AppCompatActivity;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.preference.PreferenceManager;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import java.util.prefs.Preferences;

public class MainActivity extends AppCompatActivity {
    public Button bt1;
    public Button bt2;
    SharedPreferences.Editor ed;
    SharedPreferences sp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        bt1=findViewById(R.id.bt1);
        bt2=findViewById(R.id.bt2);

        sp=PreferenceManager.getDefaultSharedPreferences(this);
         ed=sp.edit();

        bt1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ed.putString("name","saleh deek");
                ed.apply();

            }
        });
        bt2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String s=sp.getString("name","empty");
                Toast.makeText(MainActivity.this,s,Toast.LENGTH_SHORT).show();
            }
        });
    }
}