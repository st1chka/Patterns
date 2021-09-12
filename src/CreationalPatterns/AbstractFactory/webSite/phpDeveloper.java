package CreationalPatterns.AbstractFactory.webSite;

import CreationalPatterns.AbstractFactory.Team.Developer;

public class phpDeveloper implements Developer {
    @Override
    public void writeCode() {
        System.out.println("php developer write code...");
    }
}
