package lesson1.marathon;

import lesson1.marathon.competitors.Cat;
import lesson1.marathon.competitors.Competitor;
import lesson1.marathon.competitors.Dog;
import lesson1.marathon.competitors.Human;
import lesson1.marathon.obstacles.Cross;
import lesson1.marathon.obstacles.Obstacle;
import lesson1.marathon.obstacles.Wall;
import lesson1.marathon.obstacles.Water;

public class Main {
    public static void main(String[] args) {
        Competitor[] competitors={new Human("Bob"),
        new Cat("Vaska"), new Dog("Tuzik")};
        Obstacle[] obstacles = {new Cross(80), new Wall(2), new Water(10)};

        for (Competitor c:competitors) {
            for (Obstacle o:obstacles) {
                o.doIt(c);
                if(!c.isOnDistance()){
                    break;
                }
            }
        }

        for (Competitor c:competitors) {
            c.info();
        }

    }
}
