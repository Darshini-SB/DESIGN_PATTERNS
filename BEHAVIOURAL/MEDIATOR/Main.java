public class Main {
    public static void main(String[] args) {
        ChatMediator chatMediator = new ChatMediatorImpl();
        User user1 = new ChatUser(chatMediator, "alice");
        User user2 = new ChatUser(chatMediator, "bob");
        User user3 = new ChatUser(chatMediator, "john");
        
        chatMediator.addUser(user1);
        chatMediator.addUser(user2);
        chatMediator.addUser(user3);

        user1.sendMessage("hello all"); // Mediator handles message distribution
        user2.sendMessage("hello alice");
    }
}
