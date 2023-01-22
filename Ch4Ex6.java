
package ch4ex6;
import java.util.Scanner;
public class Ch4Ex6 {

    public static void main(String[] args) {
        int change,holder,aq,ad,an,p;
        System.out.println("Welcome to the change exchanger\nCoded by Cole\n\nPlease enter your change in cents:");
        
        Scanner input = new Scanner(System.in);
        change=input.nextInt();
        input.close();
        
        
        
        //Displays the number of quarters for everything
        System.out.println("Your Quarters: "+change/25);
        change%=25;
        System.out.println("Your Dimes: "+change/10);
        change%=10;
        System.out.println(change);
        System.out.println("Your Nickels: "+change/5);
        change%=5;
        System.out.println("Your Pennies: "+change);
    }
    
}

