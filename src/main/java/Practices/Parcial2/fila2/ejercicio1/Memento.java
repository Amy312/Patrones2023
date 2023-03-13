package Practices.Parcial2.fila2.ejercicio1;

public class Memento {
    private Documento documento;

    public Memento(Documento documento) {
        this.documento = documento;
    }

    public Documento getDocumento() {
        return documento;
    }
}
