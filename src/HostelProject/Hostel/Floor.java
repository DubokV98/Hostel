package HostelProject.Hostel;

import HostelProject.Administrations.Warden;

import java.util.ArrayList;

public class Floor{

    ArrayList<Room> rooms;
    int floorNumber;

    public Floor(int floorNumber) {
        this.rooms = new ArrayList<>();
        this.floorNumber = floorNumber;
    }

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
}
