package coreJava;

public class ReverseString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String Nan="Welcome to home";
		char[] Rev= Nan.toCharArray();
		System.out.println(Rev[3]);
	
		for(int i=Rev.length-1;i>=0;i--) {
			System.out.print(Rev[i]);
			
		}
		
		System.out.println("");
		
		for(int i=Nan.length()-1;i>=0;i--) {
			System.out.print(Nan.charAt(i));
		
		}
		
		
		
		
		
		
		}
	}


