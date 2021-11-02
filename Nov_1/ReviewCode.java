class Main {  
  public static void main(String args[]) { 
    System.out.println("Hello, world!"); 
	int number = -5;
	float speed = 0.35f;
	String name = "Ted";
	System.out.println(number);
	  System.out.println(speed);
	  System.out.println(name);
	if (number > 0) {
		System.out.println("The number is greater than 0");
		number--; // Assignment operator (decrements)
	
		}
	if (number < 0 || name == "Sue") {
		System.out.println("The special condition is met.");
		number++; // Assignment operator (increments)
	
		}
	  System.out.println(number); 
	  for(int i = 0; i < 100; i++){
		  System.out.println(i);
		  }
  } 
}
