package Practices.Parcial2.Mediator;

public class QA extends Persona{
    private String grado;
    public QA(ICanal canal, String grado) {
        super(canal);
        this.grado = grado;
    }

    public String getGrado() {
        return grado;
    }

    public void setGrado(String grado) {
        this.grado = grado;
    }

    @Override
    public void send(String msg) {
        this.canal.send(msg,this);
    }

    @Override
    public void received(String msg) {
        this.showInfo();
        System.out.println("grado: " + this.grado);
        System.out.println("-------------------------");
        System.out.println( getName() + " > received > "+msg+"\n");
    }
}
