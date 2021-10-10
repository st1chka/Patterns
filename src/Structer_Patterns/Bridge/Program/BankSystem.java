package Structer_Patterns.Bridge.Program;

import Structer_Patterns.Bridge.Developer;

public class BankSystem extends Program {
    protected BankSystem(Developer developer) {
        super(developer);
    }

    @Override
    public void developProgram() {
        System.out.println("Bank sys develop in progress");
        developer.writeCode();
    }
}
