package Practices.Parcial2.command;

import java.util.ArrayList;
import java.util.List;

public class GenerateAction {
    private List<IAction> commandList = new ArrayList<>();

    public void addNewCommand(IAction cmd){
        commandList.add(cmd);
    }

    public void run(){

        System.out.println(" Inicia Accion");
        for (IAction command:commandList) {
            command.execute();
        }

        System.out.println("\n");
    }
}
