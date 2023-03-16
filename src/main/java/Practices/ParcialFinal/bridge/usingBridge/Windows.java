package Practices.ParcialFinal.bridge.usingBridge;

public class Windows extends Platform{
    public Windows(Arquitectura arch) {
        super(arch);
    }

    @Override
    public void showInfo() {
        System.out.println("Plataforma Windows7" + getArch().print());

    }


}
