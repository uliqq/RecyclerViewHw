package com.geektech.recyclerviewhw;

public class Country {

    private String country;
    private String city;
    private int flag;

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public int getFlag() {
        return flag;
    }

    public void setFlag(int flag) {
        this.flag = flag;
    }

    public Country(String country, String city, int flag) {
        this.country = country;
        this.city = city;
        this.flag = flag;


    }
}
