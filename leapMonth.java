
package vu.javaexam2024;
//Below is the imported scanner to save user input
import java.util.Scanner;

public class leapMonth {
    
    public static void main(String[] args) {
    //Scanner object or instance of the scanner class created below
    Scanner save=new Scanner(System.in);
    
    // Declaration on year and month
    int year;
    int month;
    
    // prompt user for input
    System.out.print("Enter year: ");
        year = save.nextInt();
    System.out.print("Enter month: ");
        month = save.nextInt();
        
    //Checking  if the given month is a leap month
    
    Boolean isLeapMonth = (year %4 ==0);
        isLeapMonth = isLeapMonth &&(month%100 != 0);
        isLeapMonth = isLeapMonth ||(month %400 == 0);
 
        if (isLeapMonth) {
            System.out.println("The given month is a leap month.");
        } else {
            System.out.println("The given month is not a leap month.");
        }
       
    }
    
    
}
