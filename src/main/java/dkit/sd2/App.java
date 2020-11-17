package dkit.sd2;

import java.util.ArrayList;

/**
 * Bug demo  - solution to  question P8.12 in Book
 * <p>
 * <p>
 * Exercise: Implement and test a "HoppingBug" class as follows:
 * <p>
 * HoppingBug inherits all the fields and methods from the Bug class.
 * Add a new field "hoppingDistance"
 * Appropriate constructor(s), getter(s) and setter(s)
 * Override move() to use hoppingDistance as opposed to unit of 1
 * Appropriate toString()
 */
public class App
{

    public static void main(String[] args)
    {
        System.out.println("\n*** BUG - App ***");
        App app = new App();
        app.start();
    }

    public void start()
    {
        Bug bugsy = new Bug(10);


//     Create ArrayList of Bug objects. Populate & display

        ArrayList<Bug> bugs = new ArrayList<>();

        bugs.add(bugsy);
        bugs.add(new Bug(5));
        bugs.add(new Bug(25));

        System.out.println("\nInitial Bugs in ArrayList");
        for (Bug bug : bugs)
        {
            System.out.println(bug);
        }


        //TODO #1 Create a single HoppingBug object. Test and correct your HoppingBug class


        //TODO #2 Create and populate an ArrayList of both Bug and HoppingBug objects



        //TODO #3 Display details of all bugs in arrayList (use toString())



        //TODO #4 Call move() for all bugs in arrayList. Display their new details (use toString())



        //TODO #5  Display id and hoppingDistance for all hoppingBugs in arrayList.



        //TODO #6 Implement and test .equals() for Bug objects



        //TODO #7 Implement and test .equals() for HoppingBug objects

    }


//    public static void displayBugs(ArrayList<Bug> bugs)
//    {
//        for (int i = 0; i < bugs.size(); i++)
//        {
//            System.out.println("Position of Bug#" + i + " = " + bugs.get(i).getPosition());
//        }
//    }

}



