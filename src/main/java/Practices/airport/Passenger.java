package Practices.airport;

public class Passenger {
    private String name;
    private String ci;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCi() {
        return ci;
    }

    public void setCi(String ci) {
        this.ci = ci;
    }

    public void showInfo(){
        System.out.println("Pasajero:");
        System.out.println("- Nombre: " + name);
        System.out.println("- CI: " + ci);

    }
    public void changeData(String name, String ci){
        setName(name);
        setCi(ci);
    }
}
