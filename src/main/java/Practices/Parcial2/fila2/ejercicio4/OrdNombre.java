package Practices.Parcial2.fila2.ejercicio4;

import java.util.ArrayList;
import java.util.List;

public class OrdNombre implements IStrategy{

    @Override
    public void execute(List<Estudiante> estudiantes) {
        List<String> nombres = new ArrayList<>();
        for(Estudiante i: estudiantes){
            nombres.add(i.getNombre());
        }

        nombres.stream().sorted().forEach(System.out::println);
    }
}