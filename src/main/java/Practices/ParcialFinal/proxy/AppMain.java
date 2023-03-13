package Practices.ParcialFinal.proxy;

public class AppMain {
    public static void main(String[] args) {
        TargetProxy tarjeta = new TargetProxy("Amy", "139888862387");
        tarjeta.updateMoney(new Moneda("$", 100));
        tarjeta.updateMoney(new Moneda("bs", 100));
        tarjeta.updateMoney(new Moneda("bs", 100));
        tarjeta.updateMoney(new Moneda("euro", 100));

    }
}
