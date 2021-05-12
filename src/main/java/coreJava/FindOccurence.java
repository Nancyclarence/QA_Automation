package coreJava;

public class FindOccurence {
  public static void main(String[] args) {
	  String Name= "Nancyajay";
	   int count1=0;
	  for (int i=0; i< Name.length();i++) {
	  if(Name.charAt(i)=='a') {
		//  System.out.println(Name.charAt(i));
		  count1=count1+1;
		  System.out.println(count1);
	  }
	  }
	 
	  
	  int count2=0;
	 char[] ch=Name.toCharArray();
	 for (int i=0; i<Name.length();i++ ) {
		 if (ch[i]=='N') {
			 count2=count2+1;
		 System.out.println(count2);
			 
			 
		 }
	 }
	 
	System.out.println(Name.length()-Name.replace('a', ' ').length()); 
	
}
}
  
