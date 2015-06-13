package java_test;

class GrandFather{
	int a=0;
	
	public int getA(){
		return a;
	}
}

class Father extends GrandFather{
	int a=1;
	
	private void privatesay() {
		System.out.println( " father private say " );
	}
	
	public int getA(){
		return a;
	}
	
	public void say(){
		privatesay();
		System.out.println( " I'm Father ! " );
	}
}

public class Son extends Father{
	int a=2;
	
	private void privatesay() {
		System.out.println( " Son private say " );
	}
	
	public int getA(){
		return super.getA();
	}
	
	public void say(){
		privatesay();
		System.out.println( " I'm Son ! " );
	}

	public static void main(String[] args) {
		Son s = new Son();
		//System.out.print(s.getA());
		s.say();
		
		Father f = s;
		s.say();
	}

}
