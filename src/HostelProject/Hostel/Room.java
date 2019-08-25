package HostelProject.Hostel;

import HostelProject.Students.Student;

import java.util.ArrayList;

public class Room {

    public static final int NUMBER_OF_STUDENT = 3;//Количество студентов максимальное
    ArrayList<Student> students;//Агрегация
    int numberStudent;//Количество студентов в комнате на данный момент
    String condition; // Состояние комнаты, грязная и т.д.
    int roomNumber;//Номер комнаты

    public Room(){}

    public Room(int numberStudent, String condition, int roomNumber) {
        students = new ArrayList<>();
        this.numberStudent = numberStudent;
        this.condition = condition;
        this.roomNumber = roomNumber;
    }

    public ArrayList<Student> getStudents() {
        return students;
    }

    public void setStudents(ArrayList<Student> students) {
        this.students = students;
    }

    public int getNumberStudent() {
        return numberStudent;
    }

    public void setNumberStudent(int numberStudent) {
        this.numberStudent = numberStudent;
    }

    public String getCondition() {
        return condition;
    }

    public void setCondition(String condition) {
        this.condition = condition;
    }

    public int getRoomNumber() {
        return roomNumber;
    }

    public void setRoomNumber(int roomNumber) {
        this.roomNumber = roomNumber;
    }

    public Room getRoomByNumber(Hostel hostel, int numberRoom)
    {
        Room rooming = new Room();
        for (Floor floor : hostel.getFloors()) {
            for (Room room : floor.getRooms()) {
                if (room.getRoomNumber() == numberRoom)
                {
                    return room;
                }
            }
        }
        return rooming;
    }

}