package ru.dyankovskaya.university.service;

import ru.dyankovskaya.university.entity.Student;

public class UniversityService {
    public void studentBehavior(Attendance attendance, Study studying) {
        attendance.attendance();
        studying.study();
    }

    public void professorBehavior(Attendance attendance, Examine examine) {
        attendance.attendance();
        examine.examine();
    }

}
