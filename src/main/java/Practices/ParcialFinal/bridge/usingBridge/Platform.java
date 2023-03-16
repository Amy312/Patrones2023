package Practices.ParcialFinal.bridge.usingBridge;

public abstract class Platform {
    private Arquitectura arch;

    public Platform(Arquitectura arch) {
        this.arch = arch;
    }

    public Arquitectura getArch() {
        return arch;
    }

    public void setArch(Arquitectura arch) {
        this.arch = arch;
    }

    public abstract void showInfo();
}
