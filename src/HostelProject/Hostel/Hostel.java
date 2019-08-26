package HostelProject.Hostel;

import HostelProject.Students.Student;
import java.util.ArrayList;
import java.util.Objects;

public class Hostel {

    public static final int NUMBER_OF_FLOOR=4;
    protected ArrayList <Floor> floors;
    protected String hostelNumber;

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
        for (Floor floor:floors) {
            for (Room room:floor.getRooms()) {
                result.addAll(room.getStudents());
            }
        }
        return result;
    }

    public ArrayList<Room> allRoomInHostel ()
    {
        ArrayList <Room> result = new ArrayList<>();
        for (Floor floor:floors) {
            result.addAll(floor.getRooms());
        }
        return result;
    }

    public Floor floorWhereWardenLive(int numberRoom)
    {
        Floor floor = new Floor();
        for (Floor currentFlor:floors) {
            for (Room room:currentFlor.getRooms()) {
                if(numberRoom == room.getRoomNumber())
                {
                    return currentFlor;
                }
            }
        }
        return floor;
    }

    @Override
    public String toString() {
        return "Hostel{" +
                "floors=" + floors +
                ", hostelNumber='" + hostelNumber + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Hostel)) return false;
        Hostel hostel = (Hostel) o;
        return Objects.equals(floors, hostel.floors) &&
                Objects.equals(hostelNumber, hostel.hostelNumber);
    }

    @Override
    public int hashCode() {

        return Objects.hash(floors, hostelNumber);
    }
}
