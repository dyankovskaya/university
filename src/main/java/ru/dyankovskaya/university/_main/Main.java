package ru.dyankovskaya.university._main;

import ru.dyankovskaya.university.entity.*;

public class Main {
    public static void main(String[] args) {
        Professor mathProfessor = new Professor();
        Student denisStudent = new Student();
        University mgu = new University();

        mathProfessor.name = "Самыйумный Александр Николаевич";
        mathProfessor.speciality = "высшая математика";
        mathProfessor.setUniversity(mgu);

        mgu.name = "МГУ";
        mgu.setProfessor(mathProfessor);
        mgu.setStudent(denisStudent);

        denisStudent.name = "Денис Петухов";
        denisStudent.faculty = "Теоретическая физика";
        denisStudent.setUniversity(mgu);
        denisStudent.setProfessor(mathProfessor);

        System.out.println(denisStudent.name + denisStudent.faculty + denisStudent.university.name + denisStudent.professor.name);

        denisStudent.study();


    }
}
