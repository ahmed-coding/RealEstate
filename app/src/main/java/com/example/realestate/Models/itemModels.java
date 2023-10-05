package com.example.realestate.Models;

import android.util.Log;

import java.io.Serializable;

public class itemModels implements Serializable {

    private String title;
    private String address;
    private String description;
    private int bad;
    private int bath;
    private int price;


    private int pic;
    private boolean wifi;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getBad() {
        return bad;
    }

    public void setBad(int bad) {
        this.bad = bad;
    }

    public int getBath() {
        return bath;
    }

    public void setBath(int bath) {
        this.bath = bath;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getPic() {
        return pic;
    }

    public void setPic(int pic) {
        Log.d("Debug", "Setting pic to: " + pic);
        this.pic = pic;
        Log.d("Debug", "pic is now: " + this.pic);
    }

    public boolean isWifi() {
        return wifi;
    }

    public void setWifi(boolean wifi) {
        this.wifi = wifi;
    }

    public itemModels(String title, String address, String description, int bad, int bath, int price, int pic, boolean wifi) {
        this.title = title;
        this.address = address;
        this.description = description;
        this.bad = bad;
        this.bath = bath;
        this.price = price;
        this.pic = pic;
        this.wifi = wifi;


    }
}
