package AbstractFactory.banking;

import AbstractFactory.Team.Developer;
import AbstractFactory.Team.ProjectManager;
import AbstractFactory.Team.ProjectTeamFactory;
import AbstractFactory.Team.Tester;

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
