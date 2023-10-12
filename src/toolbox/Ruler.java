package toolbox;

import java.util.NoSuchElementException;

public class Ruler implements Tool{
    private final String ruler;

    public Ruler(){
        this.ruler = "Ruler";
    }

    @Override
    public String getName() {
        return this.ruler;
    }

    @Override
    public void use() {
        System.out.println("Using " + this.getName());
    }

    @Override
    public Object clone() throws NoSuchElementException {
        Object clone = null;
        try {
            clone = super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return clone;
    }
}
