package HostelProject.Administrations;

import HostelProject.Students.Human;
import HostelProject.Students.Student;

import java.util.ArrayList;

public class Security extends Human{

    public Security(String name) {
        super(name);
    }

    public void badgeCheck(ArrayList<Student> studentsList){

        for (Student student:studentsList) {
            if(student.getBadgeNumber()==0)
            {
                System.out.println("Student does not belong to the hostel - Security");
            }
            else
            {
                System.out.println("Student "+student.getName()+" belongs to the hostel - Security");
            }
        }
    }
    public void evictionAssistance(Student student) {

        System.out.println("The student "+student.getName()+ " was evicted - Security");
    }

}
