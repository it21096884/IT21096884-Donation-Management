package com.example.donationmanagementpage3;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.provider.MediaStore;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {


    private final int gallery_get_code = 1000;
    ImageView imagegallery;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button insertbtn = findViewById(R.id.insertbtn);
        insertbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intendisert = new Intent(MainActivity.this,InsertDonations.class);
                startActivity(intendisert);
            }
        });



    }


    }
