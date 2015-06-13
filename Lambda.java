package java_test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Lambda {

	public static void main(String[] args) {
		System.out.println(System.getProperty("java.version"));
		
		List<String> sList = new ArrayList<>();
		sList.add("abb");
		sList.add("fdf");
		sList.add("ccd");
		sList.forEach( (s) -> { System.out.println(s); } );
		
		Collections.sort(sList, (s1, s2) -> { return -1; });
		System.out.println();
		sList.forEach( (s) -> { System.out.println(s); } );
	}

}
