package Practices.Parcial2.ChainOfResponsability;

public class Aplicacion implements IHandler {
    private IHandler next;
    Soporte soporte = new Soporte();
    PO po = new PO();
    QA qa = new QA();
    Developer developer = new Developer();

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


        this.setNext(soporte);
        soporte.setNext(po);
        po.setNext(qa);
        qa.setNext(developer);

        this.next.reporte(falla);

    }
}
