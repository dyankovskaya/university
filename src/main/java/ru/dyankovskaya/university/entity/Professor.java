package ru.dyankovskaya.university.entity;

import ru.dyankovskaya.university.service.Attendance;
import ru.dyankovskaya.university.service.Examine;

public class Professor implements Examine, Attendance {

    private String name;
    private University university;
    private String speciality;
    private Student student;
    private Student student2;
    private Student student3;

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

    public University getUniversity(University university) {
        return university;
    }

    public void setUniversity(University university) {
        this.university = university;
    }

    public String getSpeciality(String speciality) {
        return this.speciality;
    }

    public void setSpeciality(String speciality) {
        this.speciality = speciality;
    }

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }

    public Student getStudent2() {
        return student2;
    }

    public void setStudent2(Student student2) {
        this.student2 = student2;
    }

    public Student getStudent3() {
        return student3;
    }

    public void setStudent3(Student student3) {
        this.student3 = student3;
    }

    @Override
    public void examine() {
        System.out.println("Я принимаю экзамены и зачеты у студентов на следующей неделе!");
        System.out.println("Студент " + student.getName() + " может рассчитывать на отлично.");
        System.out.println("А вот студент " + student2.getName() + " врядли. Он весь семестр только и делал, что дергал за косички студента " + student3.getName());
    }

    @Override
    public void attendance() {
        System.out.println("Доброе утро! Я Александр Николаевич, профессор математики.");
        System.out.println("Я преподаю в " + university.getName() + " дисциплину " + getSpeciality(speciality) + ".");
        System.out.println("Я читаю три лекции в неделю, поэтому я посещаю университет в понедельник, в среду и в четверг!");
    }
}
