package HostelProject;

import HostelProject.Hostel.Floor;
import HostelProject.Hostel.Hostel;
import HostelProject.Hostel.Room;
import HostelProject.Students.Student;

import java.util.ArrayList;

public class Initialize {

    public ArrayList<Student> setStudent() {
        ArrayList<Student> students = new ArrayList<>();
        Student student = new Student.Builder("ASD")
                .builderName("Alesha")
                .buildCourse(2)
                .buildStudy(true)
                .buildPayment(true)
                .buildRemarks(0).buildBadgeNumber("1-123")
                .buildWardenFloor(false)
                .buildStudent();
        Student student1 = new Student.Builder("ASD")
                .builderName("Vlad")
                .buildCourse(3)
                .buildStudy(true)
                .buildPayment(true)
                .buildRemarks(0).buildBadgeNumber("1-123")
                .buildWardenFloor(false)
                .buildStudent();
        Student student2 = new Student.Builder("ASD")
                .builderName("Kvadrat")
                .buildCourse(4)
                .buildStudy(true)
                .buildPayment(true)
                .buildRemarks(0).buildBadgeNumber("1-123")
                .buildWardenFloor(false)
                .buildStudent();
        students.add(student);
        students.add(student1);
        students.add(student2);
        for (Student studentki:students) {
            System.out.println("Studentki name"+studentki.getName());
        }
        return students;
    }

    public ArrayList<Floor> setFloor()
    {
        ArrayList<Floor> floors = new ArrayList<>();
        Floor floor = new Floor(1);
        floor.setRooms(setRoom());

        return floors;
    }
    public ArrayList<Room> setRoom()
    {
        ArrayList<Room> rooms = new ArrayList<>();
        Room room = new Room(setStudent(),3,"Normal",123);
        rooms.add(room);
        System.out.println("Rooms size = " + rooms.size());
        return rooms;
    }

   /* public Hostel setHostel()
    {
        Hostel hostel = new Hostel()
        return
    }*/
}
