package lesson1;

public class Dog implements ActionGo {
    @Override
    public void jump(int height) {
        System.out.println("jump" + ActionGo.height);
    }

    @Override
    public void superJump(int height) {

    }

    @Override
    public void swim(int dist) {

    }

    @Override
    public void run(int dist) {

    }
}
