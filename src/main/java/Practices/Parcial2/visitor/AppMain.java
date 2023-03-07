package Practices.Parcial2.visitor;

public class AppMain {
    public static void main(String[] args) {

        Viajero viajero = new Viajero("Marco");

        Boliviano bs = new Boliviano(1000);
        Dolar dolar = new Dolar(500);
        Euro euro = new Euro(100);

        bs.changeMonto(viajero);
        dolar.changeMonto(viajero);
        euro.changeMonto(viajero);

    }

}
