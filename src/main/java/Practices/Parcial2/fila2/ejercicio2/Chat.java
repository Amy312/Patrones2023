package Practices.Parcial2.fila2.ejercicio2;

import java.util.HashMap;
import java.util.Map;

public class Chat implements ICanal{

    private Map<String, Persona> coleChat = new HashMap<>();
    private Docente docente;
    private Estudiante estudiante;


    public Chat addPersona(String dato, Persona persona){
        coleChat.put(dato, persona);
        return this;
    }

    @Override
    public void send(String message, Persona persona) {


        for(String dato: coleChat.keySet()){
            if(persona.getName()!=coleChat.get(dato).getName()){
                if(persona.info == "admi"){
                    coleChat.get(dato).received(message);
                } else if(persona.info == "doc"){
                    if(coleChat.get(dato).info == "doc" || coleChat.get(dato).info == "est"){
                        coleChat.get(dato).received(message);
                    } else if(persona.info =="est" && coleChat.get(dato).info=="est"){
                        coleChat.get(dato).received(message);

                    }

                }
            }
        }

    }
}
