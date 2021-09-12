package CreationalPatterns.FactoryMethod;

import CreationalPatterns.FactoryMethod.cpp.CppDeveloperFactory;
import CreationalPatterns.FactoryMethod.developer.Developer;
import CreationalPatterns.FactoryMethod.developer.DeveloperFactory;
import CreationalPatterns.FactoryMethod.java.JavaDeveloperFactory;
import CreationalPatterns.FactoryMethod.php.PhpDeveloperFactory;

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
