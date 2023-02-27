package Practices.Parcial1.currencyExchangeCompany;



public class AppMain {

    public static void main(String []args) throws InterruptedException {
        Bank bank = new Bank();
        ExchangeFree exchangeFree = new ExchangeFree();
        ExchangeHouse exchangeHouse = new ExchangeHouse();



        Thread thread1 = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("Consultas 1");

                bank.exchangeBsToSus(70);
                exchangeHouse.exchangeBsToSus(70);
                exchangeFree.exchangeBsToSus(70);
                System.out.println();
                bank.exchangeBsToSus(70);
                exchangeHouse.exchangeSusToEuro(10);
                exchangeFree.exchangeEuroToBs(1);
                System.out.println("Finalizaron las consultas 1\n");

            }
        });

        Thread thread2 = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("Consultas 2");

                bank.exchangeBsToSus(70);
                exchangeHouse.exchangeBsToSus(70);
                exchangeFree.exchangeEuroToSus(140);
                System.out.println();
                bank.exchangeBsToSus(70);
                exchangeHouse.exchangeSusToBs(101);
                exchangeFree.exchangeEuroToBs(21);
                System.out.println("Finalizaron las consultas 2\n");

            }
        });

        Thread thread3 = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("Consultas 3");

                bank.exchangeBsToSus(35);
                exchangeHouse.exchangeBsToSus(14);
                exchangeFree.exchangeEuroToSus(100);
                System.out.println();
                bank.exchangeBsToSus(67);
                exchangeHouse.exchangeSusToBs(89);
                exchangeFree.exchangeEuroToBs(10);
                System.out.println("Finalizaron las consultas 3\n");
            }
        });

        thread1.start();
        thread2.start();
        thread3.start();
        Thread.sleep(5000);
        Company.getInstance().finish();
    }
}
