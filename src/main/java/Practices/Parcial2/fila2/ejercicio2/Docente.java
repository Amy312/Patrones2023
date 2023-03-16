package Practices.Parcial2.fila2.ejercicio2;

public class Docente extends Persona{
    public Docente(ICanal canal) {
        super(canal);
        setTipo("doc");
    }



    @Override
    public void send(String msg, boolean todos) {
        this.canal.send(msg, this,todos );
    }

    @Override
    public void received(String msg) {
        System.out.println("Docente: "+ getName() + "\nRecibio el mensaje " + msg);

    }
}
