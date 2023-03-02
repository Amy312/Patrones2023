package Practices.Parcial2.command;

public class Heal implements  IAction{

    private Game game;

    public Heal(Game game) {
        this.game = game;
    }

    @Override
    public void execute() {
        System.out.println("Action> ");
        this.game.heal();
    }
}
