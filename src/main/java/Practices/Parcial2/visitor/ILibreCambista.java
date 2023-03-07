package Practices.Parcial2.visitor;

public interface ILibreCambista { //Ivisitor
    void cambio(Boliviano boliviano);
    void cambio(Dolar dolar);
    void cambio(Euro euro);

}