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

        System.out.println("\n**************Initial Bugs in ArrayList*************");
        for (Bug bug : bugs)
        {
            System.out.println(bug);
        }

        //TODO #1 Create a single HoppingBug object. Test and correct your HoppingBug class
        System.out.println("\n*********TODO 1*****Create a single HoppingBug object*************");
        HoppingBug h1 = new HoppingBug(11,12);
        System.out.println(h1);
        h1.setHoppingDistance(7);
        System.out.println(h1);
        //TODO #2 Create and populate an ArrayList of both Bug and HoppingBug objects
        System.out.println("\n*********TODO 2*****Bug and HoppingBug objects*************");
        ArrayList<Bug> allBugs = new ArrayList<>();

        Bug bug1 = new Bug(2);
        Bug bug2 = new Bug(4);
        Bug bug3 = new Bug(4);

        HoppingBug hopBug1 = new HoppingBug(2,12);
        HoppingBug hopBug2 = new HoppingBug(2,13);
        HoppingBug hopBug3 = new HoppingBug(2,13);

        allBugs.add(h1);
        allBugs.add(bug1);
        allBugs.add(bug2);
        allBugs.add(bug3);
        allBugs.add(hopBug1);
        allBugs.add(hopBug2);
        allBugs.add(hopBug3);

        //TODO #3 Display details of all bugs in arrayList (use toString())
        System.out.println("\n***********TODO 3++++Display details of all bugs***************");
        System.out.println();
        System.out.println("All bugs: ");
        for(Bug bug: allBugs){
            System.out.println(bug.toString());
            System.out.println(bug.hashCode());
        }
        //TODO #4 Call move() for all bugs in arrayList. Display their new details (use toString())
        System.out.println("\n***********TODO 4++++Call move() for all bugs in arrayList***************");
        for(Bug bug: allBugs){
            bug.move();
        }

        System.out.println("All bugs After move: ");
        for(Bug bug: allBugs){
            System.out.println(bug.toString());
        }

        //TODO #5  Display id and hoppingDistance for all hoppingBugs in arrayList.
        System.out.println("\n***********TODO 5***Display id and hoppingDistance***************");
        System.out.println("id & Hopdist ");
        for(Bug bug: allBugs){
            if(bug instanceof HoppingBug){
                System.out.println(bug.getId()+" & "+((HoppingBug) bug).getHoppingDistance());
            }
            else{
                System.out.println(bug.getId()+" & "+1);
            }
        }

        //TODO #6 Implement and test .equals() for Bug objects
        System.out.println("\n***********TODO 6++++comparing two objects***************");
        System.out.println("Comparing bug1: "+bug1+"\n      and bug2: " +bug2);
        System.out.println("**************Result*******************");
        System.out.println(bug1.equals(bug2));
        System.out.println("\nComparing bug2: "+bug2+"\n      and bug3: " +bug3);
        System.out.println("**************Result*******************");
        System.out.println(bug2.equals(bug3));

        //TODO #7 Implement and test .equals() for HoppingBug objects
        System.out.println("\n***********TODO 7+++Implement and test .equals() for HoppingBug***************");
        System.out.println("Comparing hopBug1: "+hopBug1+"\n      and hopBug2: " +hopBug2);
        System.out.println("**************Result*******************");
        System.out.println(hopBug1.equals(hopBug2));
        System.out.println("\nComparing hopBug2: "+hopBug2+"\n     and hopBug3: " +hopBug3);
        System.out.println("**************Result*******************");
        System.out.println(hopBug1.equals(hopBug3));

    }
}

//    git add .
//    git -commit -m "updateclasses with statement"
//    git push -u origin master





