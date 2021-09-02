package com.example.foodie_faster;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class congraturating extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_congraturating);
    }
    public void backto(View view ){
        Intent intent = new Intent(congraturating.this, Main_Page.class);
        startActivity(intent);
    }

}