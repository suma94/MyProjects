package assignment16;

public class TwitterService implements MessagingService {
	@Override
	public void sendMessage(String receiverName, String msg) {
		System.out.println("Twitter service is used");
		System.out.println("The message is"+" "+msg+" "+"and receiver is"+" "+ receiverName);
	}
}
