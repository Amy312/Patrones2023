package Practices.Parcial1.currencyExchangeCompany;



public class Company {
    private static Company instance = null;
    private Company(){
        System.out.println("Abre la empresa de cambios");
    }

    private synchronized static void create(){
        if (instance == null)
            instance = new Company();
    }


    // global access
    public static Company getInstance() {
        if (instance == null)
            create();
        return instance;
    }

    public double euroToBs(double money){
        double total = money*9;
        BankAccount.getInstance().addMoney(total);
        return total;
    }

    public double euroToSus(double money){
        double total = money*1.07;
        BankAccount.getInstance().addMoney(susToBs(total));
        return total;
    }

    public double BsToEuro(double money){
        double total =  money/9.0;
        BankAccount.getInstance().addMoney(money);
        return total;
    }

    public double BsToSus(double money){
        double total = money/7.0;
        BankAccount.getInstance().addMoney(money);
        return total;
    }

    public double susToBs(double money){
        double total = money*7.0;
        BankAccount.getInstance().addMoney(total);
        return total;
    }

    public double susToEuro(double money){
        double total = money/1.07;
        BankAccount.getInstance().addMoney(euroToBs(total));
        return total;
    }


    public void finish() {
        System.out.println("Finalizan las consultas");
        BankAccount.getInstance().finish();
    }
}
