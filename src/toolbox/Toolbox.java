package toolbox;

public interface Toolbox {
    void add(Tool tool);
    Tool  get(String toolName) throws CloneNotSupportedException;
}
