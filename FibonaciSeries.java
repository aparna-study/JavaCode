package practice.main;

public class FibonaciSeries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		System.out.println(fibonaci(10));
		int febCount = 15;
		int[] feb = new int[febCount];
        feb[0] = 2;
        feb[1] = 4;
        for(int i=2; i < febCount; i++){
            feb[i] = feb[i-1] + feb[i-2];
        }

        for(int i=0; i< febCount; i++){
                System.out.print(feb[i] + " ");
        }

		

	}
	
	public static int fibonaci(int num){
		if(num==1 || num==2){
			return 1;
		}
		int sum=fibonaci(num-1)+fibonaci(num-2);
		
		return sum;
	}

}
