package Behavioral_Patterns.Mediator;

public class SimpleChatRunner {
    public static void main(String[] args) {
        SimpleTextChat chat = new SimpleTextChat();

        User admin = new Admin(chat,"admin");
        User user1 = new SimpleUser(chat,"user1");
        User user2 = new SimpleUser(chat,"user2");

        chat.setAdmin(admin);
        chat.addUserToChat(user1);
        chat.addUserToChat(user2);

        user1.sendMessage("hello im user1");
    }
}
