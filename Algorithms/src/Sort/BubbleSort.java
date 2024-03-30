package Sort;

import Common.Display;

public class BubbleSort {

	public static int[] bubbleSort(int arr[]) {
		if (arr.length <= 1)
			return arr;
		for (int i = 0; i < arr.length - 1; i++) {
			if (arr[i] > arr[i + 1]) {
				int temp = arr[i];
				arr[i] = arr[i + 1];
				arr[i + 1] = temp;
			}
		}
		return arr;
	}

	public static void main(String[] args) {
		int arr[] = { 6, 4, 5, 12, 2, 11, 9 };
		bubbleSort(arr);
		Display.display(arr);
	}
}
