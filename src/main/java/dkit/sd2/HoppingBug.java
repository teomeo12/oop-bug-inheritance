package dkit.sd2;

import java.util.Objects;

public class HoppingBug extends Bug{
        private int hoppingDistance ;

    public HoppingBug(int initialPosition,int hoppingDistance) {
        super(initialPosition);
        this.hoppingDistance = hoppingDistance ;
    }

    public int getHoppingDistance() {
       // return super.getPosition() + hoppingDistance;
        return this.hoppingDistance;
    }

    public void setHoppingDistance(int hoppingDistance) {
        this.hoppingDistance = hoppingDistance;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;
        if (o == null || getClass() != o.getClass())
            return false;
        if (!super.equals(o))
            return false;
        HoppingBug hoppingBug = (HoppingBug) o;
        return  this.hoppingDistance == hoppingBug.hoppingDistance;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), hoppingDistance);
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

//
//    @Override
//    public boolean equals(Object o) {
//        if (this == o) return true;
//        if (!(o instanceof HopingBug)) return false;
//        HopingBug hopingBug = (HopingBug) o;
//        return getHoppingDistance() == hopingBug.getHoppingDistance();
//    }
//
//    @Override
//    public int hashCode() {
//        return Objects.hash(getHoppingDistance());
//    }
//
//    @Override
//    public void move(){
//        if (getDirection() == Direction.RIGHT) //super.getDirection -- dont need super always!
//        {
//            setPosition(getPosition()+hoppingDistance);
//
//        }
//        else
//        {
//            setPosition(getPosition()-hoppingDistance);
//        }
//    }
//
//    @Override
//    public String toString(){
//        return super.toString()+" { hoppingDistance : "+this.hoppingDistance +" }";
//    }


}
