package com.example.studentwsb.higheroflower;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import java.util.Random;

public class MainActivity extends AppCompatActivity {
    int liczba;
    public void generatorliczb(){
        Random random = new Random();
        liczba =  random.nextInt(20) +1;
    }

    public void shot(View view){
        EditText editText = findViewById(R.id.editText);
        int zgadywanaLiczba = Integer.parseInt(editText.getText().toString());
        String message;
        if(liczba < zgadywanaLiczba){
            message = "Za duża. Wpisz mniejszą wartość";
        } else if (liczba > zgadywanaLiczba){
            message = " Za mała. Wpisz wiekszą wartość";
        } else {
            message = "Wygrałeś! Wylosowałem kolejną liczbę. Zgadnij!!";
            generatorliczb();
        }
        Toast.makeText(this,message,Toast.LENGTH_LONG).show();
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        generatorliczb();

    }
}
