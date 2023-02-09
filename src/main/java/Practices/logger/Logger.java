package Practices.logger;

import java.io.*;

public class Logger {

    private static Logger instance = null;
    private File file = new File("C:\\Users\\Ambar\\Documents\\JavaProyects\\Patrones2023\\src\\main\\java\\Practices\\logger\\text.txt");
    private FileWriter write;
    private PrintWriter line;
    String name = "";

    private Logger() throws IOException {
        System.out.println("Se inicia el registro");

        write = new FileWriter(file, true);
        line = new PrintWriter(write);
        line.println("---> Inicio de registro <---");


    }

    private synchronized static void create() throws IOException {
        if (instance == null)
            instance = new Logger();
    }

    public static Logger getInstance() throws IOException {
        if (instance == null)
            create();
        return instance;
    }

    public synchronized void addRegister(String register) throws IOException {

        line.println(register);

    }

    public void finish() throws IOException {
        System.out.println("Se finalizó el registro");

        line.println("---> Fin de Registro <---" );
        line.close();
        write.close();
    }
}
