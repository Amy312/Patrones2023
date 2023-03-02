package Practices.Parcial2.command;

public class Game { //Receiver

    private String title;
    private String player;

    public Game(String title, String player) {
        this.title = title;
        this.player = player;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getPlayer() {
        return player;
    }

    public void setPlayer(String player) {
        this.player = player;
    }

    public void heal(){
        System.out.println("State: El jugador se cura");
    }

    public void hit(){
        System.out.println("State: El jugador lanza un golpe");
    }
    public void jump(){
        System.out.println("State: El jugador salta");
    }
    public void protect(){
        System.out.println("State: El jugador se defiende");
    }

    public void run(){
        System.out.println("Stete: El jugador corre");
    }
}
