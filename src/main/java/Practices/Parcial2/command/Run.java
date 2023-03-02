package Practices.Parcial2.command;

public class Run implements  IAction{

    private Game game;

    public Run(Game game) {
        this.game = game;
    }

    @Override
    public void execute() {
        System.out.println("Action> ");
        this.game.run();
    }
}
