package java_test;

public class StringTest {
	public static void main(String[] args) {
		StringBuilder cb = new StringBuilder();
		cb.append('a');
		cb.append("b");
		cb.append("cdefg");
		String s = cb.toString();
		for(char c : s.toCharArray()){
			//System.out.println(c);
		}
		System.out.println( s.substring(0,0) );
		System.out.println( s.substring(7) );
		System.out.println( cb.length() );
		
		final char value[] = new char[]{'a','b'};
		value[0] = 'b';
		System.out.println(value[0]);
		//value = new char[]{'x'}; this is wrong!
		
		String s0 = "12";
		String s1 = "123";
		String s2 = s0+"3";
		String s3 = new String("123");
		String s4 = s3.intern();
		String s5 = s4 + "4";
		String s6 = s3 + "4";
		
		System.out.println(s1==s2);
		System.out.println(s1==s3);
		System.out.println(s1==s3.intern());
		System.out.println(s1==s3);
		System.out.println(s1==s4);
		System.out.println(s5 == s6);
		
		Boolean b1 = new Boolean("true");
		Boolean b2 = true;
		Boolean b3 = true;
		Boolean b4 = new Boolean("true");
		System.out.println(b1 == b2);
		System.out.println(b2 == b3);
		System.out.println(b1 == b4);
		b4 = true;
		System.out.println(b2 == b4);
		
		s = "123";
		System.out.println(s.indexOf("3",3));
	}
}
