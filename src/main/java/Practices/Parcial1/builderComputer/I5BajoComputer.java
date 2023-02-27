package Practices.Parcial1.builderComputer;

public class I5BajoComputer extends ComputerBuilder{
    @Override
    public void buildMonitor() {
        this.computer.setMonitor("24");
    }

    @Override
    public void buildKeyboard() {
        this.computer.setKeyboard("normal");


    }

    @Override
    public void buildMouse() {
        this.computer.setMouse("normal");

    }

    @Override
    public void buildMemory() {
        this.computer.setMemory("8gb");
    }

    @Override
    public void buildProcessor() {
        this.computer.setProcessor("i5");

    }

    @Override
    public void buildVideo() {
        this.computer.setVideo("4");
    }
}
