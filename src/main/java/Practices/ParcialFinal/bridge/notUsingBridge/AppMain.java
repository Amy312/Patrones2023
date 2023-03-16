package Practices.ParcialFinal.bridge.notUsingBridge;

public class AppMain {
    public static void main(String[] args) {
        Linuxx64 linuxx64 = new Linuxx64();
        Linuxx86 linuxx86 = new Linuxx86();
        Linuxx128 linuxx128 = new Linuxx128();

        System.out.println("Linux Platforms");

        linuxx64.print();
        linuxx86.print();
        linuxx128.print();

        Windows7x64 windows7x64 = new Windows7x64();
        Windows7x86 windows7x86 = new Windows7x86();
        Windows7x128 windows7x128 = new Windows7x128();

        System.out.println("\nWindows7 Platforms");

        windows7x64.print();
        windows7x86.print();
        windows7x128.print();

        Macx64 macx64 = new Macx64();
        Macx86 macx86 = new Macx86();
        Macx128 macx128 = new Macx128();

        System.out.println("\nMac Platforms");

        macx64.print();
        macx86.print();
        macx128.print();


    }

}
