package Creational_Patterns.AbstractFactory.banking;

import Creational_Patterns.AbstractFactory.Team.Developer;
import Creational_Patterns.AbstractFactory.Team.ProjectManager;
import Creational_Patterns.AbstractFactory.Team.ProjectTeamFactory;
import Creational_Patterns.AbstractFactory.Team.Tester;

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
