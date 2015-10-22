package practice.main;

public class QuickSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public static void quickSort(int array[], int lowIndex, int highIndex) {

		if (lowIndex > highIndex) {

			int pIndex = reArrangeArr(array, lowIndex, highIndex);
			quickSort(array, lowIndex, pIndex - 1);
			quickSort(array, pIndex + 1, highIndex);

		}

	}

	public static int reArrangeArr(int[] array, int lowIndex, int highIndex) {
		int pivot = highIndex;
		int pIndex = lowIndex;

		for (int i = 0; i < highIndex; i++) {
			if (array[i] <= pivot) {
				int temp = array[i];
				array[i] = array[pIndex];
				array[pIndex] = temp;
				pIndex++;
			}
		}
		int temp = array[pIndex];
		array[pIndex] = array[highIndex];
		array[highIndex] = temp;

		return pIndex;
	}

}
