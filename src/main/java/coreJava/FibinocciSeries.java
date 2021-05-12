package coreJava;

public class FibinocciSeries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int firstNum=0;
		int SecNum=1;
		 int sum;
		
	
                
		     for (int i=1;i<=11;i++) {
		    	 
		    	 if(i<=1) {
		    		 sum=i;
		    	 }
		    	 else {
					sum=firstNum+SecNum;
					 firstNum =SecNum;
					SecNum=sum;
		    	 }
					
							System.out.println(sum);
				}
	}


	}



