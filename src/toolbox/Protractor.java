package toolbox;

import java.util.NoSuchElementException;

public class Protractor implements Tool{
    private final String protractor;

    public Protractor(){
        this.protractor = "Protractor";
    }

    @Override
    public String getName(){
        return this.protractor;
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
