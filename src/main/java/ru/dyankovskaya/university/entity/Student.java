package ru.dyankovskaya.university.entity;

import ru.dyankovskaya.university.service.Attendance;
import ru.dyankovskaya.university.service.Study;

public class Student implements Study, Attendance {

    private String name;
    private University university;
    private String faculty;
    private Professor professor;

    public Student() {

    }

    public Student(String name, University university, String faculty, Professor professor) {
        this.name = name;
        this.university = university;
        this.faculty = faculty;
        this.professor = professor;
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
        System.out.println("Я обучаюсь в " + university.getName() + ". Моя специальность - " + getFaculty()
                + ". Высшую математику у меня преподает " + professor.getName());
    }

    @Override
    public void attendance() {
        System.out.println("Привет! Я студент " + getName());
        System.out.println("Я хожу в универ каждый день.");
    }
}
