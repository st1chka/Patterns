package AbstractFactory.webSite;

import AbstractFactory.Team.Tester;

public class ManualTester implements Tester {
    @Override
    public void testCode() {
        System.out.println("Tester testing web site...");
    }
}
