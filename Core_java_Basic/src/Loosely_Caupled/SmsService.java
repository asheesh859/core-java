package Loosely_Caupled;

public class SmsService implements MessageService {

	public void sendMessage(String message) {
		System.out.println("sms sent "+message);
		

	}

}
