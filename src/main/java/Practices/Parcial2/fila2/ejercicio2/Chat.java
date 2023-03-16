package Practices.Parcial2.fila2.ejercicio2;

import java.util.HashMap;
import java.util.Map;

public class Chat implements ICanal{

    private Map<String, Persona> gameChat = new HashMap<>();
    private Docente docente;
    private Estudiante estudiante;


    public Chat addPersona(String dato, Persona persona){
        gameChat.put(dato, persona);
        return this;
    }

    @Override
    public void send(String message, Persona persona, boolean todos) {
        String tipo = persona.getTipo();
        for(String dato: gameChat.keySet()){
            if(!persona.getName().equals(gameChat.get(dato).getName())){
                if(todos){
                    gameChat.get(dato).received(message);
                }else if(gameChat.get(dato).getTipo().equals(tipo)){
                    gameChat.get(dato).received(message);
                }

            }

        }

    }
}
