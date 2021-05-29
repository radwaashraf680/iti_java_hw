/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author original
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        // TODO code application logic here
        
        /*
            Your goal is to make a method called betterStringthat takes two Strings and 
            a lambda that says whether the first of the two is “better”.
        */
        String string1 = "radwaashraf";
        String string2 = "String";
        StringUtils isBetter_Length = (n, d) -> n.length() > d.length();
        if(isBetter_Length.betterString(string1, string2)) System.out.println(string1+" is better than "+string2); 
        else System.out.println(string2+" is better than "+string1); 
        
        /*
           Given a String, the task is to check whether a string contains only alphabets or not.
        */
         
        System.out.println("Test of string contains only alphabets");
        System.out.println("First Test Case Input=  , Output: " + isAlphabet("BetterString"));
        System.out.println("First Test Case Input=  , Output: " + isAlphabet("radwa1234567"));
        
        
        
    }
    
    
    public static boolean isAlphabet(String str)
    {
        return str.chars().allMatch(Character::isLetter);
    }
}
