package Creational_Patterns.AbstractFactory.webSite;

import Creational_Patterns.AbstractFactory.Team.ProjectManager;

public class WebPM implements ProjectManager {
    @Override
    public void manageProject() {
        System.out.println("Web PM manages...");
    }
}
