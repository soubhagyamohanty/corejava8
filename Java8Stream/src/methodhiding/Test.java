package methodhiding;

public class Test {
	
	public static void main(String[] args) {
//		P.m1();
//		C.m1();
		
		P p = new P();
		p.m1();//Parent
		
		P p1 = new C();
		p1.m1();//Parent
		
		C c = new C();
		c.m1();//child
	}
	
	
	
	

}
