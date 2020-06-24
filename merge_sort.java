package javalearning;
import java.util.*;
public class merge_sort {
	
	public static int[] mergesort(int[] array) {
		if(array.length<2) return array;
		int mid = array.length/2;
		int[] left = Arrays.copyOfRange(array, 0, mid);
		int[] right = Arrays.copyOfRange(array, mid,array.length);
		return merge(mergesort(left),mergesort(right));
	}
	public static int[] merge(int[] left,int[] right) {
		int[] result = new int[left.length + right.length];
		for (int index = 0,i = 0,j = 0;index<result.length;index++) {
			if (i>=left.length) result[index] = right[j++];
			else if(j>=right.length)result[index] = left[i++];
			else if(left[i]<right[j])result[index] = left[i++];
			else result[index] = right[j++];
		}
		return result;
	}
	public static void main(String[] args) {
		int[] list1 = {5,38,15,36,26,50,27,2,44,58,4,19,46};
		list1 = mergesort(list1);
		for (int i = 0;i<list1.length;i++) {
			System.out.print(list1[i]);
			System.out.print(' ');
		}
		System.out.println();


	}
}
