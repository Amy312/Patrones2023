package Practices.Parcial1.logger;


import java.io.IOException;

public class Bill {

    private int id;
    private Client client;
    private Product product;

    public Bill(int id, Client client, Product product){
        this.id = id;
        this.client = client;
        this.product = product;
    }

    public void doBill() throws IOException {
        String register = "Se genera la factura " + id + " para El/la cliente " + client.getName() + " por el producto de un/a " + product.type + " a Bs " + product.price;
        Logger.getInstance().addRegister(register);
    }

    public void sendBill() throws IOException {
        String register = "Se envió la factura al correo de el/la cliente " + client.getName();

        Logger.getInstance().addRegister(register);

    }
}
