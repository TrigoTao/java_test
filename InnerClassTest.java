package java_test;

public class InnerClassTest {

	public static void main(String[] args) {
		InnerClass outerClass = new InnerClass();
		outerClass.setInnerA(outerClass.new InnerA(){ void deal(){System.out.print("work!");} });
		outerClass.run();
		
		final String s="12345";
		outerClass.setInnerA(outerClass.new InnerA(){ void deal(){System.out.print(s);} });
		outerClass.run();
	}

}

class InnerClass{
	private InnerA a = null;
	String s="54321";
	
	public void setInnerA(InnerA a){
		this.a = a;
	}
	
	public void run(){
		new InnerB();
		if(null!=a){
			System.out.println("in!");
			a.deal();
		}
		else
			System.out.println("null a");
	}
	
	public abstract class InnerA{
		abstract void deal();
	}
	
	private class InnerB{}
}