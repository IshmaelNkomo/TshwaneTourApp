package com.example.admin.tshwanetourapp;

import android.app.Activity;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.List;

/**
 * Created by Ishmael Nkomo on 7/26/2017.
 */

public class GuestHouseLists extends ArrayAdapter<GuestHouses> {

    private Activity context;
    private List<GuestHouses> guestHousesList;

    public GuestHouseLists(Activity context, List<GuestHouses> guestHousesList ){

        super(context,R.layout.list_layout,guestHousesList);

        this.context = context;
        this.guestHousesList = guestHousesList;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        LayoutInflater inflater = context.getLayoutInflater();

        View listViewItem = inflater.inflate(R.layout.list_layout,null,true);

        TextView textViewGName = (TextView)listViewItem.findViewById(R.id.txtGName);
        TextView textViewGAddress = (TextView)listViewItem.findViewById(R.id.txtGAddress);
        TextView textViewGTel = (TextView)listViewItem.findViewById(R.id.txtGTel);

        GuestHouses guestHouses = guestHousesList.get(position);

        textViewGName.setText(guestHouses.guestHouseName);
        textViewGAddress.setText(guestHouses.guestHouseAddress);
        textViewGTel.setText(guestHouses.guestHouseTel);

        return listViewItem;


    }




}
