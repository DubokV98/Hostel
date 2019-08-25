package HostelProject;

import HostelProject.Administrations.Warden;
import HostelProject.Hostel.Floor;
import HostelProject.Hostel.Hostel;
import HostelProject.Hostel.Room;
import HostelProject.Students.Student;

import java.util.ArrayList;

public class Initialize {

    public Hostel initializeHostel()
    {
        Hostel hostel = new Hostel("Heavenly place");
        for (int i = 0; i < Hostel.NUMBER_OF_FLOOR; i++)
        {
            hostel.getFloors().add(new Floor(i));
        }
        int numberRoom = 100;
        for (Floor floor:hostel.getFloors()) {
            for(int i = 0; i < Floor.NUMBER_OF_ROOMS; i++)
            {
                floor.getRooms().add(new Room(0,"Badly",numberRoom+i));
                System.out.println(floor.getRooms().get(i).getRoomNumber());
            }
            numberRoom+=100;
        }
        return hostel;
    }

    public ArrayList<Student> createNewStudentArray() {

        ArrayList<Student> students = new ArrayList<>();

        Student student = new Student.Builder()
                .builderName("Dubok Vladislav")
                .buildStudent();

        Student student1 = new Student.Builder()
                .builderName("Shumin Alexey")
                .buildPayment(false)
                .buildStudent();

        Student student2 = new Student.Builder()
                .builderName("Veelka Olga")
                .buildStudent();

        Student student3 = new Student.Builder()
                .builderName("Veelka Matvey")
                .buildCourse(2)
                .buildStudent();
        Student student4 = new Student.Builder()
                .builderName("Snopkov Vadim")
                .buildCourse(3)
                .buildStudent();
        Student student5 = new Student.Builder()
                .builderName("Shumay Serhey")
                .buildCondition("Drunk")
                .buildCourse(4)
                .buildStudent();

        students.add(student);
        students.add(student1);
        students.add(student2);
        students.add(student3);
        students.add(student4);
        students.add(student5);

        return students;
    }

    //Необходимо переделать параметры, сюда нао получать этажи.
    public ArrayList<Warden> createNewWarden(Hostel hostel)
    {
        int check = 0;
        Warden warden;
        ArrayList<Warden> wardens = new ArrayList<>();
        for (Floor floor:hostel.getFloors()) {
            check = 0;
            for (Room room:floor.getRooms()) {
                for (Student student:room.getStudents()) {
                    if(student.isWardenFloor())
                    {
                        check++;
                        break;
                    }
                }
            }
            if(check==0&&!floor.getRooms().get(0).getStudents().isEmpty())
            {
                floor.getRooms().get(0).getStudents().get(0).setWardenFloor(true);
                warden = new Warden(floor.getRooms().get(0).getStudents().get(0));
                wardens.add(warden);
            }
        }

        return wardens;
    }
}