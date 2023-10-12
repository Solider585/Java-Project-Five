package toolbox;

public class ToolTest {

    public static void main(String[] args) throws CloneNotSupportedException {
	// write your code here
        Toolbox tools = new StoreTools();
//        StoreTools toolBox = new StoreTools();
//        StoreTools.getTool("Eraser").getName();
        tools.add(new Eraser());
        tools.add(new Pencil());
        tools.add(new Protractor());
        tools.add(new Ruler());
        tools.add(new Paper());
//        tools.add(new Screw());

        try{
            tools.get("Eraser").use();
            tools.get("Pencil").use();
            tools.get("Protractor").use();
            tools.get("Ruler").use();
            tools.get("Paper").use();
            tools.get("Screw").use();
        }catch(CloneNotSupportedException e){
            System.out.println("Tool is not in the tool in the toolbox");
            throw e;
        }

    }
}
