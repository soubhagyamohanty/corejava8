package concurrent;

import java.util.Iterator;
import java.util.concurrent.ConcurrentHashMap;

public class ConcurrentHashMapDemo extends Thread {
	static ConcurrentHashMap<String, String> courses = new ConcurrentHashMap<>();

	@Override
	public void run() {
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		courses.put("Spring Boot", "5.0");
	}

	public static void main(String[] args) throws InterruptedException {
		
		ConcurrentHashMapDemo concurrentHashMap = new ConcurrentHashMapDemo();
		concurrentHashMap.start();

		courses.put("Java", "5.0");
		courses.put("Spring", "4.0");
		courses.put("Maven", "4.7");
		courses.put("Docker", "3.0");

		Iterator<String> itertor = courses.keySet().iterator();
		while (itertor.hasNext()) {
			Thread.sleep(2000);
			String course = itertor.next();
			System.out.println(courses.get(course));

		}
		System.out.println(courses);
	}

}
