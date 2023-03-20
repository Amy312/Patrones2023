package Practices.ParcialFinal.decorator;

public class TanqueGas extends Accesorios{
    public TanqueGas(IAutomovil automovil) {
        super(automovil);
        setTipo("Tanque a gas");
        setVentaja("Ademas de soportar gasolina ahora puede soportar gas natural ");
    }
    @Override
    public void avanzar(){
        super.avanzar();
        System.out.println("--> Usando tanque a gas");
    }
}
