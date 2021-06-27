package com.example.spasbynituk.modules;

public class Model {
    String course  , credit , Roll;

    Model(){

    }
    public Model(String course, String credit, String Roll) {
        this.course = course;
        this.credit = credit;
        this.Roll = Roll;
    }

    public String getCourse() {
        return course;
    }

    public void setCourse(String course) {
        this.course = course;
    }

    public String getCredit() {
        return credit;
    }

    public void setCredit(String credit) {
        this.credit = credit;
    }

    public String getRoll() {
        return Roll;
    }

    public void setRoll(String Roll) {
        this.Roll = Roll;
    }
}
