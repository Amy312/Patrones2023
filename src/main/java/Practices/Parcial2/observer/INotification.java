package Practices.Parcial2.observer;

import java.util.List;

public interface INotification { //ISubject
    void subscription(IClient client, List<String> types);
    void removeSubscription(IClient client);
    void notify(Message message);
}
