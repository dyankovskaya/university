package ru.dyankovskaya.university.entity;

import ru.dyankovskaya.university.service.Attend;
import ru.dyankovskaya.university.service.Examine;

public class Professor implements Examine, Attend {

    public String name;
    public University university;
    public String speciality;

    public Professor() {

    }

    public Professor(String name, University university, String speciality) {
        this.name = name;
        this.university = university;
        this.speciality = speciality;
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public University getUniversity() {
        return university;
    }

    public void setUniversity(University university) {
        this.university = university;
    }

    public String getSpeciality() {
        return speciality;
    }

    public void setSpeciality(String speciality) {
        this.speciality = speciality;
    }

    @Override
    public void examine(){
        System.out.println("I examine students every day");
    }

    @Override
    public void attend() {
        System.out.println("I attend the University as a professor 3 times a week");
    }

}
