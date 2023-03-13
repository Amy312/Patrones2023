package Practices.ParcialFinal.proxy;


public class Target{
    private static Target instance = null;
    private int cuenta;

    private Target() {
        this.cuenta = 100000;
    }

    private synchronized static void create()   {
        if (instance == null)
            instance = new Target();
    }

    public static Target getInstance() {
        if (instance == null)
            create();
        return instance;
    }



    public void addMoney(int monto){
        this.cuenta+=monto;
        System.out.println("Saldo actual: " + cuenta);
    }

    public int getCuenta() {
        return cuenta;
    }
}
