package practice.main;
import java.util.Arrays;

public class MyList<E> {
	
	public static int CAPACITY=20;
	private Object element_array[];
	private int size=0;
	
	public MyList(){
		element_array = new Object[CAPACITY];
	}
	
	public void addElement(E element){
		if( size == element_array.length){
			increaseCapacity();
		}
		element_array[size++]=element;
	}
	
	public void increaseCapacity(){
		int newSize= element_array.length*2;
		element_array=Arrays.copyOf(element_array, newSize);
	}
	
	public E getElement(int elementIndex){
		if (elementIndex > size || elementIndex <0 ){
			throw new ArrayIndexOutOfBoundsException();
		}
		return (E) element_array[elementIndex] ;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

	}

}
