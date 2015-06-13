package java_test;

import java.util.ArrayList;
import java.util.List;

public class ListTest {
	
	private static class Ele{
		public int a,b;
		Ele(int x, int y){a = x; b = y;}
	}
	
	public static void main(String[] args) {
		// work the same
//		class Ele{
//			public int a,b;
//			Ele(int x, int y){a = x; b = y;}
//		}
		
		List<Ele> list = new ArrayList<Ele>();
		list.add(null);
		for( Ele e : list ){
			System.out.println(e);
		}
		list.add(new Ele(1, 2));
		System.out.println(list.get(1).a);
		System.out.println(list.get(1).b);
		System.out.println(list.size());
		
		List<String> sl = new ArrayList<>();
		sl.add("ewr");
		sl.toArray();
		sl.toArray(new String[1]);
		System.out.println( "sl[0] : " + sl.get(0) );
		sl.set(0, "ds");
		System.out.println( "sl[0] : " + sl.get(0) );
	}

}
