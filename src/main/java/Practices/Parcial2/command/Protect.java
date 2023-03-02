package Practices.Parcial2.command;

public class Protect implements  IAction{

    private Game game;

    public Protect(Game game) {
        this.game = game;
    }

    @Override
    public void execute() {
        System.out.println("Action> ");
        this.game.protect();
    }
}
