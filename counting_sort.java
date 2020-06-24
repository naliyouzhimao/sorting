package javalearning;
import java.util.Arrays;
public class counting_sort {
	public static void countingsort(int[] array) {
		if (array.length == 0) return;
		int min = array[0],max = array[0];
		for (int i = 1;i<array.length;i++) {
			if (array[i]>max) max = array[i];
			if(array[i]<min) min = array[i];
		}
		int[] help = new int[max-min+1];
		Arrays.fill(help, 0);
		for(int i = 0;i<array.length;i++) {
			help[array[i]-min]++;
		}
		int index = 0,i = 0;
		while (index<array.length){
			if(help[i]!= 0) {
				array[index] = i+min;
				index++;
				help[i]--;
			}
			else {
				i++;
			}
		}
		
	}
	public static void main(String[] args) {
		int[] list1 = {5,38,15,36,26,50,27,2,44,58,4,19,46};
		countingsort(list1);
		for (int i = 0;i<list1.length;i++) {
			System.out.print(list1[i]);
			System.out.print(' ');
		}
		System.out.println();
	}
}
