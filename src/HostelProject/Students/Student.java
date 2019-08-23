package HostelProject.Students;

public class Student extends Human {
    int course; //Курс обучения
    boolean study;
    boolean payment;
    int remarks; // Замечания
    int badgeNumber; //Номер пропуска
    boolean wardenFloor;

    public Student(String name, boolean study, boolean payment, int remarks, int badgeNumber, boolean wardenFloor)
    {
        super(name);
        this.study = study;
        this.payment = payment;
        this.remarks = remarks;
        this.badgeNumber = badgeNumber;
        this.wardenFloor = wardenFloor;
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

    public void setBadgeNumber(int badgeNumber) {
        this.badgeNumber = badgeNumber;
    }

    public boolean isWardenFloor() {
        return wardenFloor;
    }

    public void setWardenFloor(boolean wardenFloor) {
        this.wardenFloor = wardenFloor;
    }
}
