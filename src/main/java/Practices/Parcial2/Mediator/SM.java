package Practices.Parcial2.Mediator;

import java.util.ArrayList;
import java.util.List;

public class SM extends Persona{
    private List<String> certificaciones;
    public SM(ICanal canal) {
        super(canal);
        this.certificaciones = new ArrayList<>();
    }

    public List<String> getCertificaciones() {
        return certificaciones;
    }

    public void setCertificaciones(List<String> certificaciones) {
        this.certificaciones = certificaciones;
    }

    public void addCertificacion(String certificacion){
        certificaciones.add(certificacion);
    }

    @Override
    public void send(String msg) {
        this.canal.send(msg,this);
    }

    @Override
    public void received(String msg) {
        this.showInfo();
        System.out.println("Certificaciones: ");
        for(String certi: certificaciones){
            System.out.println(" - " + certi);
        }
        System.out.println("-------------------------");
        System.out.println( getName() + " > received > "+msg+"\n");
    }
}
