package dkit.sd2;

/**
 * Second version of Bug - uses enum Direction as datatype of direction instance variable
 */
public class BugEnum
{


    private int position;
    private Direction direction;

    public BugEnum(int initialPosition)
    {
        this.position = initialPosition;
        this.direction = Direction.RIGHT;
    }

    public int getPosition()
    {
        return this.position;
    }

    public void turn()
    {
        if (this.direction == Direction.RIGHT)
        {
            this.direction = Direction.LEFT;
        }
        else
        {
            this.direction = Direction.RIGHT;
        }
    }

    /**
     * Move Bug object one place along line in direction it's facing
     * If R then plus, if L then minus
     */
    public void move()
    {
        if (this.direction == Direction.RIGHT)
        {
            this.position += 1;
        }
        else
        {
            this.position -= 1;
        }
    }

    public Direction getDirection()
    {
        return this.direction;
    }
}

