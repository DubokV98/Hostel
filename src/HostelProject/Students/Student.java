package HostelProject.Students;

import HostelProject.Hostel.Room;

public class Student extends Human {
    int course; //Курс обучения
    boolean study;
    boolean payment;
    int remarks; // Замечания
    int badgeNumber; //Номер пропуска
    boolean wardenFloor;
    String condition; // Состояние студента

    public Student(String name, boolean study, boolean payment, int remarks, int badgeNumber, boolean wardenFloor , String condition)
    {
        super(name);
        this.study = study;
        this.payment = payment;
        this.remarks = remarks;
        this.badgeNumber = badgeNumber;
        this.wardenFloor = wardenFloor;
        this.condition = condition;
    }

    public int getCourse() {
        return course;
    }

    public void setCourse(int course) {
        this.course = course;
    }

    public boolean isStudy() {
        return study;
    }

    public void setStudy(boolean study) {
        this.study = study;
    }

    public boolean isPayment() {
        return payment;
    }

    public void setPayment(boolean payment) {
        this.payment = payment;
    }

    public int getRemarks() {
        return remarks;
    }

    public void setRemarks(int remarks) {
        this.remarks = remarks;
    }

    public int getBadgeNumber() {
        return badgeNumber;
    }

    public boolean isWardenFloor() {
        return wardenFloor;
    }

    public void setWardenFloor(boolean wardenFloor) {
        this.wardenFloor = wardenFloor;
    }

    public String getCondition() {
        return condition;
    }

    public void setCondition(String condition) {
        this.condition = condition;
    }

    public void danceOnRoom(Room room)
    {

    }
}
