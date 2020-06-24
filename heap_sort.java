package javalearning;

public class heap_sort {
	public static void heapsort(int[] array) {
		int len = array.length;
		if (len<2) return;
		buildmaxheap(array);
		while(len>0) {
			int temp = array[0];
			array[0] = array[len-1];
			array[len-1] = temp;
			len--;
		}

	}
	public static void buildmaxheap(int[] array) {
		int len = array.length;
		for(int i = 0;i<=2*len-1;i++) {
			siftdown(array,i);
		}
	}
	public static void siftdown(int[] array,int i) {
		int temp;
		if(array[left(i)]>array[i]) {
			temp = array[i];
			array[i] = array[left(i)];
			array[left(i)] = temp;
		}
		if(array[right(i)]>array[i]) {
			temp = array[i];
			array[i] = array[right(i)];
			array[right(i)] = temp;
		}
		
	}
	public static int left(int i) {
		return 2*i+1;
	}
	public static int right(int i) {
		return 2*(i+1);
	}
	public static void main() {
		int[] list1 = {5,38,15,36,26,50,27,2,44,58,4,19,46};
		heapsort(list1);
		for (int i = 0;i<list1.length;i++) {
			System.out.print(list1[i]);
			System.out.print(' ');
		}
		System.out.println();
	}
}
