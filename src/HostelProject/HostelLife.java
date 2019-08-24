package HostelProject;

import HostelProject.Administrations.Commandant;
import HostelProject.Administrations.Security;
import HostelProject.Hostel.Floor;
import HostelProject.Hostel.Hostel;
import HostelProject.Hostel.Room;
import HostelProject.Students.Student;

import java.util.ArrayList;

public class HostelLife {
    ArrayList<Student> students;
    Commandant commandant;
    Security security;
    Hostel hostel;

    public void oneTimeOnHostel() {
        Room room = new Room();
        Initialize initialize = new Initialize();
        students = new ArrayList<Student>();
        commandant = new Commandant("Nikolay Petrovich Gospodievich");
        security = new Security("Ivan Nicolaevich Vishibalo");
        hostel = initialize.initializeHostel();
        students = initialize.createNewStudentArray();

        commandant.populate(hostel,students);//Заселение

        students = hostel.allStudentInRoom(hostel);
        security.badgeCheck(students.get(0));//Проверка на входе 1 студента


        students = commandant.checkPaymentAndRemarks(hostel.allStudentInRoom(hostel));//Проверка на оплату и замечания
        if(!students.isEmpty()) {
            for (Student student: students) {
                room = room.getRoomByNumber(hostel,student.getBadgeNumber());
                commandant.eviction(room,student,security);
            }
        }
    }

    public void showCondition() {
        int i = 0;
        for (Floor floor : hostel.getFloors()) {
            for (Room room:floor.getRooms()) {
                for (Student student:room.getStudents()) {
                    System.out.println("3 foreach and name student"+student.getName());
                }

            }
        }
    }
}
