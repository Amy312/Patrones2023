package Practices.Parcial1.logger;


import java.io.IOException;

public class Product {
    public String type;
    public int price;

    public Product(String type, int price){
        this.type = type;
        this.price = price;
    }


    public void buyProduct(Client client) throws IOException {
        String register = "El/la cliente " + client.getName() + " compró el producto " + type + " a Bs " + price;
        Logger.getInstance().addRegister(register);
    }
    public void changePrice(int price) throws IOException {
        String register = "El producto" + type + " cambia de precio a Bs " + price;
        this.price = price;
        Logger.getInstance().addRegister(register);
    }
}
