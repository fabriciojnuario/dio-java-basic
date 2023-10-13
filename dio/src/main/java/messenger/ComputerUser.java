package messenger;

public class ComputerUser {

	public static void main(String [] args) {
		MessageriaService ms = null;
		/*
		 * Não sabe qual sera a escolha
		 * 
		 * */
		
		String choose = "msn";
		switch(choose) {
		case "msn":
			ms = new MSNMessenger();
			break;
		case "facebook":
			ms = new FacebookMessenger();
			break;
		case "telegram":
			ms = new Telegram();
			break;
		default:
			System.out.println("wrong choice!");
		}
		ms.sendMessage();
		ms.recieveMessage();
		ms.saveHistory();
	}

}
