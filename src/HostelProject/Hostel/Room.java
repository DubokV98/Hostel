package HostelProject.Hostel;

import HostelProject.Students.Student;

import java.util.ArrayList;

public class Room{

    ArrayList <Student> students;//Агрегация
    int numberStudent;//Количество студентов
    String condition; // Состояние комнаты, грязная и т.д.
    int roomNumber;

    public Room(ArrayList<Student> students, int numberStudent, String condition, int roomNumber) {
        this.students = students;
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
}
