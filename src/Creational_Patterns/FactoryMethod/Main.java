package Creational_Patterns.FactoryMethod;

import Creational_Patterns.FactoryMethod.cpp.CppDeveloperFactory;
import Creational_Patterns.FactoryMethod.developer.Developer;
import Creational_Patterns.FactoryMethod.developer.DeveloperFactory;
import Creational_Patterns.FactoryMethod.java.JavaDeveloperFactory;
import Creational_Patterns.FactoryMethod.php.PhpDeveloperFactory;

public class Main {
    public static void main(String[] args) {

        DeveloperFactory developerFactory = createDeveloperBySpecialty("php");
        Developer developer = developerFactory.createDeveloper();

        developer.writeCode();
    }

    static DeveloperFactory createDeveloperBySpecialty(String special) {
        if (special.equalsIgnoreCase("java")) {
            return new JavaDeveloperFactory();
        } else if (special.equalsIgnoreCase("c++")) {
            return new CppDeveloperFactory();
        } else if (special.equalsIgnoreCase("php")) {
            return new PhpDeveloperFactory();
        } else {
            throw new RuntimeException("Разработчик на " + special + " не найден");
        }
    }
}
