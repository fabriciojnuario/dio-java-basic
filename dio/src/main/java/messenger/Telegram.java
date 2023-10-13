package messenger;

public class Telegram extends MessageriaService {

	@Override
	public void sendMessage() {
		isConnected();
		System.out.println("Sending message via Telegram.");
		
	}

	@Override
	public void recieveMessage() {
		System.out.println("Receiving message via Telegram.");
		
	}

	@Override
	public void saveHistory() {
		System.out.println("Saving your messages in Telegram's cloud...");
		
	}

}
