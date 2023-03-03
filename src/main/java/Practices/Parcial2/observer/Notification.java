package Practices.Parcial2.observer;

import java.util.ArrayList;
import java.util.List;

public class Notification implements  INotification{

    private String title;
    private String description;
    private List<IClient> clientList = new ArrayList<>();
    private List<Message> messageList = new ArrayList<>();


    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public List<Message> getMessageList() {
        return messageList;
    }

    public void addMessage(Message message) {
        this.messageList.add(message);
        this.notify(message);

    }

    @Override
    public void subscription(IClient client, List<String> type) {
        client.setTypeNotification(type);
        clientList.add(client);
    }

    @Override
    public void removeSubscription(IClient client) {
        clientList.remove(client);

    }

    @Override
    public void notify(Message message) {
        for (IClient client: clientList) {
            if (client.getTypeNotification().contains(message.getTitulo()))
                client.update("Notificación: ["+title+"] envia un anuncio: \n",message);
        }
    }
}
