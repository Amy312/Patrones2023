package Practices.Parcial2.fila2.ejercicio1;



public class GDocs {
    private Documento documento;

    public void setDocumento(Documento documento){
        documento.showInfo();
        this.documento =documento;
    }


    public Memento createDocumento(){
        return new Memento(documento);
    }

    public void restoreDocumento(Memento memento){
        documento = memento.getDocumento();
        System.out.println("Restore Doc");
        documento.showInfo();
    }
}
