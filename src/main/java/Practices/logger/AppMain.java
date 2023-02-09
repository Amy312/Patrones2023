package Practices.logger;

import java.io.IOException;

public class AppMain {
    public static void main(String[] args) throws IOException, InterruptedException {
        System.out.println("Abre la tienda");

        Client client1 = new Client("Ambar");
        Client client2 = new Client("Josue");
        Client client3 = new Client("Pedro");

        Product product1 = new Product("peluche", 40);
        Product product2 = new Product("avion", 100);
        Product product3 = new Product("libro", 25);

        Promotion promotion1 = new Promotion(10);
        Promotion promotion2 = new Promotion(30);
        Promotion promotion3 = new Promotion(5);



        Thread thread1 = new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    client1.enterClient();
                    promotion2.activate(true);
                    product1.buyProduct(client1);
                    product2.changePrice(1000);
                    promotion2.usePromotion(client1,product1);
                    Bill bill1 = new Bill(34242, client1,product1);
                    bill1.doBill();
                    bill1.sendBill();
                    client1.leaveClient();

                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
        });

        Thread thread2 = new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    client2.enterClient();
                    promotion3.activate(true);
                    product3.buyProduct(client2);
                    promotion1.usePromotion(client2,product3);
                    Bill bill2 = new Bill(67967312, client2,product3);
                    bill2.doBill();
                    bill2.sendBill();
                    client2.leaveClient();
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
        });

        Thread thread3 = new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    client3.enterClient();
                    promotion1.activate(false);
                    product2.buyProduct(client3);
                    promotion1.usePromotion(client3,product2);
                    Bill bill3 = new Bill(999999, client3,product2);
                    bill3.doBill();
                    bill3.sendBill();
                    client3.leaveClient();
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
        });



        thread1.start();
        thread2.start();
        thread3.start();
        Thread.sleep(5000);
        Logger.getInstance().finish();


    }

}
