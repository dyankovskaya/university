package ru.dyankovskaya.university.entity;

import ru.dyankovskaya.university.service.Attend;
import ru.dyankovskaya.university.service.Study;

public class Student implements Study, Attend {

    public String name;
    public University university;
    public String faculty;
    public Professor professor;

    public Student() {

    }

    public Student(String name, University university, String faculty) {
        this.name = name;
        this.university = university;
        this.faculty = faculty;
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

    public String getFaculty() {
        return faculty;
    }

    public void setFaculty(String faculty) {
        this.faculty = faculty;
    }

    public Professor getProfessor() {
        return professor;
    }

    public void setProfessor(Professor professor) {
        this.professor = professor;
    }

    @Override
    public void study() {
        System.out.println("Я обучаюсь в " + university.name);
    }

    @Override
    public void attend() {
        System.out.println("Я хожу в универ!");
    }
}
