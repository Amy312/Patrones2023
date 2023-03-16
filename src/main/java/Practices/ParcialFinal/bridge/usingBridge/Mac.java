package Practices.ParcialFinal.bridge.usingBridge;

public class Mac extends Platform{
    public Mac(Arquitectura arch) {
        super(arch);
    }

    @Override
    public void showInfo() {
        System.out.println("Plataforma Mac" + getArch().print());

    }


}
