package com.example.spasbynituk.module;

public class Dataholdin {
    String name , roll , phone , email , branch;

    public Dataholdin(String name, String roll, String phone, String email, String branch) {
        this.name = name;
        this.roll = roll;
        this.phone = phone;
        this.email = email;
        this.branch = branch;
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

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getBranch() {
        return branch;
    }

    public void setBranch(String branch) {
        this.branch = branch;
    }
}
