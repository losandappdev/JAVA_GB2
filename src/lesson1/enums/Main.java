package lesson1.enums;

public class Main {
    public static void main(String[] args) {
        Fruit fruit = Fruit.APPLE;
//        System.out.println(fruit);
        fruit = Fruit.CHERY;
        for (Fruit f:Fruit.values()) {
            System.out.print(f.ordinal()+" ");
            System.out.print(f.name()+" ");
            System.out.print(f.compareTo(Fruit.APPLE));
            System.out.print(" price= "+f.getPrice());
            System.out.println(" price= "+f.getRus());
        }



    }
}
