package java_test;

public class BitOperation {
	public static void main(String[] args) {
		int x = -8; // 111..1000
		
		System.out.println(x>>2);
		System.out.println(x>>100); // 111...11
		System.out.println(x<<1); //左移只能无符号
		System.out.println(x>>>1);
		System.out.println(x>>>0);
		x = 0x8000;//1000_0000_0000_0000 , 用十六进制的时候， java认为首位不是符号位
		int y = 1;
		
		System.out.println(y&1);
		y = y<<1;
		System.out.println(y);
		//System.out.println( y<<1 & 1 == 1 );  wrong!
		
		int z = 1073741824; // 10...0 
		System.out.println( z << 1 );
	}

}
