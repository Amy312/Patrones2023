package Practices.ParcialFinal.decorator;

public class GPS extends Accesorios{
    public GPS(IAutomovil automovil) {
        super(automovil);
        setTipo("GPS");
        setVentaja("Se conoce la ubicacion de vehiculo ");
    }
    @Override
    public void avanzar(){
        super.avanzar();
        System.out.println("--> Usando gps");
    }
}
