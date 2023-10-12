package toolbox;

import java.util.NoSuchElementException;

public class Paper implements Tool{
    private final String paper;

    public Paper(){
        this.paper = "Paper";
    }

    @Override
    public String getName() {
        return this.paper;
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
