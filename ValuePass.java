package java_test;

public class ValuePass {
	class Bool{
		public boolean v;
		
		public Bool() {
			this.v = false;
		}
	}
	
	public boolean testBool( Boolean res ){
		res = true;
		return true;
	}
	
	public void testObject( Bool b ){
		b.v = true;
	}

	public static void main(String[] args) {
		ValuePass t = new ValuePass();
		
		Boolean b = false;
		t.testBool(b);
		System.out.println(b);
		
		Bool ob = t.new Bool();
		new ValuePass().testObject(ob);
		System.out.println(ob.v);
		
		int a = 3;
		Integer aa = a, aaa = a;
		System.out.println( a == aa );
		System.out.println( aaa == aa );
	}

}
