package Creational_Patterns.FactoryMethod.cpp;

import Creational_Patterns.FactoryMethod.developer.Developer;

public class CppDeveloper implements Developer {

    @Override
    public void writeCode() {
        System.out.println("c++ write code");
    }
}
