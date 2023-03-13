package Practices.Parcial2.fila2.ejercicio5;

public class CPU {
    private int consumo;

    public CPU(int consumo) {

        this.consumo = consumo;

    }
    public int getConsumo() {
        return consumo;
    }

    public void setConsumo(int consumo) {
        this.consumo = consumo;
    }

    public void showInfo() {

        System.out.println("Estado de la CPU : ");
        System.out.println("Consumo de la CPU: " + consumo +"\n");

    }
}
