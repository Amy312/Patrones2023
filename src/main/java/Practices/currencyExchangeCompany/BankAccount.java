package Practices.currencyExchangeCompany;


public class BankAccount {
    private static BankAccount instance = null;
    private double saldo = 0.00;
    private BankAccount(){
        System.out.println("Inicia la cuenta bancaria con un saldo de " + saldo + "bs");
    }

    private synchronized static void create(){
        if (instance == null){
            instance = new BankAccount();
        }
    }


    // global access
    public static BankAccount getInstance(){
        if (instance == null){
            create();
        }
        return instance;
    }

    public void addMoney(double money){
        saldo+=money;
    }

    public void finish() {
        System.out.println("El saldo final es de " + saldo);
    }
}
