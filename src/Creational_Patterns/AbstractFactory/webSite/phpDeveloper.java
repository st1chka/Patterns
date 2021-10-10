package Creational_Patterns.AbstractFactory.webSite;

import Creational_Patterns.AbstractFactory.Team.Developer;

public class phpDeveloper implements Developer {
    @Override
    public void writeCode() {
        System.out.println("php developer write code...");
    }
}
