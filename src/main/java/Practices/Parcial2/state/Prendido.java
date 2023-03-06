package Practices.Parcial2.state;

import java.util.Random;

public class Prendido implements IStateComputadora{


    @Override
    public void memoryProgramManager(Computadora computadora) throws InterruptedException {

        System.out.println("-- Inicio estado: prendido --");
        Random r = new Random();
        int randomNumberOfPrograms = new Random().nextInt(10-1) +1;

        for(int i = 0; i<randomNumberOfPrograms; i++) {

            computadora.getProgramasAbiertos()[i] = new Programa("Programa " + (i+1));

        }

        System.out.println("Numero de programas encendidos: " + randomNumberOfPrograms);


        int aumentoDeRecursos = randomNumberOfPrograms*5;

        System.out.println("Por esto, los recursos iran aumentando de " + aumentoDeRecursos + " en " + aumentoDeRecursos);

        while(computadora.getCpu().getConsumo() < 100 && computadora.getRam().getConsumo() < 100) {

            computadora.getCpu().showInfo();
            computadora.getRam().showInfo();

            Thread.sleep(5000);

            computadora.getCpu().setConsumo(computadora.getCpu().getConsumo()+aumentoDeRecursos);
            computadora.getRam().setConsumo(computadora.getRam().getConsumo()+aumentoDeRecursos);

        }

        computadora.getCpu().setConsumo(100);
        computadora.getRam().setConsumo(100);

        computadora.getCpu().showInfo();
        computadora.getRam().showInfo();


        System.out.println("Estado: prendido finalizado\n");



    }
}

