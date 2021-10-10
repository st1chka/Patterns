package Creational_Patterns.AbstractFactory.banking;

import Creational_Patterns.AbstractFactory.Team.ProjectManager;

public class BankingPM implements ProjectManager {
    @Override
    public void manageProject() {
        System.out.println("Banking PM manages working...");
    }
}
