package HostelProject.Administrations;

import HostelProject.Hostel.Floor;
import HostelProject.Hostel.Hostel;
import HostelProject.Hostel.Room;
import HostelProject.Students.Human;
import HostelProject.Students.Student;

import java.util.ArrayList;

public class Commandant extends Human implements Administration {

    public Commandant(String name) {
        super(name);
    }
    //Заселение
    public void populate(Hostel hostel, ArrayList <Student> students){

        int i = 0;
        for (Floor floor:hostel.getFloors()) {
            for (Room room:floor.getRooms()) {
                for (int currentNumberStudents =  room.getNumberStudent(); currentNumberStudents < Room.NUMBER_OF_STUDENT; currentNumberStudents++)
                {
                    if(i==students.size())
                    {
                        System.out.println("Студенты были заселены!");
                        return;
                    }
                    else {
                        students.get(i).setBadgeNumber(room.getRoomNumber());
                        room.getStudents().add(students.get(i));
                        int nowNumberStudents = currentNumberStudents + 1;
                        room.setNumberStudent(nowNumberStudents);
                        System.out.println("Студент был заселен в комнату номер: " + "Номер комнаты" + room.getRoomNumber() + "Картачка" + students.get(i).getBadgeNumber() + "Количество в комнате" + room.getNumberStudent());
                        i++;
                    }
                }
            }
        }

    }

    //Выселять
    public void eviction(Room room, Student delinquentStudent, Security security)
    {
        security.evictionAssistance(delinquentStudent);
        delinquentStudent.setBadgeNumber(0);
        room.getStudents().remove(delinquentStudent);
        room.setNumberStudent(room.getNumberStudent()-1);
        System.out.println("Долбоеб отлетевший"+delinquentStudent.getName()+ "Текущее количество в комнате "+room.getNumberStudent());
        for (Student student:room.getStudents()) {
            System.out.println("Имя уцелевших"+student.getName());
        }
    }
    //Возвращаем лист залетных
    public ArrayList<Student> checkPaymentAndRemarks (ArrayList <Student> students)
    {
        ArrayList <Student> delinquentStudent = new ArrayList<>();
        for (Student currentStudent : students) {
            if (!currentStudent.isPayment() || currentStudent.getRemarks() > 1) {
                delinquentStudent.add(currentStudent);
            }
        }
        return delinquentStudent;
    }
}
