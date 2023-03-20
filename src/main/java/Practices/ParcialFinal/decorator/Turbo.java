package Practices.ParcialFinal.decorator;

public class Turbo extends Accesorios{
    public Turbo(IAutomovil automovil) {
        super(automovil);
        setTipo("Turbo");
        setVentaja("Incrementa su velocidad");
    }
    @Override
    public void avanzar(){
        super.avanzar();
        System.out.println("--> Usando turbo fiuuuun");
    }
}
