package Structer_Patterns.Bridge.Program;

import Structer_Patterns.Bridge.CppDeveloper;
import Structer_Patterns.Bridge.JavaDeveloper;

public class ProgramCreator {
    public static void main(String[] args) {
        Program[] programs = {
                new BankSystem(new JavaDeveloper()),
                new StockExchange(new CppDeveloper())
        };

        for (Program program : programs) {
          program.developProgram();
        }

    }
}
