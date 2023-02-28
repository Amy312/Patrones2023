package Practices.Parcial2.Memento;

import java.util.ArrayList;
import java.util.List;

public class AppMain {
    public static void main(String[] args) throws Exception {
        GitHub github = new GitHub();
        Git git = new Git();

        List<Persona> dataPersonas = new ArrayList<>();

        BaseDeDatos data = new BaseDeDatos();

        dataPersonas.add(new Persona("Amy", "6849171", 18));
        dataPersonas.add(new Persona("Bmy", "6849172", 18));
        dataPersonas.add(new Persona("Cmy", "6849173", 18));
        dataPersonas.add(new Persona("Dmy", "6849174", 18));
        dataPersonas.add(new Persona("Emy", "6849175", 18));

        data.setAlias("BackupEnero").setData(dataPersonas);
        git.setData(data);
        github.createBackup("BackupEnero",git.createBackup());

        dataPersonas.add(new Persona("Fmy", "1849171", 17));
        dataPersonas.add(new Persona("Gmy", "2849172", 17));
        dataPersonas.add(new Persona("Hmy", "3849173", 17));
        dataPersonas.add(new Persona("Imy", "4849174", 17));
        dataPersonas.add(new Persona("Jmy", "5849175", 17));
        data.setAlias("BackupFebrero").setData(dataPersonas);

        git.setData(data);
        github.createBackup("BackupFebrero",git.createBackup());

        dataPersonas.add(new Persona("Kmy", "1149171", 10));
        dataPersonas.add(new Persona("Lmy", "2249172", 11));
        dataPersonas.add(new Persona("Mmy", "3849173", 12));
        dataPersonas.add(new Persona("Nmy", "4449174", 13));
        dataPersonas.add(new Persona("Omy", "5549175", 14));
        dataPersonas.add(new Persona("Pmy", "1649171", 15));
        dataPersonas.add(new Persona("Qmy", "2749172", 16));
        dataPersonas.add(new Persona("Rmy", "3849173", 17));
        dataPersonas.add(new Persona("Smy", "4949174", 18));
        dataPersonas.add(new Persona("Tmy", "5049175", 19));
        data.setAlias("BackupMarzo").setData(dataPersonas);

        git.setData(data);
        github.createBackup("BackupMarzo",git.createBackup());


        dataPersonas.add(new Persona("Umy", "1149171", 20));
        dataPersonas.add(new Persona("Vmy", "2249272", 21));
        dataPersonas.add(new Persona("Wmy", "3849373", 22));
        dataPersonas.add(new Persona("Xmy", "4449474", 23));
        dataPersonas.add(new Persona("Ymy", "5549575", 24));
        data.setAlias("BackupAbril").setData(dataPersonas);

        git.setData(data);
        github.createBackup("BackupAbril",git.createBackup());



        dataPersonas.add(new Persona("Kma", "11491711", 20));
        dataPersonas.add(new Persona("Lmb", "22491721", 31));
        dataPersonas.add(new Persona("Mm", "38491731", 21));
        dataPersonas.add(new Persona("Nmdy", "44491174", 33));
        dataPersonas.add(new Persona("Omf", "554917025", 34));
        dataPersonas.add(new Persona("Pme", "16491971", 15));
        dataPersonas.add(new Persona("Qmg", "27499172", 16));
        dataPersonas.add(new Persona("Rmt", "3849173", 17));
        dataPersonas.add(new Persona("Sm", "494984", 28));
        dataPersonas.add(new Persona("Tmhy", "50489175", 19));
        dataPersonas.add(new Persona("K", "1149111", 20));
        dataPersonas.add(new Persona("Lmy", "2241172", 11));
        dataPersonas.add(new Persona("Mmy", "3841173", 12));
        dataPersonas.add(new Persona("Nsmy", "4419174", 13));
        dataPersonas.add(new Persona("Omsy", "5529175", 14));
        dataPersonas.add(new Persona("Pmy", "1642171", 15));
        dataPersonas.add(new Persona("Qmy", "2742172", 16));
        dataPersonas.add(new Persona("Rmys", "3839173", 17));
        dataPersonas.add(new Persona("Smd", "4944174", 18));
        dataPersonas.add(new Persona("Tmy", "5049175", 19));
        dataPersonas.add(new Persona("Kmw", "1149171", 10));
        dataPersonas.add(new Persona("Lmys", "22449172", 11));
        dataPersonas.add(new Persona("Mmys", "3349173", 12));
        dataPersonas.add(new Persona("Nmuy", "4249174", 13));
        dataPersonas.add(new Persona("Omya", "5149175", 14));
        data.setAlias("BackupMayo").setData(dataPersonas);

        git.setData(data);
        github.createBackup("BackupMayo",git.createBackup());


        System.out.println("Deberia mostrar backup de mayo con 50 usuarios");
        data.showInfo();

        data = git.checkoutBackup(github.getBackup("BackupFebrero"));


      //  git.checkoutBackup(github.getBackup("BackupEnero")).showInfo();

        System.out.println("Deberia mostrar backup de Febrero con 10 personas");
        data.showInfo();



    }
}
