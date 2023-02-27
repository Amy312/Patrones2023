package Practices.Parcial2.Mediator;

public class Developer extends Persona{
    private String lenguaje;
    public Developer(ICanal canal, String lenguaje) {
        super(canal);
        this.lenguaje = lenguaje;
    }

    public String getLenguaje() {
        return lenguaje;
    }

    public void setLenguaje(String lenguaje) {
        this.lenguaje = lenguaje;
    }

    @Override
    public void send(String msg) {
        this.canal.send(msg,this);
    }

    @Override
    public void received(String msg) {
        this.showInfo();
        System.out.println("lenguaje: " + this.lenguaje);
        System.out.println("-------------------------");
        System.out.println( getName() + " > received > "+msg+"\n");
    }
}
