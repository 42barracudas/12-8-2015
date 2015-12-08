package com.company;

/**
 * Created by Vitaliy on 12/8/2015.
 */
public abstract class Doshka {
    private int length;
    private String manufacturer;

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }
}
