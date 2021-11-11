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
        HoppingBug h1 = new HoppingBug(11,12);
        System.out.println(h1);
        h1.setHoppingDistance(7);
        System.out.println(h1);
        //TODO #2 Create and populate an ArrayList of both Bug and HoppingBug objects
        ArrayList<Bug> allBugs = new ArrayList<>();

        Bug bug1 = new Bug(2);
        Bug bug2 = new Bug(2);

        HoppingBug hopBug1 = new HoppingBug(2,12);
        HoppingBug hopBug2 = new HoppingBug(13,4);

        allBugs.add(h1);
        System.out.println("comparing two objects");
        System.out.println(hopBug1.equals(hopBug2));
        System.out.println(hopBug1 == (hopBug2));



        //TODO #3 Display details of all bugs in arrayList (use toString())
        System.out.println();
        System.out.println("All bugs: ");
        for(Bug b: allBugs){
            System.out.println(b.toString());
        }


        //TODO #4 Call move() for all bugs in arrayList. Display their new details (use toString())
        System.out.println("After moving all by 5");
        for(Bug b: allBugs){
            b.move();
        }

        System.out.println("All bugs After move: ");
        for(Bug b: allBugs){
            System.out.println(b.toString());
        }

        //TODO #5  Display id and hoppingDistance for all hoppingBugs in arrayList.
        System.out.println("id & Hopdist ");
        for(Bug b: allBugs){
            if(b instanceof HoppingBug){
                System.out.println(b.getId()+" & "+((HoppingBug) b).getHoppingDistance());
            }
            else{
                System.out.println(b.getId()+" & "+1);
            }
        }


        //TODO #6 Implement and test .equals() for Bug objects
        System.out.println(bug1.equals(bug2));


        //TODO #7 Implement and test .equals() for HoppingBug objects
        for(Bug b: allBugs){
            if(b instanceof HoppingBug){
                System.out.println(hopBug1.equals(hopBug2));
            }
        }

    }


//    public static void displayBugs(ArrayList<Bug> bugs)
//    {
//        for (int i = 0; i < bugs.size(); i++)
//        {
//            System.out.println("Position of Bug#" + i + " = " + bugs.get(i).getPosition());
//        }
//    }

}



