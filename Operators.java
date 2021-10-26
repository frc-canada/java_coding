//FRC Canada
//FRC Java Coding Sessions - October to December, 2021
// Arithmetic Operators and Assignment Operators
class Main {  
  public static void main(String args[]) { 
    System.out.println("Hello, world!"); 

	//Arithmetic Operators: +, -, *, /, %
    int a = 5;
	int b = a + 3;
	int c = a - 4;
	int d = a * 80;
	int e = a / 7;
	int f = a % 3;
	System.out.println(a);
	System.out.println(b);
	System.out.println(c);
	System.out.println(d);
	System.out.println(e);
	System.out.println(f);
	  
	//Basic assignment operator: '='
	int integer = 4;
	float floatNumber = 4.234f;
	boolean switchOn = true;
	System.out.println(floatNumber);
	System.out.println(integer);
	System.out.println(switchOn);
	//Various other assignment operators (see online tutorials in search engines for more details):
    integer++;
	System.out.println(integer);
	integer--;  
	System.out.println(integer);
	integer*=6;  
	System.out.println(integer);
	integer-=23;  
	System.out.println(integer);
	integer = integer + 17;
	System.out.println(integer);
	integer  = integer + 34;
	System.out.println(integer);
	  
  } 
}
