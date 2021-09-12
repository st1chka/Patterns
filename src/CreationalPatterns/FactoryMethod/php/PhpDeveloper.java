package CreationalPatterns.FactoryMethod.php;

import CreationalPatterns.FactoryMethod.developer.Developer;

public class PhpDeveloper implements Developer {
    @Override
    public void writeCode() {
        System.out.println("php write code");
    }
}
