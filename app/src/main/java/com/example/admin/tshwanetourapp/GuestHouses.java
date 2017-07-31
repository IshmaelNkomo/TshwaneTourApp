package com.example.admin.tshwanetourapp;

/**
 * Created by Ishmael Nkomo on 7/26/2017.
 */

public class GuestHouses {

//    Declaring virables
    String guesthouseId,guestHouseName,guestHouseAddress,guestHouseTel,guestHouseImages;


//    Default Constructor

    public GuestHouses(){

    }
//    Parametrised constructor


    public GuestHouses(String guesthouseId, String guestHouseName, String guestHouseAddress, String guestHouseTel,String guestHouseImages) {
        this.guesthouseId = guesthouseId;
        this.guestHouseName = guestHouseName;
        this.guestHouseAddress = guestHouseAddress;
        this.guestHouseTel = guestHouseTel;
        this.guestHouseImages = guestHouseImages;
    }

    public String getGuesthouseId() {
        return guesthouseId;
    }

    public String getGuestHouseName() {
        return guestHouseName;
    }

    public String getGuestHouseAddress() {
        return guestHouseAddress;
    }

    public String getGeustHouseTel() {
        return guestHouseTel;
    }
    public String getGuestHouseImages(){

        return guestHouseImages;
    }
}
