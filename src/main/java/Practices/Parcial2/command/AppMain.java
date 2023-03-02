package Practices.Parcial2.command;

public class AppMain {
    public static void main(String []args){
        Game game = new Game("Street Fighter V", "Amy");

        Heal heal = new Heal(game);
        Hit hit = new Hit(game);
        Jump jump = new Jump(game);
        Protect protect = new Protect(game);
        Run run = new Run(game);

        GenerateAction correr = new GenerateAction();
        correr.addNewCommand(run);

        GenerateAction regeneracion = new GenerateAction();
        regeneracion.addNewCommand(protect);
        regeneracion.addNewCommand(heal);

        GenerateAction atacar = new GenerateAction();
        atacar.addNewCommand(jump);
        atacar.addNewCommand(run);
        atacar.addNewCommand(hit);

        GenerateAction contraataque = new GenerateAction();
        contraataque.addNewCommand(run);
        contraataque.addNewCommand(jump);
        contraataque.addNewCommand(run);
        contraataque.addNewCommand(jump);
        contraataque.addNewCommand(protect);
        contraataque.addNewCommand(hit);
        contraataque.addNewCommand(heal);
        contraataque.addNewCommand(run);


        correr.run();
        regeneracion.run();
        atacar.run();
        contraataque.run();



    }
}
