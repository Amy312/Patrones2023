package Practices.Parcial2.observer;

import java.util.List;

public interface IClient { // Iobserver
    void update(String info, Message message);
    void setTypeNotification(List<String> type);
    List<String> getTypeNotification();
}
