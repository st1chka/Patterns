package Creational_Patterns.AbstractFactory.banking;

import Creational_Patterns.AbstractFactory.Team.Developer;

public class JavaDeveloper implements Developer {
    @Override
    public void writeCode() {
        System.out.println("java developer write code...");
    }
}
