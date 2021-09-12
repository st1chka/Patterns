package CreationalPatterns.FactoryMethod.cpp;

import CreationalPatterns.FactoryMethod.developer.Developer;
import CreationalPatterns.FactoryMethod.developer.DeveloperFactory;

public class CppDeveloperFactory implements DeveloperFactory {
    @Override
    public Developer createDeveloper() {
        return new CppDeveloper();
    }
}
