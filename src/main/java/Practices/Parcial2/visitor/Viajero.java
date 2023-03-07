package Practices.Parcial2.visitor;

import java.text.DecimalFormat;

public class Viajero implements ILibreCambista{

    DecimalFormat df = new DecimalFormat("#.00");
    private String name;

    public Viajero(String name) {
        this.name = name;
    }

    @Override
    public void cambio(Boliviano boliviano) {
        System.out.println("Bolivia");
        System.out.println("Para el monto de " + boliviano.getMonto() + "Bs en dolares es " + df.format(boliviano.getMonto()/6.96) + "$");
        System.out.println("Para el monto de " + boliviano.getMonto() + "Bs en euros es " + df.format(boliviano.getMonto()/8) + "€");
        System.out.println("-------------------------------------\n");
    }

    @Override
    public void cambio(Dolar dolar) {
        System.out.println("EE.UU.");
        System.out.println("Para el monto de " + dolar.getMonto() + "$ en bolivianos es " + df.format(dolar.getMonto()*6.96) + "Bs");
        System.out.println("Para el monto de " + dolar.getMonto() + "$ en euros es " + df.format(dolar.getMonto()*0.95) + "€");
        System.out.println("-------------------------------------\n");
    }

    @Override
    public void cambio(Euro euro) {
        System.out.println("Europa");
        System.out.println("Para el monto de " + euro.getMonto() + "€ en bolivianos es " + df.format(euro.getMonto()*8) + "Bs");
        System.out.println("Para el monto de " + euro.getMonto() + "€ en dolares es " + df.format(euro.getMonto()/0.95) + "$");
        System.out.println("-------------------------------------\n");
    }
}
