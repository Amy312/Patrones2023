package Practices.Parcial1.builderComputer;

public class I7MedioComputer extends ComputerBuilder{
    @Override
    public void buildMonitor() {
        this.computer.setMonitor("32");
    }

    @Override
    public void buildKeyboard() {
        this.computer.setKeyboard("luminos");


    }

    @Override
    public void buildMouse() {
        this.computer.setMouse("luminos");

    }

    @Override
    public void buildMemory() {
        this.computer.setMemory("16gb");
    }

    @Override
    public void buildProcessor() {
        this.computer.setProcessor("i7");

    }

    @Override
    public void buildVideo() {
        this.computer.setVideo("8");
    }
}
