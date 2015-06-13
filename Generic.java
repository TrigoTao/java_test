package java_test;

import java.util.ArrayList;
import java.util.List;

public class Generic {

	
	
	public static void main(String[] args) {
		MemberG memberG = new MemberG();
		memberG.setList(new ArrayList<String>());
	}

}

class MemberG{
	private List<?> list;

	public List<?> getList() {
		return list;
	}

	public void setList(List<?> list) {
		this.list = list;
	}
	
	public void add(){
		//err
		//list.add("dsd");
	}
}