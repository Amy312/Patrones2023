package Practices.Parcial2.Mediator;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class Skipe implements ICanal{

    private Map<String, Persona> profesionalChat = new HashMap<>();

    public Skipe addProfesionalToTheChat(String ci, Persona profesional) {
        profesionalChat.put(ci, profesional);
        return this;
    }
    @Override
    public void send(String message, Persona persona) {
        for (String prof : profesionalChat.keySet()) {
            if (!persona.getCi().equals(prof)) {
                if (persona.getCargo().equals("QA") && profesionalChat.get(prof).getCargo().equals("QA")) {
                    profesionalChat.get(prof).received(message);
                } else if (persona.getCargo().equals("dev") && profesionalChat.get(prof).getCargo().equals("dev")) {
                    profesionalChat.get(prof).received(message);
                } else if (persona.getCargo().equals("SM")) {
                    profesionalChat.get(prof).received(message);
                }
            }
        }

    }
}
