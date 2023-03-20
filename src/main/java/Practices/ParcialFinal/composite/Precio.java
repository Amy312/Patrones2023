package Practices.ParcialFinal.composite;

import java.util.Stack;

public class Precio {
    private Stack<String> imprimir = new Stack<>();
    private int precioGlobal = 0;


    private static Precio instance;

    private Precio() {}

    public static Precio getInstance() {

        if(instance == null) {

            instance = new Precio();

        }

        return instance;

    }

    public void add(String info) {

        imprimir.push(info);

    }

    public int getStackSize() {

        return imprimir.size();

    }

    public void showInfo() {

        while(!imprimir.isEmpty()) {

            System.out.print(imprimir.pop());

        }

    }

    public int getPrecioGlobal() {
        return precioGlobal;
    }

    public void setPrecioGlobal(int precioGlobal) {
        this.precioGlobal = precioGlobal;
    }
}

