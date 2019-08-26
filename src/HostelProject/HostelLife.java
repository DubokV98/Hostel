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
    ArrayList<Student> studentsList;
    ArrayList<Room> roomsList;
    ArrayList<Warden> wardensList;
    Commandant commandant;
    Security security;
    Hostel hostel;
    Floor floor;
    Room room;

    public void oneTimeOnHostel() {
        room = new Room();
        Initialize initialize = new Initialize();
        commandant = new Commandant("Nikolay Petrovich Gospodievich");
        security = new Security("Ivan Nicolaevich Vishibalo");
        hostel = initialize.initializeHostel();
        studentsList = initialize.createNewStudentArray();

        commandant.populate(hostel, studentsList);

        studentsList = hostel.allStudentInRoom();
        security.badgeCheck(studentsList);//Checking students at the entrance

        for(Student student:studentsList) {
            student.livesOnRoom();
        }

        studentsList = commandant.checkPaymentAndRemarks(hostel.allStudentInRoom());
        if(!studentsList.isEmpty()) {
            for (Student student: studentsList) {
                room = room.getRoomByNumber(hostel,student.getBadgeNumber());
                commandant.eviction(room,student,security);
            }
        }

        roomsList = hostel.allRoomInHostel();
        wardensList = initialize.createNewWarden(hostel);

        for (Warden warden:wardensList) {
            floor = hostel.floorWhereWardenLive(warden.getBadgeNumber());
            warden.roomWalkAndCheckCondition(floor);
        }
    }
}
