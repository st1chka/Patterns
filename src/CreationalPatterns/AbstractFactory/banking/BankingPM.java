package CreationalPatterns.AbstractFactory.banking;

import CreationalPatterns.AbstractFactory.Team.ProjectManager;

public class BankingPM implements ProjectManager {
    @Override
    public void manageProject() {
        System.out.println("Banking PM manages working...");
    }
}
