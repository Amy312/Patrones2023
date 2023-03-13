package Practices.ParcialFinal.proxy;

public class TargetProxy implements IBank{
    private String nombre;
    private String codigo;

    public TargetProxy(String nombre, String codigo) {
        this.nombre = nombre;
        this.codigo = codigo;
    }

    @Override
    public void updateMoney(Moneda money) {
        if(money.getTipo().equals("bs")){
            if(money.getCantidad()<=Target.getInstance().getCuenta()){
                Target.getInstance().addMoney(-money.getCantidad());
            }else{
                System.out.println("No hay suficiente dinero en la cuenta");
            }
        } else if(money.getTipo().equals("$")){
            if(money.getCantidad()*7<=Target.getInstance().getCuenta()){
                Target.getInstance().addMoney(-money.getCantidad()*7);
            }else{
                System.out.println("No hay suficiente dinero en la cuenta");
            }
        } else if(money.getTipo().equals("euro")){
            if(money.getCantidad()*8<=Target.getInstance().getCuenta()){
                Target.getInstance().addMoney(-money.getCantidad()*8);
                System.out.println(" Saldo actual: " + Target.getInstance().getCuenta());
            }else{
                System.out.println("No hay suficiente dinero en la cuenta");
            }
        }
    }

    @Override
    public void addMoney(int monto) {
        Target.getInstance().addMoney(monto);
    }
}
