package Creational_Patterns.FactoryMethod.java;

import Creational_Patterns.FactoryMethod.developer.Developer;

public class JavaDeveloper implements Developer {
    @Override
    public void writeCode(){
        System.out.println("write Java code");
    }
}
