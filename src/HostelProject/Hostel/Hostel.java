package HostelProject.Hostel;

import java.util.ArrayList;

public class Hostel {

    private ArrayList <Floor> floors;
    int hostelNumber;

    public Hostel(int hostelNumber) {
        this.floors = new ArrayList<>();
        this.hostelNumber = hostelNumber;
    }

    public ArrayList<Floor> getFloors() {
        return floors;
    }

    public void setFloors(ArrayList<Floor> floors) {
        this.floors = floors;
    }

    public int getHostelNumber() {
        return hostelNumber;
    }

    public void setHostelNumber(int hostelNumber) {
        this.hostelNumber = hostelNumber;
    }
}
