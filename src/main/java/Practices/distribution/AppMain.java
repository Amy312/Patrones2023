package Practices.distribution;

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

    }
}
