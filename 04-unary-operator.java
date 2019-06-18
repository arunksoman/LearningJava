class OperatorExample{  
public static void main(String args[]){  
	int a=10;  
	int b=-10;  
	boolean c=true;  
	boolean d=false;  
	System.out.println(~a);
	// a = 01010 = 10
	// ~a = 10101 = -11(binary 2's complement')
	
	System.out.println(~b);
	// b = 0110(binary 2's complement')
	// ~b = 1001
	System.out.println(!c);
	
	System.out.println(!d);//true  
}}  