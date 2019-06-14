package lesson1;

public class Tools {
    private String tools;

    public Tools(String tools) {
        this.tools = tools;
    }

    void infoToolsAndBox(Box box){
        box.info();
        System.out.println(tools);
    }
}
