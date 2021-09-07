package AbstractFactory.banking;

import AbstractFactory.Team.Developer;

public class JavaDeveloper implements Developer {
    @Override
    public void writeCode() {
        System.out.println("java developer write code...");
    }
}
