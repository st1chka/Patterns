package Creational_Patterns.FactoryMethod.cpp;

import Creational_Patterns.FactoryMethod.developer.Developer;
import Creational_Patterns.FactoryMethod.developer.DeveloperFactory;

public class CppDeveloperFactory implements DeveloperFactory {
    @Override
    public Developer createDeveloper() {
        return new CppDeveloper();
    }
}
