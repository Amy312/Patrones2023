package Practices.distribution;

public class Smartphone implements ISmartphone{

    private String size;
    private String cpu;
    private SIM sim;
    private String versionAndroid;
    private String camera;
    private String bluetooth;
    private int numberOfExternMemory;
    private String batteryTime;
    private Accesory[] accesories;



    public Smartphone(String versionAndroid, SIM sim, Accesory[] accessories) {
        this.sim = sim;
        this.versionAndroid = versionAndroid;
        this.accesories = accessories;

    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public String getCpu() {
        return cpu;
    }

    public void setCpu(String cpu) {
        this.cpu = cpu;
    }

    public SIM getSim() {
        return sim;
    }

    public void setSim(SIM sim) {
        this.sim = sim;
    }

    public String getVersionAndroid() {
        return versionAndroid;
    }

    public void setVersionAndroid(String versionAndroid) {
        this.versionAndroid = versionAndroid;
    }

    public String getCamera() {
        return camera;
    }

    public void setCamera(String camera) {
        this.camera = camera;
    }

    public String getBluetooth() {
        return bluetooth;
    }

    public void setBluetooth(String bluetooth) {
        this.bluetooth = bluetooth;
    }

    public int getNumberOfExternMemory() {
        return numberOfExternMemory;
    }

    public void setNumberOfExternMemory(int numberOfExternMemory) {
        this.numberOfExternMemory = numberOfExternMemory;
    }

    public String getBatteryTime() {
        return batteryTime;
    }

    public void setBatteryTime(String batteryTime) {
        this.batteryTime = batteryTime;
    }

    public Accesory[] getAccesories() {
        return accesories;
    }

    public void setAccesories(Accesory[] accesories) {
        this.accesories = accesories;
    }

    @Override
    public Smartphone clone() {
        Smartphone clone = new Smartphone(this.versionAndroid, this.sim, this.accesories);
        clone.setBluetooth(this.getBluetooth());
        clone.setCamera(this.getCamera());
        clone.setCpu(this.getCpu());
        clone.setSize(this.getSize());
        clone.setBatteryTime(this.getBatteryTime());
        clone.setNumberOfExternMemory(this.getNumberOfExternMemory());
        return clone;
    }

    public void showInfo() {
        System.out.print("\n -------SMARTPHONE---------  \n");
        System.out.println("CPU: " + getCpu());
        System.out.println("Versión de Android: " + getVersionAndroid());
        System.out.println("Cámara: " + getCamera());
        System.out.println("Bluetooth: "+getBluetooth());
        System.out.println("Cantidad de Memorias Externas: "+getNumberOfExternMemory());
        System.out.println("Tiempo de bateria: "+getBatteryTime());
        System.out.print("\n -------Accesorios---------  \n");
        for(int i=0; i<getAccesories().length; i++){
            getAccesories()[i].showInfo();
        }
        getSim().showInfo();
    }

}
