package javalearning;

public class quick_sort {
	public static void quicksort(int[] array,int start,int end ) {
		if(start>end) return;
		int i = start;
		int j = end;
		int temp = array[start];
		while (i<j) {
			while(array[j]>=temp) {
				j--;
			}
			int t = array[i];
			array[i] = array[j];
			array[j] = t;
			while(array[i]<=temp&&i<j) {
				i++;
			}
			t = array[i];
			array[i] = array[j];
			array[j] = t;
		}

		quicksort(array,start,i-1);
		quicksort(array,i+1,end);
		
	}

	public static void main(String[] args) {
		int[] list1 = {5,38,15,36,26,50,27,2,44,58,4,19,46};
		quicksort(list1,0,list1.length-1);
		for (int i = 0;i<list1.length;i++) {
			System.out.print(list1[i]);
			System.out.print(' ');
		}
		System.out.println();
	}

}
