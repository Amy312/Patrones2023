package Practices.Parcial1.airportAbstractFactory;

public class Plane {
    private String brand;
    private String capacity;
    private String model;
    private String numberOfSeats;

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getCapacity() {
        return capacity;
    }

    public void setCapacity(String capacity) {
        this.capacity = capacity;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getNumberOfSeats() {
        return numberOfSeats;
    }

    public void setNumberOfSeats(String numberOfSeats) {
        this.numberOfSeats = numberOfSeats;
    }

    public void showInfo() {
        System.out.println("Avion: ");
        System.out.println("- Marca: " + brand);
        System.out.println("- Capacidad: " + capacity);
        System.out.println("- Modelo: " + model);
        System.out.println("- Número de asientos: " + numberOfSeats);
    }
}
