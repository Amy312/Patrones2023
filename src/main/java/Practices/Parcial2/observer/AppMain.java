package Practices.Parcial2.observer;

import java.util.List;

public class AppMain {

    public static void main (String []args){

        Notification company = new Notification();
        company.setTitle("Compañia Telefonica");
        company.setDescription("Actividades");

        Client pedro = new Client("6849176", "Pedro Rojas");
        Client maria = new Client("1849176", "Maria Ayala");
        Client eynar = new Client("2849176", "Eynar Pari");

        company.subscription(pedro, List.of("premios", "promociones"));
        company.subscription(maria, List.of("noticia"));
        company.subscription(eynar, List.of("precios llamadas", "promociones", "premios", "noticia"));


        company.addMessage(new Message("Premio al usuario 1 millon", "premios"));

    }
}
