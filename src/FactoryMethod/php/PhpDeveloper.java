package FactoryMethod.php;

import FactoryMethod.developer.Developer;

public class PhpDeveloper implements Developer {
    @Override
    public void writeCode() {
        System.out.println("php write code");
    }
}
