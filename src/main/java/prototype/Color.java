package prototype;

public abstract class Color implements Cloneable  {

    protected String color;

    abstract void paint();

    public Object clone() {
        Object clone = null;

        try {
            clone = super.clone();

        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }

        return clone;
    }
}
