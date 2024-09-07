package evenodd;

import java.util.Iterator;
import java.util.concurrent.ConcurrentHashMap;

public class HashMapProblems extends Thread{
	
	static ConcurrentHashMap<String,String> courses = new ConcurrentHashMap<>();
	
	@Override
	public void run() {
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		courses.put("Spring Boot", "4.9");
	}

	public static void main(String[] args) throws InterruptedException {
		HashMapProblems hashMapProblems = new HashMapProblems();
		hashMapProblems.start();
		courses.put("Java", "5.0");
		courses.put("Spring", "4.0");
		courses.put("Maven", "3.0");
		courses.put("REST", "4.6");
		
		Iterator<String> iterator =courses.keySet().iterator();
		while(iterator.hasNext()) {
			Thread.sleep(2000);
			String course = iterator.next();
			System.out.println(course);
		}
		System.out.println(courses);

	}

}
