package lesson1.marathon.obstacles;

import lesson1.marathon.competitors.Competitor;
import lesson1.marathon.competitors.Team;

public class Course extends Obstacle {
    /**Массив препятствий*/
    Obstacle[] course = new Obstacle[]{new Cross(80), new Wall(2), new Water(10)};


    @Override
    public void doIt(Competitor competitor) {


        }
    }
}
