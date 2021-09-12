package CreationalPatterns.AbstractFactory.webSite;

import CreationalPatterns.AbstractFactory.Team.Developer;
import CreationalPatterns.AbstractFactory.Team.ProjectManager;
import CreationalPatterns.AbstractFactory.Team.ProjectTeamFactory;
import CreationalPatterns.AbstractFactory.Team.Tester;
import CreationalPatterns.AbstractFactory.banking.BankingPM;
import CreationalPatterns.AbstractFactory.banking.QATester;

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
