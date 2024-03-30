package Sort;

import Common.Display;

public class InsertionSort {

	public static int[] insertionSort(int arr[]) {
		if (arr.length <= 1)
			return arr;
		for (int i = 1; i < arr.length; i++) {
			int temp = arr[i];
			int j = i - 1;
			while (j >= 0 && arr[j] > temp) {
				arr[j + 1] = arr[j];
				j = j - 1;
			}
			arr[j + 1] = temp;
		}
		return arr;
	}

	public static void main(String[] args) {
		int arr[] = { 6, 4, 5, 12, 2, 11, 9 };
		insertionSort(arr);
		Display.display(arr);
	}
}
