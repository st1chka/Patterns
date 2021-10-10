package Creational_Patterns.AbstractFactory.webSite;

import Creational_Patterns.AbstractFactory.Team.Developer;
import Creational_Patterns.AbstractFactory.Team.ProjectManager;
import Creational_Patterns.AbstractFactory.Team.ProjectTeamFactory;
import Creational_Patterns.AbstractFactory.Team.Tester;
import Creational_Patterns.AbstractFactory.banking.BankingPM;
import Creational_Patterns.AbstractFactory.banking.QATester;

public class WebSiteTeamFactory implements ProjectTeamFactory {
    @Override
    public Developer getDeveloper() {
        return new phpDeveloper();
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
