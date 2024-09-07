package privatemethods;

public class SendNotificationImpl implements SendNotifications {
	@Override
	public void sendNotification() {
		SendNotifications.super.sendNotification();
		SendNotifications.super.sendNotifications();
	}
	public static void main(String[] args) {
		SendNotifications sendNotofications = new SendNotificationImpl();
		sendNotofications.sendNotification();
		
	}

}
