import java.util.ArrayList;
import java.util.List;

// Concrete mediator implementation
public class ChatMediatorImpl implements ChatMediator{
    private List<User> users;
    public ChatMediatorImpl()
    {
        this.users = new ArrayList<>();
    } 
    public void addUser(User user)
    {
        users.add(user);
    }
    public void sendMessage(String message, User sender)
    {
        for(User user : users)
        {
            if(user != sender){
               user.receiveMessage(message);
            }
        }
    }
}
