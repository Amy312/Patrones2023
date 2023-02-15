package Practices.builderComputer;

public class I9AltoComputer extends ComputerBuilder{
    @Override
    public void buildMonitor() {
        this.computer.setMonitor("45");
    }

    @Override
    public void buildKeyboard() {
        this.computer.setKeyboard("luminos");


    }

    @Override
    public void buildMouse() {
        this.computer.setMouse("gamer");

    }

    @Override
    public void buildMemory() {
        this.computer.setMemory("32gb");
    }

    @Override
    public void buildProcessor() {
        this.computer.setProcessor("i9");

    }

    @Override
    public void buildVideo() {
        this.computer.setVideo("16");
    }
}
