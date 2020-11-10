package dkit.sd2;

/**
 * First version of Bug - uses boolean as datatype of direction instance variable  (true=R false =L)
 */
public class Bug
{

    private int position;
    private boolean direction;

    public Bug(int initialPosition)
    {
        this.position = initialPosition;
        this.direction = true;
    }

    public int getPosition()
    {
        return this.position;
    }

    public boolean getDirection()
    {
        return direction;
    }

    /**
     * Turn Bug facing the opposite direction
     */
    public void turn()
    {
        this.direction = !this.direction;       //oposite
    }

    /**
     * Move Bug object one place along line in direction it's facing.
     * If R then plus, if L then minus
     */
    public void move()
    {
        if (this.direction)
        {
            this.position += 1;
        }
        else
        {
            this.position -= 1;
        }
    }


}

