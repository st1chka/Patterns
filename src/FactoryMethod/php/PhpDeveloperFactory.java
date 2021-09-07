package FactoryMethod.php;

import FactoryMethod.developer.Developer;
import FactoryMethod.developer.DeveloperFactory;

public class PhpDeveloperFactory implements DeveloperFactory {
    @Override
    public Developer createDeveloper() {
        return new PhpDeveloper();
    }
}
