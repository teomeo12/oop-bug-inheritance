package dkit.sd2;

public class NewClass extends HoppingBug{
    private String hui;

    public String getHui() {
        return hui;
    }

    public void setHui(String hui) {
        this.hui = hui;
    }

    public NewClass(int initialPosition, int hoppingDistance) {
        super(initialPosition, hoppingDistance);
    }
}
