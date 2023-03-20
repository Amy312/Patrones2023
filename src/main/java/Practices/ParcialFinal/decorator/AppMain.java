package Practices.ParcialFinal.decorator;

public class AppMain {
    public static void main(String[] args) {
        IAutomovil minibus = new Minibus();

        System.out.println("Minibus usa 3 accesorios");

        minibus = new Turbo(minibus);
        minibus = new GPS(minibus);
        minibus = new TanqueGas(minibus);

        minibus.avanzar();
        System.out.println("-----------------\n");

        IAutomovil taxi = new Taxi();
        System.out.println("Taxi usa 1 accesorio");

        taxi = new TanqueGas(taxi);

        taxi.avanzar();
        System.out.println("-----------------\n");

        IAutomovil vagoneta = new Vagoneta();
        System.out.println("Vagoneta usa 2 accesorios");

        vagoneta = new Turbo(vagoneta);
        vagoneta = new GPS(vagoneta);

        vagoneta.avanzar();
        System.out.println("-----------------\n");





    }
}