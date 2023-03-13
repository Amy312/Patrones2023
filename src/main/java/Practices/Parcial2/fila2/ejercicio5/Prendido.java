package Practices.Parcial2.fila2.ejercicio5;

import java.util.Random;

public class Prendido implements IStateComputadora {


    @Override
    public void memoryProgramManager(Computadora computadora) throws InterruptedException {

        System.out.println("-- Inicio estado: prendido --");
        int randomNumberOfPrograms = new Random().nextInt(10-1) +1;

        for(int i = 0; i<randomNumberOfPrograms; i++) {

            computadora.getProgramasAbiertos()[i] = new Programa("Programa " + (i+1));

        }

        System.out.println("Numero de programas encendidos: " + randomNumberOfPrograms);


        int aumentoDeRecursos = 5, i = 0;

        while(computadora.getCpu().getConsumo() < 100 && computadora.getRam().getConsumo() < 100 && i<randomNumberOfPrograms) {

            computadora.getCpu().showInfo();
            computadora.getRam().showInfo();

            Thread.sleep(1000);

            computadora.getCpu().setConsumo(computadora.getCpu().getConsumo()+aumentoDeRecursos);
            computadora.getRam().setConsumo(computadora.getRam().getConsumo()+aumentoDeRecursos);
            i++;
        }
        if(computadora.getCpu().getConsumo()>=100){
            computadora.getCpu().setConsumo(100);
            computadora.getRam().setConsumo(100);
        }



        computadora.getCpu().showInfo();
        computadora.getRam().showInfo();


        System.out.println("Estado: prendido finalizado\n");



    }
}

