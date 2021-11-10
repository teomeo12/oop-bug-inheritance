package dkit.sd2;

public class HoppingBug extends Bug{
        private int hoppingDistance ;

    public HoppingBug(int initialPosition,int hoppingDistance) {
        super(initialPosition);
        this.hoppingDistance = hoppingDistance ;
    }

    public int getHoppingDistance() {
        return super.getPosition() + hoppingDistance;
    }

    public void setHoppingDistance(int hoppingDistance) {
        this.hoppingDistance = hoppingDistance;
    }

        @Override
    public void move()
    {
        if (getDirection() == Direction.RIGHT)
        {
           setPosition(getPosition() + hoppingDistance) ;
        }
        else
        {
            setPosition(getPosition() - hoppingDistance);
        }
    }


@Override
public String toString() {
    return super.toString()+ "HoppingBug{" +
            "hoppingDistance=" + hoppingDistance +
            '}';
}


}
