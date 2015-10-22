import java.util.Scanner;


public class InsertionSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input = new Scanner(System.in);
		public T[] array=(T[])new Object[5];
		for(int i=0;i<5;i++){
			System.out.println("enter array elements");
			array[i]=input.nextInt();
		}
		
		insertionSort(array);
	}
	
	public static void insertionSort(T a[]){
		
		for(int j=1;j<a.length;j++){
			T key = a[j];
			int i=j-1;
			
			while((i>-1) &&  a[i]>key){
				a[i+1] =a[i];
				i=i-1;
			}
			a[i+1] = key;
			
		}
		for(int k=0;k<a.length;k++){
			System.out.println(a[k]);
			}
	}

}
