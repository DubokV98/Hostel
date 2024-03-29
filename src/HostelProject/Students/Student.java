package HostelProject.Students;

import java.util.Objects;

public class Student extends Human {

    protected int course;
    protected boolean study;
    protected boolean payment;
    protected int remarks;
    protected int badgeNumber;
    protected  boolean wardenFloor;
    protected  String condition;

    public static class Builder
    {
        protected String name = "";
        protected int course = 1;
        private boolean study = true;
        private boolean payment = true;
        private int remarks = 0;
        private int badgeNumber = 0;
        private boolean wardenFloor = false;
        private String condition = "Normal";

        public Builder(String name)
        {
            this.name = name;
        }

        public Builder builderName(String name)
        {
            this.name = name;
            return this;
        }

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

        public Builder buildBadgeNumber (int badgeNumber)
        {
            this.badgeNumber = badgeNumber;
            return this;
        }

        public Builder buildWardenFloor (boolean wardenFloor)
        {
            this.wardenFloor = wardenFloor;
            return this;
        }

        public Builder ()
        {

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
        super(builder.name);
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

    public int getBadgeNumber() {
        return badgeNumber;
    }

    public boolean isWardenFloor() {
        return wardenFloor;
    }

    public String getCondition() {
        return condition;
    }

    public void livesOnRoom()
    {
        System.out.println(name + " lives on room № "+ badgeNumber);
        course++;
        remarks=0;
    }

    public void setCourse(int course) {
        this.course = course;
    }

    public void setStudy(boolean study) {
        this.study = study;
    }

    public void setPayment(boolean payment) {
        this.payment = payment;
    }

    public void setRemarks(int remarks) {
        this.remarks = remarks;
    }

    public void setBadgeNumber(int badgeNumber) {
        this.badgeNumber = badgeNumber;
    }

    public void setWardenFloor(boolean wardenFloor) {
        this.wardenFloor = wardenFloor;
    }

    public void setCondition(String condition) {
        this.condition = condition;
    }

    @Override
    public String toString() {
        return "Student{" +
                "course=" + course +
                ", study=" + study +
                ", payment=" + payment +
                ", remarks=" + remarks +
                ", badgeNumber=" + badgeNumber +
                ", wardenFloor=" + wardenFloor +
                ", condition='" + condition + '\'' +
                ", name='" + name + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Student)) return false;
        if (!super.equals(o)) return false;
        Student student = (Student) o;
        return course == student.course &&
                study == student.study &&
                payment == student.payment &&
                remarks == student.remarks &&
                badgeNumber == student.badgeNumber &&
                wardenFloor == student.wardenFloor &&
                Objects.equals(condition, student.condition);
    }

    @Override
    public int hashCode() {

        return Objects.hash(super.hashCode(), course, study, payment, remarks, badgeNumber, wardenFloor, condition);
    }
}
