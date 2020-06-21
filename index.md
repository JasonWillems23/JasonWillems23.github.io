**JasonWillems23's ePortfolio**

**Professional Self-Assessment**

A.)  When I started this journey roughly three years ago, I had a very minimal sense of what I wanted out of the computer science program and no idea where it would take me.  As I progressed through the program coursework and was exposed to the different aspects of computer science, the areas in which I wanted to focus after graduation quickly became apparent.  What I hadn’t yet understood was how integral the other aspects of computer science were to my overall success in school and beyond.  One project I worked on during my coursework that had a profound impact on me was during the Collaboration and Team Project course.  This course taught me the essential skills and knowledge regarding version control and how to manage local and centralized repositories using resources such as Bitbucket and Git Bash.  Throughout my coursework  I have also development a familiarity in using several different integrated development environments such as Eclipse, NetBeans, and PyCharm.  This has allowed me to create functional code using multiple programming languages like Java, C++ and Python.  Upon my completion of courses encompassing software design, data structures and algorithms, I learned the importance of creating modular and reusable code to maximize my efficiency as a programmer and how to apply practical testing and debugging methods to ensure proper functionality of a program.  The completion of this coursework has provided me with the competence, proficiency and know-how to initiate and implement revisions and enhancements to these artifacts from my coursework.  This firmly demonstrates my strengths and abilities which I will draw upon to quickly establish myself in a professional role within the world of computer science.

B.)  The following artifacts that I have chosen to include in my ePortfolio are a culmination of projects that have had a profound impact on me throughout my coursework and have ultimately become the primary focus for my future professional endeavors.  The concepts and applications for which the Java programming language can be used in the world of computer science, coupled with the importance of relational database management through skills within MySQL, have inspired me to pursue these aspects as my primary focal points as a computer science professional.  The first such artifact from the software engineering and design category was originally a C++ program that prompted a user for information regarding a bid, stored that information and displayed that same information with a different prompt via a menu.  I opted to convert this program from C++ into Java to showcase my knowledge and aptitude surrounding the concepts of Java and how they relate to other programming languages.  The next artifact, as it pertains to data structures and algorithms, is a C++ program that loads information from an external file and runs a selection sort algorithm based on information from the file.  I chose to enhance this artifact to demonstrate my comprehension of the concepts regarding data structures and algorithms, as well as, my capacity to incorporate additional functionality while maintaining the original integrity of the code.  The final enhancement included in the ePortfolio relates to a database artifact that uses MySQL to create, read, update and delete information that is included in a relational database.  This artifact was chosen to implement a more complex query that further expands upon the data within the database that uses more advanced methodologies of MySQL.  These artifacts were specifically chosen as a cohesive collection that represents my full range of knowledge, skills and abilities as they pertain to computer science.  

**Code Review:** 

[2-2 Milestone One Code Review](https://github.com/JasonWillems23/JasonWillems23.github.io/blob/master/2-2%20Milestone%20Code%20Review.mov)

**Enhancement One - Software Engineering/Design**

A.)  The artifact that I chose for the Software Design and Engineering category is called Lab 1-3 from my Data Structures and Algorithms class.  This particular program was used to help us learn out to create variables to be placed inside of a data structure and how to access and display that stored information through input prompts.  

B.)  I chose to include this particular artifact and convert it into another language because I have been exposed to multiple different programming languages throughout my coursework and I thought a great way to test my knowledge and show my problem solving skills would be to convert the program from C++ to Java.  By recreating this in another programming language, the artifact was improved by giving it more accessibility and giving others the ability to run the code on multiple platforms. 

C.)  I believe that I have met the course objectives for this artifact and have achieved the functionality that I set out to create upon converting this program from C++ to Java.  With some much appreciated guidance I was able to recreate a program that behaves in a very similar way to the original artifact using the concepts of the Java programming language.    	

D.)  I learned how to apply and implement some of the concepts of C++  and recreate them into Java.
	Some of the elements were not as simple as rewriting them in another language, I had to learn how each concept worked and how each language utilizes that concept in their language.  Some concepts diverged to a point that caused confusion and lead to mistakes. 
	
[NewBidApp.java](https://github.com/JasonWillems23/JasonWillems23.github.io/blob/master/NewBidApp.java)	

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

A.)  The artifact I chose for the Algorithms and Data Structures category is called VectorSorting.  This is a program that I worked on in June of 2019 as part of the coursework for my Data Structures and Algorithm class.  This artifact is a C++ program that uses a data structure to store information from an external parser file and implements a sort logic algorithm that allows the user to implement a quick sort or selection sort of the file.

B.)  I selected this artifact to be included in my ePortfolio because I believe that it will showcase my understanding regarding Algorithms and Data Structures, as well as, my ability to add practical functionality to an existing program.  The enhancements that I want to include in this artifact will improve the code by providing more pragmatic and effective functionality that will expand the current usability of the program. Successfully implementing my planned enhancements will exhibit a fundamental comprehension that encompasses the concepts of data structure and algorithm creation and execution.

C.)  I believe that I was able to add the functionality that I set out to create in my enhancement plan for this artifact.  It was a struggle at first to get the original program to run in my environment, but once that was accomplished, I was able to implement the new variables and functions into the code that provided the planned enhancements from Module One.    Working on this artifact has given me new insight on using the principles of algorithms and data structures and the ability to use the knowledge I have gained to design and create new possibilities within existing programs. 	

D.)  I feel that one major challenge that I faced when implementing the enhancements was to ensure that the new functionality that I was adding to the program did not interfere with its current state and allowed the program to function as expected.  The primary goal was to seamlessly integrate the enhancements that I am implementing into the program.  With this in mind, I was able to focus on each function within the code and I learned quite a lot about how declared variables are used as parameters and how they are called into different functions throughout the program. I also learned how to add to a data structure that is used to read information from an external file.  The overall experience has shed new light on what it takes to work with code that has already been created and has instilled new confidence in my potential abilities as a future coder.  

[SelectionSortCapstone.cpp](https://github.com/JasonWillems23/JasonWillems23.github.io/blob/master/SelectionSortCapstone.cpp)

```cpp
//Jason Willems Category Two Enhancements

#include <algorithm>
#include <iostream>
#include <time.h>

#include "CSVparser.hpp"

using namespace std;

//============================================================================
// Global definitions visible to all methods and classes
//============================================================================

// forward declarations
double strToDouble(string str, char ch);

// define a structure to hold bid information
struct Bid {
    string bidId; // unique identifier
    string title;
    string fund;
    string department;  // added department variable to the struct
    double amount;


    Bid() {
        amount = 0.0;
    }
};

//============================================================================
// Static methods used for testing
//============================================================================

/**
 * Display the bid information to the console (std::out)
 *
 * @param bid struct containing the bid info
 */
void displayBid(Bid bid) {
    cout << bid.bidId << ": " << bid.title << " | " << bid.amount << " | "
            << bid.fund << " | " << bid.department << endl;  // Added department to displaybid function

    return;
}

/**
 * Prompt user for bid information using console (std::in)
 *
 * @return Bid struct containing the bid info
 */
Bid getBid() {
    Bid bid;

    cout << "Enter ID: ";
    cin.ignore();
    getline(cin, bid.bidId);

    cout << "Enter Title: ";
    getline(cin, bid.title);

    cout << "Enter Fund: ";
    cin >> bid.fund;

    cout << "Enter Department: ";  //added department to getBid function
    cin >> bid.department;
    getline(cin, bid.department);

    cout << "Enter amount: ";
    cin.ignore();
    string strAmount;
    getline(cin, strAmount);
    bid.amount = strToDouble(strAmount, '$');

    return bid;
}

/**
 * Load a CSV file containing bids into a container
 *
 * @param csvPath the path to the CSV file to load
 * @return a container holding all the bids read
 */
vector<Bid> loadBids(string csvPath) {
    cout << "Loading CSV file " << csvPath << endl;

    // Define a vector data structure to hold a collection of bids.
    vector<Bid> bids;

    // initialize the CSV Parser using the given path
    csv::Parser file = csv::Parser(csvPath);

    try {
        // loop to read rows of a CSV file
        for (int i = 0; i < file.rowCount(); i++) {

            // Create a data structure and add to the collection of bids
            Bid bid;
            bid.bidId = file[i][1];
            bid.title = file[i][0];
            bid.fund = file[i][8];
            bid.department = file[i][2]; // added department variable to the collection

            bid.amount = strToDouble(file[i][4], '$');


            // push this bid to the end
            bids.push_back(bid);
        }
    } catch (csv::Error &e) {
        std::cerr << e.what() << std::endl;
    }
    return bids;
}

// FIXME (2a): Implement the quick sort logic over bid.title

/**
 * Partition the vector of bids into two parts, low and high
 *
 * @param bids Address of the vector<Bid> instance to be partitioned
 * @param begin Beginning index to partition
 * @param end Ending index to partition
 */
int partition(vector<Bid>& bids, int begin, int end) {
    int low = begin;
    int high = end;

    // pick the middle element as pivot point
    int pivot = begin + (end - begin) / 2;

    bool done = false;
    while (!done) {

        // keep incrementing low index while bids[low] < bids[pivot]
        while (bids.at(low).title.compare(bids.at(pivot).title) < 0) {
            ++low;
        }

        // keep decrementing high index while bids[pivot] < bids[high]
        while (bids.at(pivot).title.compare(bids.at(high).title) < 0) {
            --high;
        }

        /* If there are zero or one elements remaining,
         all bids are partitioned. Return high */
        if (low >= high) {
            done = true;
        } else {
            // swap the low and high bids (built in vector method)
            swap(bids.at(low), bids.at(high));

            // move low and high closer
            ++low;
            --high;
        }
    }

    return high;
}


/**
 * Perform a quick sort on bid title
 * Average performance: O(n log(n))
 * Worst case performance O(n^2))
 *
 * @param bids address of the vector<Bid> instance to be sorted
 * @param begin the beginning index to sort on
 * @param end the ending index to sort on
 */
void quickSort(vector<Bid>& bids, int begin, int end) {
    int mid = 0;

    /* Base case: If there are 1 or zero bids to sort,
     partition is already sorted */
    if (begin >= end) {
        return;
    }

    /* Partition bids into low and high such that
     midpoint is location of last element in low */
    mid = partition(bids, begin, end);

    // recursively sort low partition (begin to mid)
    quickSort(bids, begin, mid);

    // recursively sort high partition (mid+1 to end)
    quickSort(bids, mid + 1, end);
}

// FIXME (1a): Implement the selection sort logic over bid.title

/**
 * Perform a selection sort on bid title
 * Average performance: O(n^2))
 * Worst case performance O(n^2))
 *
 * @param bid address of the vector<Bid>
 *            instance to be sorted
 */
void selectionSort(vector<Bid>& bids) {

    int min; // index of the current minimum bid

    // cache size of bids vector
    size_t size = bids.size(); // size_t is platform-neutral result of size()

    // pos is the position within bids that divides sorted/unsorted
    for (size_t pos = 0; pos < size - 1; ++pos) {
        min = pos;

        // loop over remaining elements to the right of position
        for (size_t i = pos + 1; i < size; ++i) {
            // if this element's title is less than minimum title
            if (bids.at(i).title.compare(bids.at(min).title) < 0) {
                // this element becomes the minimum
                min = i;
            }
        }

        // swap the current minimum with smaller one found
        if (min != pos)
            // swap is a built in vector method
            swap(bids.at(pos), bids.at(min));
    }
}



// ADDED A SELECTION SORT BASED ON THE DEPARTMENT OF A BID
void selectionSortDepartment(vector<Bid>& bids) {

    int min; // index of the current minimum bid

    // cache size of bids vector
    size_t size = bids.size(); // size_t is platform-neutral result of size()

    // pos is the position within bids that divides sorted/unsorted
    for (size_t pos = 0; pos < size - 1; ++pos) {
        min = pos;

        // loop over remaining elements to the right of position
        for (size_t i = pos + 1; i < size; ++i) {
            // if this element's title is less than minimum title
            if (bids.at(i).department.compare(bids.at(min).department) < 0) {  //adjusted if to compare bids based on departments
                // this element becomes the minimum
                min = i;
            }
        }

        // swap the current minimum with smaller one found
        if (min != pos)
            // swap is a built in vector method
            swap(bids.at(pos), bids.at(min));
    }
}

/**
 * Simple C function to convert a string to a double
 * after stripping out unwanted char
 *
 * credit: http://stackoverflow.com/a/24875936
 *
 * @param ch The character to strip out
 */
double strToDouble(string str, char ch) {
    str.erase(remove(str.begin(), str.end(), ch), str.end());
    return atof(str.c_str());
}

/**
 * The one and only main() method
 */
int main(int argc, char* argv[]) {

    // process command line arguments
    string csvPath;
    switch (argc) {
    case 2:
        csvPath = argv[1];
        break;
    default:
        csvPath = "eBid_Monthly_Sales_Dec_2016.csv";
    }

    // Define a vector to hold all the bids
    vector<Bid> bids;

    // Define a timer variable
    clock_t ticks;

    int choice = 0;
    while (choice != 9) {
        cout << "Menu:" << endl;
        cout << "  1. Load Bids" << endl;
        cout << "  2. Display All Bids" << endl;
        cout << "  3. Selection Sort All Bids by Title" << endl;
        cout << "  4. Quick Sort All Bids" << endl;
        cout << "  5. Selection Sort All Bids by Department" << endl; // added option to select sort all bids by department
        cout << "  9. Exit" << endl;
        cout << "Enter choice: ";
        cin >> choice;

        switch (choice) {

        case 1:
            // Initialize a timer variable before loading bids
            ticks = clock();

            // Complete the method call to load the bids
            bids = loadBids(csvPath);

            cout << bids.size() << " bids read from file" << endl;

            // Calculate elapsed time and display result
            ticks = clock() - ticks; // current clock ticks minus starting clock ticks
            cout << "time: " << ticks << " clock ticks" << endl;
            cout << "time: " << ticks * 1.0 / CLOCKS_PER_SEC << " seconds" << endl;

            break;

        case 2:
            // Loop and display the bids read
            for (int i = 0; i < bids.size(); ++i) {
                displayBid(bids[i]);
            }
            cout << endl;

            break;

        // FIXME (1b): Invoke the selection sort and report timing results
        case 3:
            ticks = clock();

            selectionSort(bids);

            cout << bids.size() << " bids sorted by title" << endl;

            ticks = clock() - ticks;
            cout << "time: " << ticks << " clock ticks" << endl;
            cout << "time: " << ticks * 1.0 / CLOCKS_PER_SEC << " seconds" << endl;
            break;

        // FIXME (2b): Invoke the quick sort and report timing results
        case 4:
            ticks = clock();

            quickSort(bids, 0, bids.size() - 1);

            cout << bids.size() << " bids sorted" << endl;

            ticks = clock() - ticks;
            cout << "time: " << ticks << " clock ticks" << endl;
            cout << "time: " << ticks * 1.0 / CLOCKS_PER_SEC << " seconds" << endl;
            break;

        case 5:  // Added a case to include department selection sort
            ticks = clock();

            selectionSortDepartment(bids);

            cout << bids.size() << " bids sorted by department" << endl;

            ticks = clock() - ticks;
            cout << "time: " << ticks << " clock ticks" << endl;
            cout << "time: " << ticks * 1.0 / CLOCKS_PER_SEC << " seconds" << endl;
            break;

        default:  //Added a default case
        	break;


        }
    }

    cout << "Good bye." << endl;

    return 0;
}
```


**Enhancement Three - Databases**

A.)  The artifact that I have chosen to enhance for the Databases category is the final project that I completed in December of 2018 for my Introduction to SQL course.  This artifact uses MySQL commands to create, read, update and delete information within a database and also displays that information based on specific and customizable queries. 

B.)  I chose to include this artifact in my ePortfolio because MySQL is an area of Computer Science that I want to pursue when I finish with my degree program.  By enhancing this artifact with more complex queries, I will be able to showcase my comprehension of the fundamental aspects of using SQL to manage and manipulate sensitive information located within any database.  Successfully implementing more sophisticated query commands will give the artifact increased customizability that can be adopted to utilize the data in more meaningful ways.  

C.)  I do believe that I have met the objectives that I have set out to accomplish in my enhancement plan.  I have implemented a more complex query for added functionality that allows the data to be tailored to the needs of those who need to access it.  Additionally, I added a command to back up the entire database to a separate disk drive, as well as, a second command that only backs up the changes since the previous backup.  Both of which add an extremely important layer of redundancy to the database in the event of data loss.  

D.)  One of the major challenges that I faced while creating the enhancements for this artifact was the length of time that has gone by since I last used the concepts regarding relational database management.  As I was refamiliarizing myself and executing the enhancements, my desire to pursue MySQL in a professional capacity was reinforced and I became excited to start the process of drastically improving my proficiency of MySQL and database management post-graduation.  

[Category_Three_Capstone.txt](https://github.com/JasonWillems23/JasonWillems23.github.io/blob/master/Category_Three_Capstone.txt)

```sql

USE messaging;

INSERT INTO person (first_name, last_name)
VALUES
("Jason", "Willems");

ALTER TABLE messaging.person
ADD contact_phone_number INT(11) NOT NULL;

UPDATE messaging.person
SET contact_phone_number = 8478154570
WHERE person_id = 7;

DELETE FROM messaging.person
WHERE first_name = "Diana"
AND last_name = "Taurasi";

ALTER TABLE messaging.contact_list
ADD favorite VARCHAR(10) DEFAULT NULL;

UPDATE messaging.contact_list
SET favorite = "y"
WHERE contact_id = 1;

UPDATE messaging.contact_list
SET favorite = "n"
WHERE contact_id != 1;

INSERT INTO messaging.contact_list (person_id, contact_id, favorite)
VALUES
(1, 7, "y"),
(7, 2, "n"),
(7, 4, "n");

CREATE TABLE messaging.image (
image_id INT(8) NOT NULL AUTO_INCREMENT,
image_name VARCHAR(50),
image_location VARCHAR(250),
PRIMARY KEY (image_id)
) AUTO_INCREMENT = 1;

CREATE TABLE message_image (
message_id INT(8) NOT NULL,
image_id INT(8) NOT NULL,
PRIMARY KEY (message_id, image_id),
FOREIGN KEY (message_id) REFERENCES message (message_id),
FOREIGN KEY (image_id) REFERENCES image (image_id)
);


INSERT INTO messaging.image (image_name, image_location)
VALUES
("Selfie", "C:\Users\PC\Pictures"),
("My dog", "C:\Users\PC\Pictures"),
("First car", "C:\Users\PC\Pictures"),
("Daughter", "C:\Users\PC\Pictures"),
("Vacation", "C:\Users\PC\Pictures");

INSERT INTO messaging.message_image (message_id, image_id)
VALUES
(1, 5),
(5, 4), 
(5, 2),
(3, 3),
(2, 1);

SELECT 
sender.first_name AS "Sender's first name",
sender.last_name AS "Sender's last name",
receiver.first_name AS "Receiver's first name", 
receiver.last_name AS "Receiver's last name",
message_id AS "Message ID",
message AS "Message", 
send_datetime AS "Message Timestamp"
FROM message
RIGHT JOIN person AS sender ON 
sender.person_id = message.sender_id
RIGHT JOIN person AS receiver ON 
receiver.person_id = message.receiver_id
WHERE sender_id = 1;

SELECT COUNT(message.message_id) AS "Count of messages", 
person_id AS "Person ID",
first_name AS "First Name", 
last_name AS "Last Name"
FROM person
LEFT JOIN message ON 
message.sender_id = person.person_id
WHERE person_id > 0
GROUP BY person_id;

SELECT 
message.message_id AS "Message ID",
message AS "Message",
send_datetime AS "Message Timestamp",
image.image_name AS "First Image Name",
image.image_location AS "First Image Location"
FROM message
INNER JOIN message_image ON 
message.message_id = message_image.message_id
INNER JOIN image ON 
message_image.image_id = image.image_id
ORDER BY message_image.image_id ASC;

SELECT
person.person_id AS "ID",
person.first_name AS "First Name",
person.last_name AS "Last Name", 
contact_list.favorite AS Favorite,
CASE WHEN contact_list.favorite = "y" THEN 'This person was favorited!'
     ELSE 'This person was not favorited :('
     END AS FavoritedList,
FROM contact_list
FULL OUTER JOIN person_id ON contact_list.person_id = person.person._id
ORDER BY person.last_name ASC;

BACKUP DATABASE messaging
TO DISK = 'D:\backups\messaging.bak';

BACKUP DATABASE messaging
TO DISK = 'D:\backups\messaging.bak'
WITH DIFFERENTIAL;

```

