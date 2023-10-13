package messenger;

public class FacebookMessenger extends MessageriaService {

	@Override
	public void sendMessage() {
		isConnected();
		System.out.println("Sending message via Facebook.");
		
	}

	@Override
	public void recieveMessage() {
		System.out.println("Receiving message via Facebook.");
	}

	@Override
	public void saveHistory() {
		System.out.println("Saving your messages in Facebook's cloud...");
	}
	
}
