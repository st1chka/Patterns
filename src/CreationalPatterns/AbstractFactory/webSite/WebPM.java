package CreationalPatterns.AbstractFactory.webSite;

import CreationalPatterns.AbstractFactory.Team.ProjectManager;

public class WebPM implements ProjectManager {
    @Override
    public void manageProject() {
        System.out.println("Web PM manages...");
    }
}
