package java_test;

enum Sigleton{
	INSTENCE,TWO;
	private int x = 0;
	void add(){ x++; }
	void say(){ System.out.println("now : " + x); }
}

public class EnumTest {

	public static void main(String[] args) {
		Sigleton sig1 = Sigleton.INSTENCE, sig2 = Sigleton.INSTENCE;
		sig1.add(); sig1.say();
		sig2.add(); sig2.say();
		Sigleton sig3 = Sigleton.TWO, sig4 = Sigleton.TWO;
		sig3.add(); sig3.say();
		sig4.add(); sig4.say();
	}
}
