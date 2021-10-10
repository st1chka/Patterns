package Creational_Patterns.AbstractFactory;

import Creational_Patterns.AbstractFactory.Team.Developer;
import Creational_Patterns.AbstractFactory.Team.ProjectManager;
import Creational_Patterns.AbstractFactory.Team.ProjectTeamFactory;
import Creational_Patterns.AbstractFactory.Team.Tester;
import Creational_Patterns.AbstractFactory.banking.BankingTeamFactory;
import Creational_Patterns.AbstractFactory.webSite.WebSiteTeamFactory;

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
