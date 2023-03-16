package Practices.ParcialFinal.bridge.usingBridge;

public class Linux extends Platform{
    public Linux(Arquitectura arch) {
        super(arch);
    }

    @Override
    public void showInfo() {
        System.out.println("Plataforma Linux" + getArch().print());
    }


}
