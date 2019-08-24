package HostelProject;

import HostelProject.Administrations.Commandant;
import HostelProject.Administrations.Security;
import HostelProject.Administrations.Warden;
import HostelProject.Hostel.Floor;
import HostelProject.Hostel.Hostel;
import HostelProject.Hostel.Room;
import HostelProject.Students.Student;

import java.util.ArrayList;

public class HostelLife {
    ArrayList<Student> students;
    ArrayList<Floor> floors;
    ArrayList<Room> rooms;
    Commandant commandant;
    Security security;
    ArrayList<Warden> wardens;
    Hostel hostel;

    public void oneDayOnHostel() {
        Initialize initialize = new Initialize();
        students = new ArrayList<Student>();
        floors = new ArrayList<Floor>();
        rooms = new ArrayList<Room>();
        commandant = new Commandant("Nikolay Petrovich Gospodievich");
        security = new Security("Ivan Nicolaevich Vishibalo");
        hostel = new Hostel("Heavenly place");
        hostel.setFloors(initialize.setFloor());
    }

    public void showCondition() {
        int i = 0;
        for (Floor floor : hostel.getFloors()) {
            System.out.println(hostel.getFloors().size());
        }
    }
}
