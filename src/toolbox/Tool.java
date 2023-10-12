package toolbox;

public interface Tool extends Cloneable {
    String getName();
    void use();
    Object clone();
}
