package Java_8;

import java.util.Arrays;

public class ParallelSort {

	public static void main(String[] args) {
		
		int [] arr = {3,4,5,2,9,8,7};
		
		Arrays.parallelSort(arr);
		for(int i :arr ) {
		System.out.println(i);
	}
	}
}
