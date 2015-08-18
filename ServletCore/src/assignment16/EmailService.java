package assignment16;

public class EmailService implements MessagingService {
	@Override
	public void sendMessage(String receiverName, String msg) {
		System.out.println("Email service is used");
		System.out.println("The message is"+" "+msg+" "+"and receiver is"+" "+ receiverName);
	}
}
