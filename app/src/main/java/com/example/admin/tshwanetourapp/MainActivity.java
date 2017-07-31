package com.example.admin.tshwanetourapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    Button buttonGuestH;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        buttonGuestH = (Button)findViewById(R.id.btnGuestH);



    }
    public  void onClick(View view){

        Intent oo = new Intent(MainActivity.this,GuestHouseFrontEnd.class);
        startActivity(oo);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.main,menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id=item.getItemId();

        if(id==R.id.btnAdmin){

            Intent intentAdmin = new Intent(MainActivity.this,AdminGuestHose.class);
            startActivity(intentAdmin);
            return true;
        }
        if (id==R.id.btnMuseum){

            Intent intMuseum = new Intent(MainActivity.this,GuestHouseFrontEnd.class);
            startActivity(intMuseum);
            return  true;
        }

        return true;
    }
}
