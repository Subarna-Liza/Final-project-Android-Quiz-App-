package com.example.assesment2;

public class DatabaseHelper {


    public DatabaseHelper(String name, String phone,String email) {
        this.name=name;
        this.phone=phone;
        this.email=email;

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    String name;

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    String phone;

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    String email;




}
