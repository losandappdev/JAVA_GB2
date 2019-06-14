package lesson1.inner;

public class Outer {
    private  int outX = 8;

    class Inner {
        private int inX = 10;

        public void info(){
            System.out.println(outX);
            System.out.println(inX);
        }
    }

    static class StatInner{
        static int statX=999;
        public void info(){
            System.out.println();
        }
    }

    public void someThing(){
        int someX=7;

        class LocalClass{
            public void info(){
                System.out.println(someX);
                System.out.println(outX);
            }
        }

        new LocalClass().info();
        new Inner().info();
    }

}
