/*
 *
 *//FRC Canada
 *//FRC Java Coding Sessions - October to December, 2021
// Class Inheritance Example
//
// Instructions:  
// Rename the file as Main.java
// Execute in REPL Java or in VS Code (You will have to configure java in VSCode)
 *
 */

 //This is the definition of a basic class, Robot
 //It has one method and no attributes
class Robot{

    void info(){
        System.out.println("This is a robot.");
    }    

    
}

//We use inheritance here:
//FRCRobot inherits the attributes and methods of class Robot
class FRCRobot extends Robot{
    //This is a method override.  The original method no longer applies
    //The new method is used instead.
    @Override
    void info(){
        System.out.println("This is not a robot");
    }    

    
}


//This is the program's main class
class Main{
    
    public static void main(String[] args){
    System.out.println("The main class constructor has been called.");    
    //Instantiate a new instance of class Robot
    Robot R1 = new Robot();
    //Instantiate a new instance of class FRCRobot
    Robot R2 = new FRCRobot();

    R1.info();
    R2.info();
    }


}
