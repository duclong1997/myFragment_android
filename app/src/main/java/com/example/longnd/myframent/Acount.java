package com.example.longnd.myframent;

import android.os.Parcel;
import android.os.Parcelable;

import java.io.Serializable;

public class Acount implements Serializable {

    private  String pass;

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }

    private  String name;

    public Acount() {
    }



    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}
