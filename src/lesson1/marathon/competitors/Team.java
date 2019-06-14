package lesson1.marathon.competitors;

import lesson1.marathon.obstacles.Obstacle;

public class Team implements Competitor{
    private String teamName;
    private Team[] teamMembers;



    public void teamResult(){
        for (Competitor c : teamMembers) {
            if (c.isOnDistance() == true) c.info();
        }
        
    }

    public Team(String teamName, Competitor[] teamMembers) {
        this.teamName = teamName;
        this.teamMembers = new Team[4];
    }

    @Override
    public void run(int dist) {
        for (Competitor c : teamMembers) {
            c.run(dist);
        }
    }

    @Override
    public void swim (int dist) {
            for (Competitor c:teamMembers) {
                c.swim(dist);
            }
    }

    @Override
    public void jump(int height) {
            for (Competitor c : teamMembers) {
                c.jump(height);
            }
    }

    @Override
    public boolean isOnDistance() {

        for (Competitor c : teamMembers) {
            if (c.isOnDistance() == false) return false;
            }
        return true;
    }
    @Override
    public void info() {
        for (Competitor c:teamMembers) {
            c.info();
        }
    }
}
