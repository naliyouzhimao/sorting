package javalearning;

public class shell_sort {
	public static int[] shellsort(int[] array) {
		int len = array.length;
		int gap = len/2;
		while(gap>0) {
			for(int i = gap ;i<len;i++) {
				int current = array[i];
				int indx = i;
				while((indx-gap)>=0 && current<array[indx-gap]) {
					array[indx] =array[indx-gap]; 
					indx -= gap;
					
				}
				array[indx] = current;
				
			}
			gap/=2;
		}
		return array;
	}
	public static void main(String[] args) {
		int[] list1 = {5,38,15,36,26,50,27,2,44,58,4,19,46};
		shellsort(list1);
		for (int i = 0;i<list1.length;i++) {
			System.out.print(list1[i]);
			System.out.print(' ');
			
		}

	}
}
