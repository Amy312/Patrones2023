package Practices.Parcial2.fila2.ejercicio5;

public class Ram {
    private int consumo;

    public Ram(int consumo) {

        this.consumo = consumo;

    }
    public int getConsumo() {
        return consumo;
    }

    public void setConsumo(int consumo) {
        this.consumo = consumo;
    }

    public void showInfo() {

        System.out.println("Estado de la memoria RAM: ");
        System.out.println("Consumo: " + consumo);
        System.out.println();

    }
}
