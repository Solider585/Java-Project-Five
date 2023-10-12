package toolbox;

import java.util.HashMap;
import java.util.Map;

public class StoreTools implements Toolbox {
    private final static Map<String, Tool> toolMap = new HashMap<>();

    public void add(Tool tool){
        toolMap.put(tool.getName(), tool);
        System.out.println(tool.getName()  + " is added to the tool box");
    }

    public Tool get(String toolName) throws CloneNotSupportedException {     
//        System.out.println((Tool) toolMap.get(toolName));
        if(toolMap.get(toolName) == null){
            throw new CloneNotSupportedException("Tool class does not exist for this program");
        }
        return (Tool) toolMap.get(toolName).clone();
    }
}
