package com.example.spasbynituk.modules;

public class Modelll {
    String credit , grades , roll;
    Modelll(){

    }

    public Modelll(String credit, String grades, String roll) {
        this.credit = credit;
        this.grades = grades;
        this.roll = roll;
    }

    public String getCredit() {
        return credit;
    }

    public void setCredit(String credit) {
        this.credit = credit;
    }

    public String getGrades() {
        return grades;
    }

    public void setGrades(String grades) {
        this.grades = grades;
    }

    public String getRoll() {
        return roll;
    }

    public void setRoll(String roll) {
        this.roll = roll;
    }
}
