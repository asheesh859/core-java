package Loosely_Caupled;

public class NotificationService {
	
	private MessageService messageService;
	
	public  NotificationService(MessageService messageService) {
		this.messageService=messageService;
	}
	
	public void send(String smg) {
		messageService.sendMessage(smg);
	}

}
