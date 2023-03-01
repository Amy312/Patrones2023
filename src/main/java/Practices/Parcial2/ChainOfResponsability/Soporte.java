package Practices.Parcial2.ChainOfResponsability;

public class Soporte implements IHandler{
    private IHandler next;

    @Override
    public void setNext(IHandler handler) {
        next=handler;
    }

    @Override
    public IHandler next() {
        return next;
    }

    @Override
    public void reporte(Falla falla) {
        // cadena
        if (falla.getSeveridad().equals("BAJA")){
            System.out.println("INFO> El soporte resolverá el problema: ");
            falla.showInfo();
        } else {
            System.out.println("WARN >El soporte no lo soluciono, pasa al siguiente ....");
            next.reporte(falla);
        }
    }
}

