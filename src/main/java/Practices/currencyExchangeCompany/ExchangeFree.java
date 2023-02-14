package Practices.currencyExchangeCompany;

public class ExchangeFree {

    public ExchangeFree(){}

    public void exchangeBsToSus(int money){
        System.out.println("LC <--- " + money + "Bs ---> " +  Company.getInstance().BsToSus(money) + "$");
    }
    public void exchangeBsToEuro(int money){
        System.out.println("LC <--- " + money + "Bs ---> " +  Company.getInstance().BsToEuro(money)+ "E");
    }

    public void exchangeSusToBs(int money){
        System.out.println("LC <--- " + money + "$ ---> " +  Company.getInstance().susToBs(money) + "Bs");
    }

    public void exchangeSusToEuro(int money){
        System.out.println("LC <--- " + money + "$ ---> " +  Company.getInstance().susToEuro(money) + "E");
    }
    public void exchangeEuroToBs(int money){
        System.out.println("LC <--- " + money + "E ---> " +  Company.getInstance().euroToBs(money) + "Bs");
    }
    public void exchangeEuroToSus(int money){
        System.out.println("LC <--- " + money + "E ---> " +  Company.getInstance().euroToSus(money) + "$");
    }

}
