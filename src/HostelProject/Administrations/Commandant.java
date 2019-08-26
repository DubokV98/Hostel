package HostelProject.Administrations;

import HostelProject.Hostel.Floor;
import HostelProject.Hostel.Hostel;
import HostelProject.Hostel.Room;
import HostelProject.Students.Human;
import HostelProject.Students.Student;

import java.util.ArrayList;

public class Commandant extends Human{

    public Commandant(String name) {
        super(name);
    }

    public void populate(Hostel hostel, ArrayList <Student> studentsList){

        int i = 0;
        for (Floor floor:hostel.getFloors()) {
            for (Room room:floor.getRooms()) {
                for (int currentNumberStudents =  room.getNumberStudent(); currentNumberStudents < Room.NUMBER_OF_STUDENT; currentNumberStudents++)
                {
                    if(i==studentsList.size())
                    {
                        System.out.println("Students were populate!");
                        return;
                    }
                    else {
                        studentsList.get(i).setBadgeNumber(room.getRoomNumber());
                        room.getStudents().add(studentsList.get(i));
                        int nowNumberStudents = currentNumberStudents + 1;
                        room.setNumberStudent(nowNumberStudents);
                        System.out.println("Room № " + room.getRoomNumber()+ " Number of students per room - " + room.getNumberStudent());
                        i++;
                    }
                }
            }
        }

    }

    public void eviction(Room room, Student delinquentStudent, Security security)
    {
        security.evictionAssistance(delinquentStudent);
        delinquentStudent.setBadgeNumber(0);
        room.getStudents().remove(delinquentStudent);
        room.setNumberStudent(room.getNumberStudent()-1);
        System.out.println("Eviction student "+delinquentStudent.getName()+ " Current number of students per room "+room.getNumberStudent());
        for (Student student:room.getStudents()) {
            System.out.println("Student on the room: "+student.getName());
        }
    }

    public ArrayList<Student> checkPaymentAndRemarks (ArrayList <Student> studentsList)
    {
        ArrayList <Student> delinquentStudent = new ArrayList<>();
        for (Student currentStudent : studentsList) {
            if (!currentStudent.isPayment() || currentStudent.getRemarks() > 1 || currentStudent.getCourse() > 4) {
                delinquentStudent.add(currentStudent);
            }
        }
        return delinquentStudent;
    }
}
