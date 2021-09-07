package FactoryMethod.java;

import FactoryMethod.developer.Developer;
import FactoryMethod.developer.DeveloperFactory;

public class JavaDeveloperFactory implements DeveloperFactory {
    @Override
    public Developer createDeveloper() {
        return new JavaDeveloper();
    }
}
