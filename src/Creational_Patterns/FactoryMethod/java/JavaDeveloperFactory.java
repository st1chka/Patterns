package Creational_Patterns.FactoryMethod.java;

import Creational_Patterns.FactoryMethod.developer.Developer;
import Creational_Patterns.FactoryMethod.developer.DeveloperFactory;

public class JavaDeveloperFactory implements DeveloperFactory {
    @Override
    public Developer createDeveloper() {
        return new JavaDeveloper();
    }
}
