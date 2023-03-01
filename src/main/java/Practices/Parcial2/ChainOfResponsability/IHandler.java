package Practices.Parcial2.ChainOfResponsability;

public interface IHandler {
    void setNext(IHandler handler);
    IHandler next();

    void reporte(Falla falla);

}
