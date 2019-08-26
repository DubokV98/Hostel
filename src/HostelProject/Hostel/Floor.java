package HostelProject.Hostel;

import java.util.ArrayList;
import java.util.Objects;

public class Floor{

    public static final int NUMBER_OF_ROOMS=3;
    protected ArrayList<Room> rooms;
    protected int floorNumber;

    public Floor(int floorNumber) {
        this.rooms = new ArrayList<>();
        this.floorNumber = floorNumber;
    }

    public Floor(){}

    public ArrayList<Room> getRooms() {
        return rooms;
    }

    public void setRooms(ArrayList<Room> rooms) {
        this.rooms = rooms;
    }

    public int getFloorNumber() {
        return floorNumber;
    }

    public void setFloorNumber(int floorNumber) {
        this.floorNumber = floorNumber;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Floor)) return false;
        Floor floor = (Floor) o;
        return floorNumber == floor.floorNumber &&
                Objects.equals(rooms, floor.rooms);
    }

    @Override
    public int hashCode() {

        return Objects.hash(rooms, floorNumber);
    }

    @Override
    public String toString() {
        return "Floor{" +
                "rooms=" + rooms +
                ", floorNumber=" + floorNumber +
                '}';
    }
}
