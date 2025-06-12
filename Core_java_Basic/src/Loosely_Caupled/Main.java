package Loosely_Caupled;

public class Main {
	public static void main(String[] args) {
		MessageService emailService = new WhatAppService();
		NotificationService notificationService = new NotificationService(emailService);
		
		notificationService.send("this is test message");
	}
}
