package Review20;

import java.util.ArrayList;

class Notification{
    public void send(String message){
        System.out.println("Sending: " + message);
    }
}
class EmailNotification extends Notification{
    @Override
    public void send(String message){
        System.out.println("Email: " + message);
    }
}
class SMSNotification extends Notification{
    @Override
    public void send(String message){
        System.out.println("SMS: " + message);
    }
}
class PushNotification extends Notification{
    @Override
    public void send(String message){
        System.out.println("Push: " + message);
    }
}
public class Main {
    public static void notifyAllUsers(ArrayList<Notification> messages, String msg){
        for(Notification n:messages){
            n.send(msg);
        }
    }

    public static void main(String[] args) {
        ArrayList<Notification> messages  = new ArrayList<Notification>();
        messages.add(new EmailNotification());
        messages.add(new SMSNotification());
        messages.add(new PushNotification());
        notifyAllUsers(messages, "Exam bro!");
    }
}
