package Practices.Parcial2.command;

public class Jump implements  IAction{

    private Game game;

    public Jump(Game game) {
        this.game = game;
    }

    @Override
    public void execute() {
        System.out.println("Action> ");
        this.game.jump();
    }
}
