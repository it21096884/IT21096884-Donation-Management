package com.example.donationmanagementpage3;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class InsertDonations extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_insert_donations);

    }

    public void adddonation(View view) {
        Toast.makeText(this,"Donation Added",Toast.LENGTH_SHORT).show();
    }
}