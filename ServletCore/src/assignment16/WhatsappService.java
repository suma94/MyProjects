package assignment16;

public class WhatsappService implements MessagingService {
	@Override
	public void sendMessage(String receiverName, String msg) {
		System.out.println("Whatsapp service is used");
		System.out.println("The message is"+" "+msg+" "+"and receiver is"+" "+ receiverName);
	}
}
