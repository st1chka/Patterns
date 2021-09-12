package CreationalPatterns.AbstractFactory.banking;

import CreationalPatterns.AbstractFactory.Team.Developer;
import CreationalPatterns.AbstractFactory.Team.ProjectManager;
import CreationalPatterns.AbstractFactory.Team.ProjectTeamFactory;
import CreationalPatterns.AbstractFactory.Team.Tester;

public class BankingTeamFactory implements ProjectTeamFactory {
    @Override
    public Developer getDeveloper() {
        return new JavaDeveloper();
    }

    @Override
    public Tester getTester() {
        return new QATester();
    }

    @Override
    public ProjectManager getProjectManager() {
        return new BankingPM();
    }
}
