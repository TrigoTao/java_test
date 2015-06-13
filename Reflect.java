package java_test;


public class Reflect {
	protected String p;
	 public Reflect(String a)
	 {
		 this.p =a ;
	 }
	 public static void main(String[] args){
		 Reflect r1=new Reflect("hello");
		 Reflect r2=new Reflect("hello2");
	 }
}
