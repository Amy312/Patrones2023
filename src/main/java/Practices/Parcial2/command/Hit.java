package Practices.Parcial2.command;

public class Hit implements  IAction{

    private Game game;

    public Hit(Game game) {
        this.game = game;
    }

    @Override
    public void execute() {
        System.out.println("Action> ");
        this.game.hit();
    }
}
