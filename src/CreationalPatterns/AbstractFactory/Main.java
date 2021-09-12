package CreationalPatterns.AbstractFactory;

import CreationalPatterns.AbstractFactory.Team.Developer;
import CreationalPatterns.AbstractFactory.Team.ProjectManager;
import CreationalPatterns.AbstractFactory.Team.ProjectTeamFactory;
import CreationalPatterns.AbstractFactory.Team.Tester;
import CreationalPatterns.AbstractFactory.banking.BankingTeamFactory;
import CreationalPatterns.AbstractFactory.webSite.WebSiteTeamFactory;

public class Main {
    public static void main(String[] args) {



        ProjectTeamFactory projectTeamFactory = new BankingTeamFactory();
        Developer developer = projectTeamFactory.getDeveloper();
        Tester tester = projectTeamFactory.getTester();
        ProjectManager projectManager = projectTeamFactory.getProjectManager();

        System.out.println("creating bank system...");
        developer.writeCode();
        tester.testCode();
        projectManager.manageProject();


        System.out.println("-------------------------------------------------------------------");

        ProjectTeamFactory projectTeamFactoryWebSite = new WebSiteTeamFactory();
        Developer developer2 = projectTeamFactoryWebSite.getDeveloper();
        Tester tester2 = projectTeamFactoryWebSite.getTester();
        ProjectManager projectManager2 = projectTeamFactoryWebSite.getProjectManager();

        System.out.println("creating web site...");
        developer2.writeCode();
        tester2.testCode();
        projectManager2.manageProject();

    }
}
