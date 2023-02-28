package Practices.Parcial2.Memento;

import java.util.HashMap;
import java.util.Map;

public class GitHub {
    private Map<String,Memento> commitMap = new HashMap<>();

    public void createBackup(String alias, Memento memento){
        commitMap.put(alias,memento);
    }

    public Memento getBackup(String alias) throws Exception {
        if ( !commitMap.containsKey(alias))
            throw new Exception("ERROR! el backup no existe: "+alias);
        return commitMap.get(alias);
    }
}