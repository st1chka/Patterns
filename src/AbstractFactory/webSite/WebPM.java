package AbstractFactory.webSite;

import AbstractFactory.Team.ProjectManager;

public class WebPM implements ProjectManager {
    @Override
    public void manageProject() {
        System.out.println("Web PM manages...");
    }
}
