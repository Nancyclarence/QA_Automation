package coreJava;

public class Arrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      String[] Nancy= new String[5];
      
      Nancy[0]= "java";
      Nancy[1]="selenium";
      Nancy[2]="Maven";
      Nancy[3]="jenkins";
      Nancy[4]="devops";
      
      System.out.println(Nancy[2]);
      
      System.out.println(Nancy.length);
      
      System.out.println(Nancy[Nancy.length-1]);
      
      for (int i = 0; i < Nancy.length; i++) {
    	  System.out.println(Nancy[i]);
      }  
    	  
    	 Arrays.sort(Nancy);
		
    
      for (int i = 0; i < Nancy.length; i++) {
    	  System.out.println(Nancy[i]);
		
	}
      
      for (int i = Nancy.length-1; i>=0; i--) {
    	  System.out.println(Nancy[i]);
		
	}
	}

	public static void sort(String[] nancy) {
		// TODO Auto-generated method stub
		
	}

	public static void sort(int[] num) {
		// TODO Auto-generated method stub
		
	}

	
	}

	
		

	
	

	
	


