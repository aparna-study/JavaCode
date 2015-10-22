package practice.main;

public class MergeSort {
	
	int[] numbers;
	int[] helper;
	int num;
	
	public void sort(int[] input) {
		numbers = input;
		num = input.length;
		helper = new int[num];
		mergeSort(0,num-1);
	}
	
	private void mergeSort(int low, int high){
		if(low<high){
			int mid = low +(high-low) /2;
		}
		
	}
	
	
}
