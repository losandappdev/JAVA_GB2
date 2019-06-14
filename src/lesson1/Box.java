package lesson1;

public class Box {
    private String color;
    protected String name;
    private int weight;

    public Box() {

    }

    public void setWeight(int weight) {
        if (weight >= 0) {
            this.weight = weight;
        } else {
            System.out.println("bad weight");
        }
    }

    public Box(String color, String name, int weight) {
//        this.color = color;
//        this.name = name;
        this(color, name);
        this.weight = weight;
    }

    public Box(String color, String name) {
        this.color = color;
        this.name = name;
    }

    public Box(String color) {
        this.color = color;
    }

    public void info() {
        System.out.println(color + " " + name + " " + weight);
    }

    void someThing(Tools tools) {
        tools.infoToolsAndBox(this);
    }


}

class SuperBox extends Box {
    int height;

    public SuperBox(String color, String name, int weight, int height) {
        super(color, name, weight);
        this.height = height;
    }
}

class BigBox extends SuperBox {
    int age;

    public BigBox(String color, String name, int weight, int height, int age) {
        super(color, name, weight, height);
        this.age = age;
        super.info();
    }
}
