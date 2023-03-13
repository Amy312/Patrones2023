package Practices.Parcial2.fila2.ejercicio2;

public class Estudiante extends Persona {
    private String matricula;
    private boolean doc;
    private boolean admi;
    private boolean est;

    public Estudiante(ICanal canal, String matricula) {
        super(canal);
        this.matricula = matricula;
        info = "est";
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    @Override
    public void send(String msg) {
        this.canal.send(msg, this);
    }

    public boolean isDoc() {
        return doc;
    }

    public void setDoc(boolean doc) {
        this.doc = doc;
    }

    public boolean isAdmi() {
        return admi;
    }

    public void setAdmi(boolean admi) {
        this.admi = admi;
    }

    public boolean isEst() {
        return est;
    }

    public void setEst(boolean est) {
        this.est = est;
    }

    @Override
    public void received(String msg) {
        System.out.println("Estudiante: "+ getName() + "\nRecibio el mensaje " + msg);

    }
}
