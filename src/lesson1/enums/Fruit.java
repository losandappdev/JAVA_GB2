package lesson1.enums;

public enum Fruit {
    ORANGE(5,"Апельсин"), APPLE(7,"Яблоко"), BANANA(2), CHERY(7);
    private int price;
    private String rus;

    Fruit(int price) {
        this.price = price;
    }

    Fruit() {
        this.price = price;
    }

    Fruit(int price, String rus) {
        this.price = price;
        this.rus = rus;
    }

    public int getPrice() {
        return price;
    }

    public String getRus() {
        return rus;
    }
}
