package lesson1;

public interface CanJump {
    void jump(int height);
    default void superJump(int height){
        System.out.println("jump");
    };
}
