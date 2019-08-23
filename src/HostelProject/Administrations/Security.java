package HostelProject.Administrations;

import HostelProject.Students.Human;

public class Security extends Human implements Administration {

    public Security(String name) {
        super(name);
    }

    public void badgeCheck(){}//проверка студентов на принадлежность к общежитию
    public void evictionAssistance(){}//помощь в выселении

}
