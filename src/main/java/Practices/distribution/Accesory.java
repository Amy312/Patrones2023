package Practices.distribution;

public class Accesory {
    private String type;

    public Accesory(String type) {
        this.type = type;
    }

    public String getType() {
        return type;
    }



    public void showInfo(){
        System.out.println("- " + getType());
    }

}
