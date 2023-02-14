package Practices.currencyExchangeCompany;


public class Bank {

    public Bank(){}

    public void exchangeBsToSus(int money)   {
        System.out.println("B <--- " + money + "Bs ---> " +  Company.getInstance().BsToSus(money) + "$");
    }
    public void exchangeBsToEuro(int money)   {
        System.out.println("B <--- " + money + "Bs ---> " +  Company.getInstance().BsToEuro(money)+ "E");
    }

    public void exchangeSusToBs(int money)   {
        System.out.println("B <--- " + money + "$ ---> " +  Company.getInstance().susToBs(money) + "Bs");
    }

    public void exchangeSusToEuro(int money)   {
        System.out.println("B <--- " + money + "$ ---> " +  Company.getInstance().susToEuro(money) + "E");
    }
    public void exchangeEuroToBs(int money)   {
        System.out.println("B <--- " + money + "E ---> " +  Company.getInstance().euroToBs(money) + "Bs");
    }
    public void exchangeEuroToSus(int money) {
        System.out.println("B <--- " + money + "E ---> " +  Company.getInstance().euroToSus(money) + "$");
    }
}
