package Practices.Parcial1.builderComputer;

public abstract class ComputerBuilder {
    protected Computer computer;
    //Computadoras : monitor, teclado, mouse, memoria, procesador, video
    public Computer getComputer(){
        return computer;
    }
    public void createComputer(){
        computer = new Computer();
    }
    public abstract void buildMonitor();
    public abstract void buildKeyboard();
    public abstract void buildMouse();
    public abstract void buildMemory();
    public abstract void buildProcessor();
    public abstract void buildVideo();



}
