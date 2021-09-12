package CreationalPatterns.FactoryMethod.cpp;

import CreationalPatterns.FactoryMethod.developer.Developer;

public class CppDeveloper implements Developer {

    @Override
    public void writeCode() {
        System.out.println("c++ write code");
    }
}
