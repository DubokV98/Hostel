package HostelProject.Hostel;

import java.util.ArrayList;

public class Hostel {

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
}
