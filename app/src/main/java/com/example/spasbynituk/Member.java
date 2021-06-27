package com.example.spasbynituk;

public class Member {
    String Name;
    String Roll;
    String Grades;

    public Member(String name, String roll, String grades) {
        Name = name;
        Roll = roll;
        Grades = grades;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getRoll() {
        return Roll;
    }

    public void setRoll(String roll) {
        Roll = roll;
    }

    public String getGrades() {
        return Grades;
    }

    public void setGrades(String grades) {
        Grades = grades;
    }
}
