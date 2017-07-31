package com.example.admin.tshwanetourapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.google.firebase.database.ChildEventListener;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

import java.lang.reflect.Array;
import java.util.List;

public class GuestHouseFrontEnd extends AppCompatActivity {

    List<String> guestHousesList;
    ListView listViewGuestHouses;


    //    Creating database reference
   DatabaseReference databaseGuestHouses;


    @Override
    protected void onStart() {
        super.onStart();


    }



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_guest_house_front_end);

        //        Connecting to the database
       databaseGuestHouses = FirebaseDatabase.getInstance().getReference("-Kq6zVnZTnFIia57EZT3");



        listViewGuestHouses = (ListView)findViewById(R.id.listViewGuestHouses);


        databaseGuestHouses.addChildEventListener(new ChildEventListener() {
            @Override
            public void onChildAdded(DataSnapshot dataSnapshot, String s) {
                String guestHouses = dataSnapshot.getValue(String.class);


                guestHousesList.add(guestHouses);
                ArrayAdapter<String> adapter = new ArrayAdapter<String>(GuestHouseFrontEnd.this,android.R.layout.simple_dropdown_item_1line,guestHousesList);
                listViewGuestHouses.setAdapter(adapter);
            }

            @Override
            public void onChildChanged(DataSnapshot dataSnapshot, String s) {

            }

            @Override
            public void onChildRemoved(DataSnapshot dataSnapshot) {

            }

            @Override
            public void onChildMoved(DataSnapshot dataSnapshot, String s) {

            }

            @Override
            public void onCancelled(DatabaseError databaseError) {

            }
        });


//        databaseGuestHouses.addValueEventListener(new ValueEventListener() {
//            @Override
//            public void onDataChange(DataSnapshot dataSnapshot) {
//
//                guestHousesList.clear();
//
//                for(DataSnapshot artistSnapshot : dataSnapshot.getChildren()){
//
//                    GuestHouses guestHouses = artistSnapshot.getValue(GuestHouses.class);
//
//                    guestHousesList.add(guestHouses);
//                }
//
//                GuestHouseLists adapter = new GuestHouseLists(GuestHouseFrontEnd.this,guestHousesList);
//                listViewGuestHouses.setAdapter(adapter);
//            }
//
//            @Override
//            public void onCancelled(DatabaseError databaseError) {
//
//            }
//        });


    }

}
