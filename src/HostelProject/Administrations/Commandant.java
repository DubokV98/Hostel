package HostelProject.Administrations;

import HostelProject.Students.Human;

public class Commandant extends Human implements Administration {

    public Commandant(String name) {
        super(name);
    }

    public void populate(){}//Заселение
    public void eviction(){}//Выселять
}
