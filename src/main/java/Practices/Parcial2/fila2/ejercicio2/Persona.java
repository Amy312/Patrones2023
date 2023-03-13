package Practices.Parcial2.fila2.ejercicio2;

public abstract class Persona {
    protected ICanal canal;
    private String name;
    String info;

    public Persona(ICanal canal) {
        this.canal = canal;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public abstract void send(String msg);
    public abstract void received(String msg);

}
