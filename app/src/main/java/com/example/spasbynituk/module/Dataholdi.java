package com.example.spasbynituk.module;

public class Dataholdi {
    String roll  , credit , grades ;

    public Dataholdi(String roll, String credit, String grades) {
        this.roll = roll;
        this.credit = credit;
        this.grades = grades;
    }

    public String getRoll() {
        return roll;
    }

    public void setRoll(String roll) {
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
}
