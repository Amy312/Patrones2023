package Practices.ParcialFinal.bridge.notUsingBridge;

public class Windows implements IPlatform{
    @Override
    public void print() {
        System.out.println("Plataforma --> Windows");
    }
}
