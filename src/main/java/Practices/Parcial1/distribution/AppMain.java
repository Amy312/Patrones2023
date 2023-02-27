package Practices.Parcial1.distribution;

public class AppMain {
    public static void main(String []args){
        Accesory[] accesories1 = {new Accesory("audifonos"), new Accesory("cargador"), new Accesory("radio")};
        Smartphone smartphone1 = new Smartphone("12", new SIM("Entel", "65434211"), accesories1);
        System.out.println("1");
        smartphone1.setBluetooth("2.4 GHz");
        smartphone1.setCamera("HDR10+");
        smartphone1.setCpu("4.4.1232222");
        smartphone1.setSize("16cm x 6cm");
        smartphone1.setBatteryTime("24 horas");
        smartphone1.setNumberOfExternMemory(2);
        smartphone1.showInfo();

        System.out.println("2");

        Accesory[] accesories2 = {new Accesory("cargador"), new Accesory("radio")};
        Smartphone smartphone2 = smartphone1.clone();
        smartphone2.setSim(new SIM("Viva", "70522058"));
        smartphone2.setAccesories(accesories2);
        smartphone2.showInfo();

        System.out.println("3");

        Accesory[] accesories3 = {new Accesory("cargador")};
        Smartphone smartphone3 = smartphone1.clone();
        smartphone3.setSim(new SIM("Tigo", "2343123"));
        smartphone3.setAccesories(accesories3);
        smartphone3.showInfo();

        System.out.println("4");

        Accesory[] accesories4 = {new Accesory("leds"), new Accesory("teclado")};
        Smartphone smartphone4 = smartphone1.clone();
        smartphone4.setSim(new SIM("Entel", "228234239"));
        smartphone4.setAccesories(accesories4);
        smartphone4.showInfo();

        System.out.println("5");

        Accesory[] accesories5 = {new Accesory("lapiz")};
        Smartphone smartphone5 = smartphone1.clone();
        smartphone5.setSim(new SIM("Tigo", "2343123"));
        smartphone5.setAccesories(accesories5);
        smartphone5.showInfo();

    }
}
