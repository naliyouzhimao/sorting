package javalearning;

public class bubble_sort {
	public static int[] bubblesort(int[] array) {
		if (array.length == 0) {
			return array;
		}
		for (int i = 0;i < array.length;i++) {
			for (int j = 0;j < array.length -i-1;j++) {
				if (array[j] > array[j+1]) {
					int temp = array[j];
					array[j] = array[j+1];
					array[j+1] = temp;
				}
			}
		}
		return array;
	}
	public static void main( String[] args) {
		int[] list1 = {3,5,38,15,36,26,50,27,2,44,58,4,19,46};
//		bubble_sort process1 = new bubble_sort();
		list1 = bubblesort(list1);
		for(int i = 0;i<list1.length;i++) {
			System.out.print(list1[i]);
			System.out.print(' ');
		}
		
	}

}
