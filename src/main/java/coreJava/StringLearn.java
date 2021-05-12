package coreJava;

public class StringLearn {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 String a="QA Automation";
 String b= new String("QA Auto");
  int count= a.length();
  System.out.println(count);
  
 char chara= a.charAt(4);
 System.out.println(chara);
 
char[] nan= a.toCharArray();
System.out.println(nan[3]);
 
 String ma=a.concat(b);
 System.out.println(ma);
 
String ha= a.substring(3);
System.out.println(ha);

String da=a.substring(5,9);
System.out.println(da);
  
 String trim=a.trim();
 System.out.println(trim);
 
 int cda=a.indexOf('A');
 System.out.println(cda);
 
 String[] spil=a.split("");
 System.out.println(spil[2]);
 
 
 boolean start=a.startsWith("QA");
 System.out.println(start);
 
 boolean ens=a.endsWith("n");
 System.out.println(ens);
 
 
String repla=  a.replace("Q", "q");
System.out.println(repla);

boolean conta= a.contains("Auto");
System.out.println(conta);
 
	}

}
