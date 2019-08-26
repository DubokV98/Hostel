package HostelProject.Administrations;

import HostelProject.Hostel.Floor;
import HostelProject.Hostel.Room;
import HostelProject.Students.Student;

import java.util.ArrayList;

public class Warden extends Student{

    public Warden(){}

   public Warden(Student student)
   {
        this.name = student.getName();
        this.course = student.getCourse();
        this.study = student.isStudy();
        this.payment = student.isPayment();
        this.remarks = student.getRemarks();
        this.badgeNumber = student.getBadgeNumber();
        this.wardenFloor = true;
        this.condition = student.getCondition();
   }

    public void roomWalkAndCheckCondition(Floor floor)
    {
        for (Room currentRoom:floor.getRooms()) {
            if ("Badly".equals(currentRoom.getCondition())) {
                if (!currentRoom.getStudents().isEmpty()) {
                    for (Student currentStudentInRoom : currentRoom.getStudents()) {
                        currentStudentInRoom.setRemarks(currentStudentInRoom.getRemarks() + 1);
                    }
                    System.out.println("The room №" + currentRoom.getRoomNumber() + " in badly condition, all students receive remarks");
                }
            }
            for (Student student: currentRoom.getStudents()) {
                if("Drunk".equals(student.getCondition()))
                {
                    student.setRemarks(student.getRemarks()+1);
                    System.out.println("The student " +student.getName()+ " was drunk and receive remarks" );
                }
            }
        }
    }
}
