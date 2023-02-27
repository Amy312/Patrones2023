package Practices.Parcial1.logger;

import java.io.IOException;

public class Client {
    private String name;

    public Client(String name) {
        this.name = name;
    }

    public String getName(){
        return name;
    }

    public void enterClient() throws IOException {
        String register = "Ingresó el/la cliente " + this.name + " a la tienda";
        Logger.getInstance().addRegister(register);
    }

    public void leaveClient() throws IOException {
        String register = "Se retira el/la cliente " + this.name + " de la tienda";
        Logger.getInstance().addRegister(register);
    }

}
