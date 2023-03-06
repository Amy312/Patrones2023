package Practices.Parcial2.state;

import java.util.Arrays;

public class Apagado implements IStateComputadora{


    @Override
    public void memoryProgramManager(Computadora computadora) {

        System.out.println("-- Inicio estado: Apagado --");
        Arrays.fill(computadora.getProgramasAbiertos(), null);
        computadora.getCpu().setConsumo(0);
        computadora.getRam().setConsumo(0);

        System.out.println("Estado: apagado finalizado\n");



    }
}