package lesson1.inner;

public class Main {
    public static void main(String[] args) {
        Outer.Inner inner = new Outer().new Inner();
        inner.info();

        Outer outer = new Outer();
        outer.someThing();

    }
}
