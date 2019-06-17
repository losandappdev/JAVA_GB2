package lesson1.marathon.competitors;

import javax.naming.Name;

import lesson1.marathon.obstacles.Obstacle;

public class Team implements Competitor{
     public String teamName;
     public Competitor[] teamMembers;
/** Конструктор для коменды. В конструкторе можно сразу всех участников указывать*/
    public Team(String teamName, Competitor[] competitor) {
        this.teamName = teamName;
        this.teamMembers  = new Competitor[4];
        for (int i = 0; i <4 ; i++) {
            this.teamMembers[i] = competitor[i];
        }
    }


/** Метод для вывода информации о членах команды, прошедших дистанцию*/
    public void teamResult(){
        for (Competitor c : teamMembers) {
            if (c.isOnDistance() == true) c.info();
        }

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
    /**Метод вывода информации обо всех членах команды.*/
     @Override
    public void info() {
        for (Competitor c:teamMembers) {
            c.info();
        }
    }
}
