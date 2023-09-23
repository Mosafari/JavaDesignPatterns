package Structural.Adapter;

public class Adapter implements TargetInterface{
    private OldSystem oldsystem;

    Adapter(OldSystem system){
        this.oldsystem = system;
    }

    @Override
    public void newStuff() {
        oldsystem.oldStuff();
    }
    
}
