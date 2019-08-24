package HostelProject.Administrations;

import HostelProject.Hostel.Floor;
import HostelProject.Students.Student;

public class Warden extends Student implements Administration {

    public Warden(){}

   /* public Warden(String name, boolean study, boolean payment, int remarks, String badgeNumber, boolean wardenFloor, String condition) {
        super(name, study, payment, remarks, badgeNumber, wardenFloor, condition);
    }*/

   public Warden(Student student)
   {
        this.name = student.getName();
        this.course = student.getCourse();
        this.study = student.isStudy();
        this.payment = student.isPayment();
        this.remarks = student.getRemarks();
        this.badgeNumber = student.getBadgeNumber();
        this.wardenFloor = true;
        this.condition = student.getCondition();
   }

    public void roomWalk(Floor floor){

    }//Обход комнат
}
