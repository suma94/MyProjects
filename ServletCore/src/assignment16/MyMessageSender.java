package assignment16;

public class MyMessageSender {
	MessagingService ms;
	public void setMs(MessagingService ms) {
		this.ms = ms;
	}
	public MessagingService getMs() {
		return ms;
	}
	public void service(){
		ms.sendMessage("suma","assignment");
		System.out.println("Message is sent");
	}
	
	
}
