package lesson1.marathon.obstacles;

import lesson1.marathon.competitors.Competitor;
import lesson1.marathon.competitors.Team;

public class Course {
    /**Массив препятствий*/
    Obstacle[] course ;

    public Course(Obstacle[] course) {
        this.course = course;
    }

    public void start(Team team) {
        for (Competitor c:team.getTeamMembers()) {
            for (Obstacle o:course) {
                o.doIt(c);
                if(!c.isOnDistance()){
                    break;
                }
            }
        }
    }
}
