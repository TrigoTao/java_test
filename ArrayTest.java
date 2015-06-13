package java_test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class ArrayTest {
	public static void main(String[] args) {
		class Ele{
			public int a,b;
			Ele(int x, int y){a = x; b = y;}
		}
		int[] a = new int[]{1,2,3,4,5};
		int[] c = a.clone();
		int[] b = new int[5];
		int[] d = a;
		int n = 6;
		int[][] e = new int[n][2];
		System.out.println( "e.length : " + e.length );

		System.arraycopy( a, 0, b, 0, a.length );
		int[] co = Arrays.copyOf(a, a.length);
		
		a[1] = 6;
		
		System.out.println(Arrays.toString(a));
		System.out.println(Arrays.toString(b));
		System.out.println(Arrays.toString(c));
		System.out.println(Arrays.toString(d));
		System.out.println(Arrays.toString(co));
		
		List<Ele> list = new ArrayList<Ele>();
		list.add(new Ele(1, 2));
		System.out.println(list.get(0).a);
		System.out.println(list.size());
		
		List<String> sl = new ArrayList<>();
		sl.add("ewr");
		sl.toArray();
		sl.toArray(new String[1]);
	}
}
