package Practices.Parcial2.fila2.ejercicio2;

public class Docente extends Persona{
    private String ci;

    public Docente(ICanal canal, String ci) {
        super(canal);
        this.ci = ci;
        info = "doc";
    }

    public String getCi() {
        return ci;
    }

    public void setCi(String ci) {
        this.ci = ci;
    }

    @Override
    public void send(String msg) {
        this.canal.send(msg, this);
    }

    @Override
    public void received(String msg) {
        System.out.println("Docente: "+ getName() + "\nRecibio el mensaje " + msg);

    }
}
