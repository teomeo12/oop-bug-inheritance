package dkit.sd2;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class AppTest
{

    @Test
    public void testConstructor()
    {
        BugEnum b = new BugEnum(5);
        int expected = 5;
        int actual = b.getPosition();
        assertEquals(expected, actual);
    }

    @Test
    public void testConstructor2()
    {
        BugEnum b = new BugEnum(5);
        Direction expected = Direction.RIGHT;
        Direction actual = b.getDirection();
        assertEquals(expected, actual);
    }

    @Test
    public void testMove()
    {
        BugEnum b = new BugEnum(5);
        b.move();
        int expected = 6;
        int actual = b.getPosition();
        assertEquals(expected, actual);
    }

    @Test
    public void testTurn()
    {
        BugEnum b = new BugEnum(5);
        b.turn();
        Direction expected = Direction.LEFT;
        Direction actual = b.getDirection();
        assertEquals(expected, actual);

    }

}
