package dkit.sd2;

import java.util.ArrayList;

/**
 * Bug demo  - solution to  question P8.12 in Book
 *
 * Shows two different ways of representing the "direction" of Bug
 *      -  boolean variable (Right = true, Left = false) : used in Bug
 *      -  enumeration type called Direction             : used in BugEnum
 *
 *  ArrayList of object REFERENCES is also demonstrated
 *
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

//        Bug bugsy = new Bug(10);
//        System.out.println("Position :" + bugsy.getPosition());
//        bugsy.move();
//        bugsy.move();
//        System.out.println("Position :" + bugsy.getPosition());
//        bugsy.turn();
//        bugsy.move();
//        System.out.println("Position :" + bugsy.getPosition());
//        bugsy.move();
//        bugsy.move();
//        System.out.println("Position :" + bugsy.getPosition());
//
//// #1      Create ArrayList of Bug objects. Populate it & display their positions
//
////
////
//        ArrayList<Bug> bugs = new ArrayList<>();
//
//        bugs.add(bugsy);
//        bugs.add(bugsy);    // Add two bugs with same data, i.e. two bugsy objects at same location
//        bugs.add(new Bug(5));
//        bugs.add(new Bug(25));
//
//
//// #2      Display Bug positions from ArrayList
////
//
//        System.out.println("\nInitial Bug positions in ArrayList");
//        for (int i = 0; i < bugs.size(); i++)
//        {
//            System.out.println("Position of Bug#" + i + " = " + bugs.get(i).getPosition());
//        }
//
////        Change location of first bug in ArrayList to new location by calling move()
////
//        bugs.get(0).move();
////
////
////       Display positions
//        System.out.println("\nModified AL");
//        for (int i = 0; i < bugs.size(); i++)
//        {
//            System.out.println("Position of Bug#" + i + " = " + bugs.get(i).getPosition());
//        }
////
////
////      Issue: We added a REFERENCE to the Bug object to the ArrayList.  SAME reference-> same Bug object
////
//
//        System.out.println("\nExamine Memory address refs");
//        for (int i = 0; i < bugs.size(); i++)
//        {
//            System.out.println("Bug#:" + i + " " + bugs.get(i));   // Why does this show us memory address reference?
//        }
//
//        System.out.println("Bugsy address:" + bugsy);


        System.out.println("Using BugEnum");
        BugEnum bugsy = new BugEnum(10);
        System.out.println("Position :" + bugsy.getPosition());
        bugsy.move();
        bugsy.move();
        System.out.println("Position :" + bugsy.getPosition());
        bugsy.turn();
        bugsy.move();
        System.out.println("Position :" + bugsy.getPosition());
        bugsy.move();
        bugsy.move();
        System.out.println("Position :" + bugsy.getPosition());

// #1      Create ArrayList of Bug objects. Populate it & display their positions

//
//
        ArrayList<BugEnum> bugs = new ArrayList<>();

        bugs.add(bugsy);
        bugs.add(bugsy);    // Add two bugs with same data, i.e. two bugsy objects at same location
        bugs.add(new BugEnum(5));
        bugs.add(new BugEnum(25));


// #2      Display Bug positions from ArrayList
//

        System.out.println("\nInitial Bug positions in ArrayList");
        for (int i = 0; i < bugs.size(); i++)
        {
            System.out.println("Position of Bug#" + i + " = " + bugs.get(i).getPosition());
        }

//        Change location of first bug in ArrayList to new location by calling move()
//
        bugs.get(0).move();
//
//
//       Display positions
        System.out.println("\nModified AL");
        for (int i = 0; i < bugs.size(); i++)
        {
            System.out.println("Position of Bug#" + i + " = " + bugs.get(i).getPosition());
        }
//
//
//      ISSUE: We added a REFERENCE to the Bug object to the ArrayList.  SAME reference-> same Bug object
//

        System.out.println("\nExamine Memory address refs");
        for (int i = 0; i < bugs.size(); i++)
        {
            System.out.println("Bug#:" + i + " " + bugs.get(i));   // Why does this show us memory address reference?
        }

        System.out.println("Bugsy address:" + bugsy);

    }


//    public static void displayBugs(ArrayList<BugEnum> bugs)
//    {
//        for (int i = 0; i < bugs.size(); i++)
//        {
//            System.out.println("Position of Bug#" + i + " = " + bugs.get(i).getPosition());
//        }
//    }

}



