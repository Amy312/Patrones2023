package Practices.Parcial1.builderComputer;

public class DirectorComputer {
    private ComputerBuilder computerBuilder;

    public Computer getcomputer(){
        return computerBuilder.getComputer();
    }

    public void setComputer(ComputerBuilder computerBuilder){
        this.computerBuilder = computerBuilder;
    }

    public void buildComputer(){
        this.computerBuilder.createComputer();
        this.computerBuilder.buildKeyboard();
        this.computerBuilder.buildMemory();
        this.computerBuilder.buildMonitor();
        this.computerBuilder.buildMouse();
        this.computerBuilder.buildProcessor();
        this.computerBuilder.buildVideo();
    }

}
