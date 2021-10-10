package Structer_Patterns.Bridge.Program;

import Structer_Patterns.Bridge.Developer;

public class StockExchange extends Program {
    protected StockExchange(Developer developer) {
        super(developer);
    }

    @Override
    public void developProgram() {
        System.out.println("Bank sys develop in progress");
        developer.writeCode();
    }
}
