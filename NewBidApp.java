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
