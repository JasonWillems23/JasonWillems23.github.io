**JasonWillems23's ePortfolio**

**Code Review:** 

[2-2 Milestone One Code Review](https://github.com/JasonWillems23/JasonWillems23.github.io/blob/master/2-2%20Milestone%20Code%20Review.mov)

**Enhancement One - Software Engineering/Design**

A.)  The artifact that I chose for the Software Design and Engineering category is called Lab 1-3 from my Data Structures and Algorithms class.  This particular program was used to help us learn out to create variables to be placed inside of a data structure and how to access and display that stored information through input prompts.  

B.)  I chose to include this particular artifact and convert it into another language because I have been exposed to multiple different programming languages throughout my coursework and I thought a great way to test my knowledge and show my problem solving skills would be to convert the program from C++ to Java.  By recreating this in another programming language, the artifact was improved by giving it more accessibility and giving others the ability to run the code on multiple platforms. 

C.)  I believe that I have met the course objectives for this artifact and have achieved the functionality that I set out to create upon converting this program from C++ to Java.  With some much appreciated guidance I was able to recreate a program that behaves in a very similar way to the original artifact using the concepts of the Java programming language.    	

D.)  I learned how to apply and implement some of the concepts of C++  and recreate them into Java.
	Some of the elements were not as simple as rewriting them in another language, I had to learn how each concept worked and how each language utilizes that concept in their language.  Some concepts diverged to a point that caused confusion and lead to mistakes.  

```java
import java.util.Scanner;

class BidApp {

    // declaring variables for BidApp
    private String title;
    private String fund;
    private String vehicleId;
    private Double bidAmount;

    public BidApp() {

    }

    public void displayBid() {

        // To display the bid information
        System.out.println("Title: " + title + "\n");
        System.out.println("Fund: " + fund + "\n");
        System.out.println("Vehicle ID: " + vehicleId + "\n");
        System.out.println("Bid Amount: " + bidAmount + "\n");

    }

    public void getBid(){

        Scanner in = new Scanner(System.in); // using Scanner package in obtain user input

        System.out.println("Enter Title: "); //prompt user for input
        title = in.nextLine();  // user input to be stored in each variable
        System.out.println("You entered: " + title);  // display current user input

        System.out.println("Enter Vehicle ID: ");
        vehicleId = in.nextLine();
        System.out.println("You entered: " + vehicleId);

        System.out.println("Enter Fund: ");
        fund = in.nextLine();
        System.out.println("You entered: " + fund);

        System.out.println("Enter Bid Amount: ");
        bidAmount = in.nextDouble();
        System.out.println("You entered bid amount: $" + bidAmount);


    }
}


public class NewBidApp {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        BidApp bid = new BidApp();  // creation of new object for BidApp

        int choice = 0;

        while (choice != 9){
            
            //implemented while loop to prompt user to choose from options
            System.out.println("Menu: " + "\n");
            System.out.println("1. Enter Bid Info: " + "\n");
            System.out.println("2. Display Bid Info: " + "\n");
            System.out.println("9. Exit: " + "\n");
            System.out.println("Enter Choice: ");
            choice = in.nextInt();

            //switch case to invoke methods to get bids and display them
            switch (choice) {
                case 1:
                    bid.getBid();
                    break;

                case 2:
                    bid.displayBid();
                    break;

                default:
                    break;
            }

        }

        // message upon exit
        System.out.println("Goodbye!");
    }



}
```



**Enhancement Two - Algorithms and Data Structures**

**Enhancement Three - Databases**




