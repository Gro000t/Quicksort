//By: Andy Tian


import java.util.Arrays;
import java.util.Scanner;

class QSort {
	private static Scanner sc;
	public static void main(String args[]) {
		scan = new Scanner(System.in);

		System.out.println("Enter length");
		int n = sc.nextInt();

		System.out.println("Enter strings");
		int arr[] = new int[n];
		for (int i = 0; i < n; i++)
			arr[i] = sc.nextInt();
      
		sort(arr, 0, arr.length - 1);
    
		System.out.println(Arrays.toString(arr));
	}

	static void sort(int arr[], int start, int end) {
		if (start < end) {
			int pIndex = partition(arr, start, end);
			sort(arr, start, pIndex - 1);
			sort(arr, pIndex + 1, end);
		}
	}

	static int partition(int arr[], int start, int end) {
		int pivotVal = arr[end];
		int pivotIndex = start;
		for (int i = start; i < end; i++) {
			if (arr[i] <= pivotVal) {
				swap(arr, i, pIndex);
				pIndex++;
			}
		}
		swap(arr, pIndex, end);
		return pIndex;
	}

	static void swap(int arr[], int x, int y) {
		int temp = arr[x];
		arr[x] = arr[y];
		arr[y] = temp;
	}
} 
