package Practices.Parcial2.ChainOfResponsability;

public class Developer implements IHandler{
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
        if (falla.getSeveridad().equals("CRITICA")){
            System.out.println("INFO> El DEV resolverá el problema: ");
            falla.showInfo();
        } else {
            System.out.println("WARN >El DEV no lo soluciono, pasa a ser parcheado ....");
            next.reporte(falla);
        }
    }
}
