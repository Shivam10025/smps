package com.example.spasbynituk.modules;

public class Modell {
    String course , credit , grades;
    Modell(){

    }

    public Modell(String course, String credit, String grades) {
        this.course = course;
        this.credit = credit;
        this.grades = grades;
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

    public String getGrades() {
        return grades;
    }

    public void setGrades(String grades) {
        this.grades = grades;
    }
}
