package com.example.itmedbook;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

import androidx.appcompat.app.AppCompatActivity;

public class ResearchActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_research);
        MainFragment fragment = new MainFragment();
        getSupportFragmentManager().beginTransaction().add(R.id.ResearchFrame,fragment).commit();

        Spinner spinnerRes = findViewById(R.id.spinnerRes);
        String [] TypeResearches = {"Общеклинические исследования","УЗИ","Ренген","ЭКГ","МРТ","ЭЭГ","Эндоскопия","Маммография","КТ"};
        ArrayAdapter<String> adapter = new ArrayAdapter(this,android.R.layout.simple_spinner_item, TypeResearches);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinnerRes.setAdapter(adapter);
    }
}