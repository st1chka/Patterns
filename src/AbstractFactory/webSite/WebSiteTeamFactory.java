package AbstractFactory.webSite;

import AbstractFactory.Team.Developer;
import AbstractFactory.Team.ProjectManager;
import AbstractFactory.Team.ProjectTeamFactory;
import AbstractFactory.Team.Tester;
import AbstractFactory.banking.BankingPM;
import AbstractFactory.banking.QATester;

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
