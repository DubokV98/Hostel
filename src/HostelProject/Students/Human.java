package HostelProject.Students;

public abstract class Human {

    String name;

    public Human(){}

    public Human(String name)
    {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
