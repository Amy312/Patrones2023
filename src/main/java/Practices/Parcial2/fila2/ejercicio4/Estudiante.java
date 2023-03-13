package Practices.Parcial2.fila2.ejercicio4;

public class Estudiante {
    private String ci;
    private String nombre;
    private String carrera;

    public Estudiante(String ci, String nombre, String carrera) {
        this.ci = ci;
        this.nombre = nombre;
        this.carrera = carrera;
    }

    public String getCi() {
        return ci;
    }

    public void setCi(String ci) {
        this.ci = ci;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCarrera() {
        return carrera;
    }

    public void setCarrera(String carrera) {
        this.carrera = carrera;
    }
}
