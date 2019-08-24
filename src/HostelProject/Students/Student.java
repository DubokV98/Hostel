package HostelProject.Students;

import HostelProject.Hostel.Room;

public class Student extends Human {
    protected int course; //Курс обучения
    protected boolean study;
    protected boolean payment;
    protected int remarks; // Замечания
    protected String badgeNumber; //Номер пропуска
    protected  boolean wardenFloor;
    protected  String condition; // Состояние студента

    public static class Builder
    {
        private int course = 1;
        private boolean study = true;
        private boolean payment = false;
        private int remarks = 0;
        private String badgeNumber = "";
        private boolean wardenFloor = false;
        private String condition = "Normal";

        public Builder buildCourse (int course)
        {
            this.course = course;
            return this;
        }

        public Builder buildStudy (boolean study)
        {
            this.study = study;
            return this;
        }

        public Builder buildPayment (boolean payment)
        {
            this.payment = payment;
            return this;
        }

        public Builder buildRemarks (int remarks)
        {
            this.remarks = remarks;
            return this;
        }

        public Builder buildBadgeNumber (String badgeNumber)
        {
            this.badgeNumber = badgeNumber;
            return this;
        }

        public Builder buildWardenFloor (boolean wardenFloor)
        {
            this.wardenFloor = wardenFloor;
            return this;
        }

        public Builder buildCondition (String condition)
        {
            this.condition = condition;
            return this;
        }

        public Student buildStudent()
        {
            return new Student(this);
        }

    }

    public Student(){}

    public Student (Builder builder)
    {
        course = builder.course;
        study = builder.study;
        payment = builder.payment;
        remarks = builder.remarks;
        badgeNumber = builder.badgeNumber;
        wardenFloor = builder.wardenFloor;
        condition = builder.condition;
    }

    public int getCourse() {
        return course;
    }

    public boolean isStudy() {
        return study;
    }

    public boolean isPayment() {
        return payment;
    }

    public int getRemarks() {
        return remarks;
    }

    public String getBadgeNumber() {
        return badgeNumber;
    }

    public boolean isWardenFloor() {
        return wardenFloor;
    }

    public String getCondition() {
        return condition;
    }

    public void danceOnRoom(Room room)
    {

    }
}
