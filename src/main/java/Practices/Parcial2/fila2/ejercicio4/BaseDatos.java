package Practices.Parcial2.fila2.ejercicio4;

import java.util.ArrayList;
import java.util.List;

public class BaseDatos {
    private List<Estudiante> estudiantes = new ArrayList<>();
    private IStrategy strategy;

    public List<Estudiante> getEstudiantes() {
        return estudiantes;
    }

    public void setEstudiantes(List<Estudiante> estudiantes) {
        this.estudiantes = estudiantes;
    }

    public void addEstudiante(Estudiante estudiante){
        estudiantes.add(estudiante);
    }

    public IStrategy getStrategy() {
        return strategy;
    }

    public void setStrategy(IStrategy strategy) {
        this.strategy = strategy;
    }
    public void execute(){
        this.strategy.execute(this.estudiantes);
    }

}
