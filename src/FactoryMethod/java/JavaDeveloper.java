package FactoryMethod.java;

import FactoryMethod.developer.Developer;

public class JavaDeveloper implements Developer {
    @Override
    public void writeCode(){
        System.out.println("write Java code");
    }
}
