package HostelProject.Hostel;

import HostelProject.Administrations.Warden;

import java.util.ArrayList;

public class Floor{

    public static final int NUMBER_OF_ROOMS=3;//Количество комнат на этаже.
    ArrayList<Room> rooms;
    int floorNumber;//Номер этажа

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

}
