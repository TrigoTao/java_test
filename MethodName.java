package java_test;

public class MethodName {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}

interface I1 { void say(); }
interface I2 { int say(); }
interface I3 { int say(int i); }

class C { 
	public int say(){return 0;}
	//public void say(){}
}

//class C1 implements I1, I2{
//
//	@Override
//	public void say() {
//		// TODO Auto-generated method stub
//		
//	}
//	
//	@Override
//	public int say() {
//		// TODO Auto-generated method stub
//		
//	}
//}