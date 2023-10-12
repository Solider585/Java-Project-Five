package toolbox;

import java.util.NoSuchElementException;

public class Eraser implements Tool {
    private final String eraser;

    public Eraser(){
        this.eraser = "Eraser";
    }

    @Override
    public String getName(){
        return this.eraser;
    }

    @Override
    public void use(){
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
