package javalearning;

public class insert_sort {
	public static int[] insertsort(int[] array) {
		if (array.length ==0){
		return array;
	}
		for (int i = 1;i<array.length;i++) {
			int current = array[i]; 
			int j = i-1;
			while(j>=0 && current<array[j]) {
				array[j+1] = array[j];
				j --;
			}
			array[j+1] = current;
		}
		return array;
	}
	public static void main(String[] args) {
		int[] list1 = {5,38,15,36,26,50,27,2,44,58,4,19,46};
		insertsort(list1);
		for (int i = 0;i<list1.length;i++) {
			System.out.print(list1[i]);
			System.out.print(' ');
		}
	}
}
