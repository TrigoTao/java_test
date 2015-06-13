package java_test;

import java.util.HashMap;
import java.util.Map;


public class MapTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<Integer,Integer> map = new HashMap<>();
		map.get(1);
		
		Map<Integer, char[]> map2 = new HashMap<>();
		map2.put(1, new char[] {'a','b'});
		System.out.println(map2.get(1));
	}

}
