package HostelProject.Hostel;

import HostelProject.Administrations.Warden;
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

    public ArrayList<Student> allStudentInRoom ()
    {
        ArrayList <Student> result = new ArrayList<>();
        for (Floor floor:this.getFloors()) {
            for (Room room:floor.getRooms()) {
                result.addAll(room.getStudents());
            }
        }
        return result;
    }

    public ArrayList<Room> allRoomInHostel ()
    {
        ArrayList <Room> result = new ArrayList<>();
        for (Floor floor:this.getFloors()) {
            result.addAll(floor.getRooms());
        }
        return result;
    }

    public ArrayList<Floor> allFloorInHostel ()
    {
        ArrayList <Floor> floorList = new ArrayList<>();
        floorList = this.getFloors();
        return floorList;
    }
    public Floor floorWhereWardenLive(int numberRoom)
    {
        Floor floor = new Floor();
        for (Floor currentFlor:this.getFloors()) {
            for (Room room:currentFlor.getRooms()) {
                if(numberRoom == room.getRoomNumber())
                {
                    return currentFlor;
                }
            }
        }
        return floor;
    }
}
