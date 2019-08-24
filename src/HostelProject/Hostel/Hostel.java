package HostelProject.Hostel;

import HostelProject.Students.Student;

import java.util.ArrayList;

public class Hostel {

    public static final int NUMBER_OF_FLOOR=3;//Количество этажей.
    private ArrayList <Floor> floors;
    String hostelNumber;

    public Hostel(String hostelNumber) {
        this.floors = new ArrayList<>();
        this.hostelNumber = hostelNumber;
    }

    public ArrayList<Floor> getFloors() {
        return floors;
    }

    public void setFloors(ArrayList<Floor> floors) {
        this.floors = floors;
    }

    public String getHostelNumber() {
        return hostelNumber;
    }

    public void setHostelNumber(String hostelNumber) {
        this.hostelNumber = hostelNumber;
    }

    public ArrayList<Student> allStudentInRoom (Hostel hostel)
    {
        ArrayList <Student> result = new ArrayList<>();
        for (Floor floor:hostel.getFloors()) {
            for (Room room:floor.getRooms()) {
                result.addAll(room.getStudents());
            }
        }
        return result;
    }

}
