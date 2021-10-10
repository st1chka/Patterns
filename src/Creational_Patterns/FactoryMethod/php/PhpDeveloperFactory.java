package Creational_Patterns.FactoryMethod.php;

import Creational_Patterns.FactoryMethod.developer.Developer;
import Creational_Patterns.FactoryMethod.developer.DeveloperFactory;

public class PhpDeveloperFactory implements DeveloperFactory {
    @Override
    public Developer createDeveloper() {
        return new PhpDeveloper();
    }
}
