/*
//FRC Canada
//FRC Java Coding Sessions - October to December, 2021
//This is the first example illustrating the difference
//Between static and public variables in Java.
 *
 */
public class Main{
    static int a = 5;
    public int b = 10;
    public static void main(String[] args){
        System.out. println(a); // Immediately access ‘a’
        //System.out. println(b);
        Main M = new Main(); //Declare instance of Main
        System.out.println(M.b); //Then access ‘b’ through M.b
    }
    
}

