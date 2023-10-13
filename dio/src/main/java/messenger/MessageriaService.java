package messenger;

public abstract class MessageriaService {
	public abstract void sendMessage();
	public abstract void recieveMessage();
	public abstract void saveHistory();
	protected void isConnected() {
		System.out.println("Connecting...");
	}
	
	}


