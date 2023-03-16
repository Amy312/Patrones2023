package Practices.Parcial2.fila2.ejercicio4;

import java.util.ArrayList;
import java.util.List;

public class OrdCarrera implements IStrategy{

    @Override
    public void execute(List<Estudiante> estudiantes) {
        List<String> carreras = new ArrayList<>();
        for(Estudiante i: estudiantes){
            carreras.add(i.getCarrera());
        }
        carreras.stream().sorted().forEach(System.out::println);
    }
}
