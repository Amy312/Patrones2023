package Practices.Parcial2.fila2.ejercicio4;

import java.util.ArrayList;
import java.util.List;

public class OrdCi implements IStrategy{

    @Override
    public void execute(List<Estudiante> estudiantes) {
        List<String> cis = new ArrayList<>();
        for(Estudiante i: estudiantes){
            cis.add(i.getCi());
        }

        cis.stream().sorted().forEach(System.out::println);
    }
}