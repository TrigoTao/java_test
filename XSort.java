package java_test;

import java.util.Arrays;

public class XSort {
	private static void swap(int[] arr, int a, int b) {
		int tmp = arr[a];
		arr[a] = arr[b]; arr[b] = tmp;
	}
	
	private static int partition(int[] arr, int beg, int end) {
		int piv = arr[beg], pos = beg, i = beg+1;
		while(i<=end){
			if( arr[i] < piv ){
				swap(arr, i, ++pos);
			}
			i++;
		}
		swap(arr,  beg,  pos);
		return pos;
	}
	
	public static void quickSort(int[] arr, int beg, int end) {
		if(beg < end){
			int k = partition(arr, beg, end);
			quickSort(arr, beg, k-1);
			quickSort(arr, k+1, end);
		}
	}
	
	private static void pushdown(int[] arr, int pos, int n) {
		if( n == 0 ) return;
		
		int to = pos, val = arr[pos];
		while( pos*2+1 < n ){
			if( pos*2+2 < n && arr[pos*2+2] > arr[pos*2+1] ) to = pos*2+2;
			else to = pos*2+1;
			
			if( val < arr[to] ){
				arr[pos] = arr[to]; pos = to;
			}else break;
		}
		arr[pos] = val;
	}
	
	public static void heapSort(int[] arr) {
		int n = arr.length;
		for( int i = n/2; i >= 0; i-- ){ pushdown(arr, i, n); }
		for( int i = n-1; i > 0 ; i-- ){ 
			swap(arr, i, 0); pushdown(arr, 0, i);
		}
	}

	public static void main(String[] args) {
		int[] arr = {};
		heapSort(arr);
		//quickSort(arr, 0, arr.length-1);
		System.out.println( Arrays.toString(arr) );
		
		int[] arr1 = {2,2,1,2};
		heapSort(arr1);
		//quickSort(arr1, 0, arr1.length-1);
		System.out.println( Arrays.toString(arr1) );
	}

}
