package Practices.Parcial2.fila2.ejercicio1;



import java.util.ArrayList;
import java.util.List;

public class GDrive {
    private List<Memento> documentList = new ArrayList<>();
    private int index = 0;

    public GDrive addDocumento(Memento memento){
        if(memento.getDocumento().getSentence().split("\\s+").length >=5){
            documentList.add(memento);
            index = documentList.size() - 1;

        }
        return this;
    }

    public Memento getDocumento(String version){
        for(Memento mem: documentList){
            if(mem.getDocumento().getVersion().equals(version)){
                return mem;
            }
        }
        return documentList.get(index);

    }
}
