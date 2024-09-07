package privatemethods;

public interface SendNotifications {
	
	default void sendNotifications() {
		System.out.println("Estblishing Connection");
		System.out.println("Send Multiple Notifications");
	}
	
	default void sendNotification() {
		System.out.println("Estblishing Connection");
		System.out.println("Send Single Notifications");
	}

}
