package practice.main;

public class ChkValue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Integer a=30,b=30;
		int ai=30, aI=300,bi=30,bI=300;
		
		Integer aInew=new Integer(300), bInew= new Integer(300);

		if(ai==bi){
			System.out.println("int ai, bi=30 same");
			
		}
		
		if(a==b){
			System.out.println("Integer a,b =30 are same without new");
		}
		
		if(aInew==bInew){
			System.out.println("Integer aInew,bInew =300 are same without valueOf");
		}
		if(aI==bI){
			System.out.println("Integer aI,bI =300 are same without valueOf");
		}
		System.out.println("aInew"+aInew);
		System.out.println("bInew"+bInew);
//		if(valueOf(ai)==valueOf(bi)){
//			System.out.println("Integer aInew,bInew =300 are same without valueOf");
//		}
		
		
	}

}
