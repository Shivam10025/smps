package com.example.spasbynituk.modules;

public class Moodel {
    String branch , email , phone , name , roll;

    public Moodel(String branch, String email, String phone, String name, String roll) {
        this.branch = branch;
        this.email = email;
        this.phone = phone;
        this.name = name;
        this.roll = roll;
    }

    public String getBranch() {
        return branch;
    }

    public void setBranch(String branch) {
        this.branch = branch;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRoll() {
        return roll;
    }

    public void setRoll(String roll) {
        this.roll = roll;
    }
}
