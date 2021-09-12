package CreationalPatterns.FactoryMethod.java;

import CreationalPatterns.FactoryMethod.developer.Developer;
import CreationalPatterns.FactoryMethod.developer.DeveloperFactory;

public class JavaDeveloperFactory implements DeveloperFactory {
    @Override
    public Developer createDeveloper() {
        return new JavaDeveloper();
    }
}
