package CreationalPatterns.FactoryMethod.php;

import CreationalPatterns.FactoryMethod.developer.Developer;
import CreationalPatterns.FactoryMethod.developer.DeveloperFactory;

public class PhpDeveloperFactory implements DeveloperFactory {
    @Override
    public Developer createDeveloper() {
        return new PhpDeveloper();
    }
}
