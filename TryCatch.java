package java_test;

public class TryCatch {
	public static void main(String[] args){
		int[] array = new int[3];
		try{
			for(int i=0;i<4;++i){
				array[i] = i;
			}
			//System.out.println(array);
		} catch(ArrayIndexOutOfBoundsException e){
			//printed just to inform that we have entered the catch block
			System.out.println("Oops, we went to far, better go back to 0!");
		} finally{
			System.out.println("finally");
		}
		System.out.println("after try catch");
	}
}
