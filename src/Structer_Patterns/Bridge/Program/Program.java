package Structer_Patterns.Bridge.Program;

import Structer_Patterns.Bridge.Developer;

public abstract class Program {
    protected Developer developer;

    protected Program(Developer developer){
        this.developer=developer;
    }

    public abstract void developProgram();
}
