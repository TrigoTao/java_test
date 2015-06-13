package java_test;

public class Calculator {

	public static void main(String[] args) {
		System.out.println(Integer.MAX_VALUE);
		System.out.println(Integer.MIN_VALUE);
		// TODO Auto-generated method stub
		int a = -12;
		System.out.println(a%10);//和正数一样
		System.out.println(a/10);
		
		System.out.println("----------------------------");
		System.out.println(-12%-2);
		System.out.println(-13%-2);
		
		System.out.println(13/-3);
		System.out.println(13%-3);
		
		Integer integer = -3;
		int x = integer;
		System.out.println(x%2);
		System.out.println(1%1);
	}
}
