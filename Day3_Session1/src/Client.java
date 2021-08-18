
public class Client {
	public static void main(String[] args) {
		
		ChatMediator chat = new ChatMediator();
		
		BasicUser user1 = new BasicUser("Krishna", chat);
		PremiumUser user2 = new PremiumUser("Vaishnavi", chat);
		PremiumUser user3 = new PremiumUser("Kiara", chat);
		PremiumUser user4 = new PremiumUser("Mohan", chat);

		chat.addUser(user2);
		chat.addUser(user3);
		chat.addUser(user4);
		String name = user1.getName();

		user1.sendMessage(name, "Hi");

	}
}
