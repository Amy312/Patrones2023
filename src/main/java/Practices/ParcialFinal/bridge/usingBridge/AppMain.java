package Practices.ParcialFinal.bridge.usingBridge;


public class AppMain {
    public static void main(String[] args) {
        ArquitecturaX64 arquitecturaX64 = new ArquitecturaX64();
        ArquitecturaX86 arquitecturaX86 = new ArquitecturaX86();
        ArquitecturaX128 arquitecturaX128 = new ArquitecturaX128();


        Linux linuxx64 = new Linux(arquitecturaX64);
        Linux linuxx86 = new Linux(arquitecturaX86);
        Linux linuxx128 = new Linux(arquitecturaX128);

        System.out.println("Linux Platforms");

        linuxx64.showInfo();
        linuxx86.showInfo();
        linuxx128.showInfo();

        Windows windows7x64 = new Windows(arquitecturaX64);
        Windows windows7x86 = new Windows(arquitecturaX86);
        Windows windows7x128 = new Windows(arquitecturaX128);

        System.out.println("\nWindows7 Platforms");

        windows7x64.showInfo();
        windows7x86.showInfo();
        windows7x128.showInfo();

        Mac macx64 = new Mac(arquitecturaX64);
        Mac macx86 = new Mac(arquitecturaX86);
        Mac macx128 = new Mac(arquitecturaX128);

        System.out.println("\nMac Platforms");

        macx64.showInfo();
        macx86.showInfo();
        macx128.showInfo();


    }

}
