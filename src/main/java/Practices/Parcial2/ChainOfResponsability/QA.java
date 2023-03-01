package Practices.Parcial2.ChainOfResponsability;

public class QA implements IHandler{
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
        if (falla.getSeveridad().equals("ALTA")){
            System.out.println("INFO> El QA resolverá el problema: ");
            falla.showInfo();
        } else {
            System.out.println("WARN >El QA no lo soluciono, pasa al siguiente....");
            next.reporte(falla);
        }
    }
}
