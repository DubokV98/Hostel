package HostelProject.Administrations;

import HostelProject.Hostel.Hostel;
import HostelProject.Students.Human;
import HostelProject.Students.Student;

import java.util.ArrayList;

public class Commandant extends Human implements Administration {

    public Commandant(String name) {
        super(name);
    }
    //Заселение
    public void populate(Hostel hostel, ArrayList <Student> students){

    }
    //Выселять
    public void eviction(Hostel hostel, ArrayList <Student> students, Security security){

        security.evictionAssistance();
    }
}
