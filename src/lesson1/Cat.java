package lesson1;

public class Cat implements CanRun,CanJump{




    @Override
    public void run(int dist) {
        System.out.println("run...");
    }

    @Override
    public void jump(int height) {

    }
}
