package FactoryMethod.cpp;

import FactoryMethod.developer.Developer;
import FactoryMethod.developer.DeveloperFactory;

public class CppDeveloperFactory implements DeveloperFactory {
    @Override
    public Developer createDeveloper() {
        return new CppDeveloper();
    }
}
