package messenger;

public class MSNMessenger extends MessageriaService {

	@Override
	public void sendMessage() {
		isConnected();
		System.out.println("Sending message via MSN.");
		
	}

	@Override
	public void recieveMessage() {
		System.out.println("Recieving message via MSN.");
		
	}

	@Override
	public void saveHistory() {
		System.out.println("Saving your messages in MSN's cloud...");
		
	}
}
