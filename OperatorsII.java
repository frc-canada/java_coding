//FRC Canada
//Online Coding Sessions - October to December, 2021
//Comparison Operators and Logical Operators
class Main {  
  public static void main(String args[]) { 
	//Comparison Operators:
	//Compares two variables and returns true or false
	int a = 5;
	int b = 6;

	// Beware of '=' vs '=='!!!
	System.out.println(a == 5); // equals
	System.out.println(a < 5); // less than
	System.out.println(a > 5); // greater than
	System.out.println(a >= 5); // greater than / equal to
	System.out.println(a <= 5); // less than / equal to
	System.out.println(a >= b);
	System.out.println(a != 5); // not equal to
	System.out.println(b != 5);

	// Logical operators:
	// 'and' - &&
	// 'or' - ||
	// 'not' - ! - negates a boolean expression
	//     it turns true to false and false to true
	System.out.println(a >=5 && a <=10);
	System.out.println(a <5 || a >=10);
	System.out.println(!(a==5));
  } 
}
