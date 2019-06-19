package lesson1.marathon;

import lesson1.marathon.competitors.Cat;
import lesson1.marathon.competitors.Competitor;
import lesson1.marathon.competitors.Dog;
import lesson1.marathon.competitors.Human;
import lesson1.marathon.competitors.Team;
import lesson1.marathon.obstacles.Course;
import lesson1.marathon.obstacles.Cross;
import lesson1.marathon.obstacles.Obstacle;
import lesson1.marathon.obstacles.Wall;
import lesson1.marathon.obstacles.Water;

public class Main {
    public static void main(String[] args) {
//        Competitor[] competitors={new Human("Bob"),
//        new Cat("Vaska"), new Dog("Tuzik")};
        Obstacle[] obstacles = new Obstacle[]{new Cross(380), new Wall(2), new Water(10)};

        Course course = new Course(obstacles);
       Team team = new Team("teamName",new Human("bob"),
               new Human("ivan"), new Cat("Vaska"), new Dog("Tuzik"));

//        team.info();
        course.start(team);
        team.teamResult();


//        for (Competitor c:competitors) {
//            for (Obstacle o:obstacles) {
//                o.doIt(c);
//                if(!c.isOnDistance()){
//                    break;
//                }
//            }
//        }
//
//        for (Competitor c:competitors) {
//            c.info();
//        }

    }
}
