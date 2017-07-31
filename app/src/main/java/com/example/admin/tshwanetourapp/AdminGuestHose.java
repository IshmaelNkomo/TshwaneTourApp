package com.example.admin.tshwanetourapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class AdminGuestHose extends AppCompatActivity {

    EditText editImageUrl, editGuestHouseName, editAddress, editTel;
    Button btnAdd;

    //    Creating database reference
    DatabaseReference databaseGuestHouses;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_admin_guest_hose);

        //        Connecting to the database
        databaseGuestHouses = FirebaseDatabase.getInstance().getReference("Guest Houses");

        editAddress = (EditText) findViewById(R.id.editAddress);
        editGuestHouseName = (EditText) findViewById(R.id.editName);
        editImageUrl = (EditText) findViewById(R.id.editimgUrl);
        editTel = (EditText) findViewById(R.id.editTels);

        btnAdd = (Button)findViewById(R.id.btnAdd);

        btnAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                addGuestHouse();

            }
        });


    }

    public void addGuestHouse() {

        String imageUrl = editImageUrl.getText().toString();
        String guestHouseName = editGuestHouseName.getText().toString();
        String address = editAddress.getText().toString();
        String tel = editTel.getText().toString();

        if (!TextUtils.isEmpty(imageUrl)) {


//            Creating a unique id for every guest house added
            String id = databaseGuestHouses.push().getKey();

            GuestHouses guestHouses = new GuestHouses(id, guestHouseName, address,tel,imageUrl);

            databaseGuestHouses.child(id).setValue(guestHouses);

            Toast.makeText(this, "Guest House Added", Toast.LENGTH_LONG).show();


        }else {

            Toast.makeText(this, "Make sure you entered everything", Toast.LENGTH_LONG).show();
        }
    }
}
