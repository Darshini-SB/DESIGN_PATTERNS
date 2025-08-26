// Concrete user implementation
public class ChatUser extends User{
    public ChatUser(ChatMediator mediator, String name)
    {
        super(mediator, name);
    }

    public void sendMessage(String message)
    {
        System.out.println(name + " sends: " + message);
        mediator.sendMessage(message, this);
    }
    public void receiveMessage(String message)
    {
        System.out.println(name + " received: " + message);
    }
}
