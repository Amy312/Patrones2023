package Practices.Parcial2.fila2.ejercicio5;

public class Programa {
    private String name;

    public Programa( String name) {

        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void showInfo() {

        System.out.println("Programa: " + name);
        System.out.println();


    }
}
