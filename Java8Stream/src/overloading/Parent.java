package overloading;

public class Parent {
	//Rule-1 
	//Either type of Argument int,float,double,long different
	//No of argument
	
	//over loading 
	
	public void m1() {
		System.out.println("Parent Method-No Arg method");
	}
	
//	public void m1(int a) {
//		System.out.println("Parent Method-One Arg method");
//	}
//	public void m1(double a) {
//		System.out.println("Parent Method-One Arg method");
//	}
	
	public void m1(int a,float b) {
		System.out.println("Parent Method-2argument Arg method");
	}
	
	public void m1(int a,double b) {
		System.out.println("Parent Method-2-2argument Arg method");
	}
	
	
	 

}
