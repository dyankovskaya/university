package ru.dyankovskaya.university._main;

import ru.dyankovskaya.university.entity.*;
import ru.dyankovskaya.university.service.UniversityService;

public class Main {
    public static void main(String[] args) {
        Professor professor1 = new Professor();
        Student student1 = new Student();
        University university = new University();
        UniversityService actions = new UniversityService();
        Student student2 = new Student();
        Student student3 = new Student();


        professor1.setName("Самыйумный Александр Николаевич");
        professor1.setSpeciality("теоретическая физика");
        professor1.setUniversity(university);
        professor1.setStudent(student1);
        professor1.setStudent2(student2);
        professor1.setStudent3(student3);

        university.setName("МГУ");
        university.setProfessor(professor1);
        university.setStudent(student1);

        student1.setName("Денис Петухов");
        student1.setUniversity(university);
        student1.setFaculty("Теоретическая физика");
        student1.setProfessor(professor1);

        student2.setName("Илья Котов");
        student2.setUniversity(university);
        student2.setFaculty("ядерная энергетика");
        student2.setProfessor(professor1);

        student3.setName("Машка Белоярова");
        student3.setUniversity(university);
        student3.setFaculty("Теоретическая физика");
        student3.setProfessor(professor1);

        actions.studentBehavior(student1, student1);
        System.out.println();
        actions.professorBehavior(professor1, professor1);
        System.out.println();
        actions.studentBehavior(student2, student2);
    }
}
