package Creational_Patterns.FactoryMethod.php;

import Creational_Patterns.FactoryMethod.developer.Developer;

public class PhpDeveloper implements Developer {
    @Override
    public void writeCode() {
        System.out.println("php write code");
    }
}
