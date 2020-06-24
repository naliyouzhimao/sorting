package javalearning;

public class select_sort {
	public static int[] selectSort(int[] array) {
		if(array.length == 0) {
			return array;
		}
		for (int i = 0; i < array.length; i++) {
			int minIndx = i;
			for (int j = i+1; j < array.length; j++) {
				if (array[j] < array[minIndx]) //找到最小的数
                    minIndx = j; //将最小数的索引保存
			}
			int temp = array[minIndx];
			array[minIndx] = array[i];
			array[i] = temp;
			
		}
		return array;
	}
	public static void main(String[] args) {
		int[] list1 = {5,38,15,36,26,50,27,2,44,58,4,19,46};
		selectSort(list1);
		for (int i = 0;i<list1.length;i++) {
			System.out.print(list1[i]);
			System.out.print(' ');
		}
		
	}
}

