package toolbox;

import java.util.NoSuchElementException;

public class Pencil implements Tool{
    private final String pencil;

    public Pencil(){
        this.pencil = "Pencil";
    }

    @Override
    public String getName(){
        return this.pencil;
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
