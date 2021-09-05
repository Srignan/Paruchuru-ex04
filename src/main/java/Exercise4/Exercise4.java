package Exercise4;

import java.util.Scanner;
/*
Import scanner
Make user input print statements for noun, verb, adj, and adv
Add into print statements
 */
public class Exercise4 {
    public static void main(String[] args)
    {
        Scanner keyboardInput = new Scanner(System.in);

        System.out.print("Enter a noun: ");
        String Noun = keyboardInput.nextLine();

        System.out.print("Enter a verb : ");
        String Verb = keyboardInput.nextLine();

        System.out.print("Enter an adjective: ");
        String Adjective = keyboardInput.nextLine();

        System.out.print("Enter an adverb: ");
        String Adverb = keyboardInput.nextLine();

        System.out.println("Do you " +Verb +" your " + Adjective +" "+ Noun +" "+ Adverb+"? That's hilarious!");
    }
}