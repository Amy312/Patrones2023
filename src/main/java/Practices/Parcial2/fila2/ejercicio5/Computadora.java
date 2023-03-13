package Practices.Parcial2.fila2.ejercicio5;


public class Computadora {

    private Programa[] programasAbiertos;

    private IStateComputadora stateComputadora;
    private CPU cpu;
    private Ram ram;

    public Computadora() {

        cpu = new CPU(0);
        ram = new Ram(0);
        programasAbiertos = new Programa[10];
        stateComputadora = new Apagado();

    }

    public Programa[] getProgramasAbiertos() {
        return programasAbiertos;
    }

    public void setProgramasAbiertos(Programa[] programasAbiertos) {
        this.programasAbiertos = programasAbiertos;
    }

    public IStateComputadora getStateComputadora() {
        return stateComputadora;
    }

    public void setStateComputadora(IStateComputadora stateComputadora) {
        this.stateComputadora = stateComputadora;
    }

    public CPU getCpu() {
        return cpu;
    }

    public void setCpu(CPU cpu) {
        this.cpu = cpu;
    }

    public Ram getRam() {
        return ram;
    }

    public void setRam(Ram ram) {
        this.ram = ram;
    }

    public void viewState() throws InterruptedException {

        stateComputadora.memoryProgramManager(this);

    }

}
