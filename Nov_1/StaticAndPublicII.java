/*
//FRC Canada
//FRC Java Coding Sessions - October to December, 2021
//This is the second example illustrating the difference
//Between static and public variables in Java.
 */

public class Main{
    static int a = 5;
    public int b = 10;
    public static void main(String[] args){
        Main M = new Main(); //One instance of Main
        Main M1 = new Main(); //Another instance of Main
        //Change a and b in M1
        M1.a = 20;
        M1.b = 20;
        //Since a is static, there is only one a for all Ms
        System.out.println(M.a); // a is changed in M
        System.out.println(M.b); // b is not changed in M
    }
}

