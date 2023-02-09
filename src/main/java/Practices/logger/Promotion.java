package Practices.logger;

import java.io.IOException;

public class Promotion {

    private int discount;
    private boolean active = false;

    public Promotion(int discount){
        this.discount = discount;
    }

    public void activate(boolean activation) throws IOException {
        String register;
        this.active = activation;
        if(activation){
            register = "La promoción de descuento de " + this.discount + " esta disponible";
        } else{
            register = "La promoción de descuento de " + this.discount + " deja de estar disponible";
        }
        Logger.getInstance().addRegister(register);
    }
    public void usePromotion(Client client, Product product) throws IOException {
        String register;
        if(active){
            if(product.price>this.discount){
                register = "El/la cliente " + client.getName() + " se lleva el producto " + product.type + " gratis gracias a la promoción";

            } else{
                product.price = product.price-this.discount;
                register = "El/la cliente " + client.getName() + " lleva el producto " + product.type + " a un precio de Bs " + product.price;
            }
        } else{
            register = "El/la cliente " + client.getName() + " no puede usar la promoción de -Bs" + this.discount + " ya que no esta disponible";
        }
        Logger.getInstance().addRegister(register);
    }
}
