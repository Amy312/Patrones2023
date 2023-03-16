package Practices.ParcialFinal.bridge.notUsingBridge;

public class Linux implements IPlatform{
    @Override
    public void print() {
        System.out.println("Plataforma --> Linux");
    }
}
