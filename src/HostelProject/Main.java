package HostelProject;

import HostelProject.Students.Student;

import java.util.ArrayList;


public class Main {
    public static void main(String [] args)
    {

        Student student = new Student.Builder()
                .buildCourse(1)
                .buildStudy(true)
                .buildPayment(true)
                .buildRemarks(0)
                .buildBadgeNumber("1-123")
                .buildWardenFloor(true).buildStudent();

    }
}
