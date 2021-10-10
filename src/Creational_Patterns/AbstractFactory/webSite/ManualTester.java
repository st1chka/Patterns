package Creational_Patterns.AbstractFactory.webSite;

import Creational_Patterns.AbstractFactory.Team.Tester;

public class ManualTester implements Tester {
    @Override
    public void testCode() {
        System.out.println("Tester testing web site...");
    }
}
