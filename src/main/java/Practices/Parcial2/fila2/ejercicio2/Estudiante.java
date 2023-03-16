package Practices.Parcial2.fila2.ejercicio2;

public class Estudiante extends Persona {


    public Estudiante(ICanal canal) {
        super(canal);
        setTipo("est");
    }


    @Override
    public void send(String msg, boolean todos) {
        this.canal.send(msg, this,todos );
    }

    @Override
    public void received(String msg) {
        System.out.println("Estudiante: "+ getName() + "\nRecibio el mensaje " + msg);

    }
}
