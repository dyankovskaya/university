package ru.dyankovskaya.university.entity;

public class University {

    private String name;
    private Professor professor;
    private Student student;
    private Student student2;
    private Student student3;

    public University() {

    }

    public University(String name, Professor professor, Student student) {
        this.name = name;
        this.professor = professor;
        this.student = student;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Professor getProfessor() {
        return professor;
    }

    public void setProfessor(Professor professor) {
        this.professor = professor;
    }

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }
}
