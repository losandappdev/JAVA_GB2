package lesson1.marathon.competitors;

import javax.naming.Name;

import lesson1.marathon.obstacles.Obstacle;

public class Team {
      String teamName;
      Competitor[] teamMembers;
/** Конструктор для коменды. В конструкторе можно сразу всех участников указывать
 * !!!хотелось бы все таки узнать как сделать чтобы в команде было определенное количество участников!!!
 * ку да ни поставь размер массива все время выдает ошибку*/
    public Team(String teamName, Competitor... teamMembers) {
        this.teamName = teamName;
        this.teamMembers = teamMembers;
    }

    public Competitor[] getTeamMembers() {
        return teamMembers;
    }

    /** Метод для вывода информации о членах команды, прошедших дистанцию*/
    public void teamResult(){
        for (Competitor c : teamMembers) {
            if (c.isOnDistance() == true) c.info();
        }

    }

//       @Override
//    public void run(int dist) {
//        for (Competitor c : teamMembers) {
//            c.run(dist);
//        }
//    }
//
//    @Override
//    public void swim (int dist) {
//            for (Competitor c:teamMembers) {
//                c.swim(dist);
//            }
//    }
//
//    @Override
//    public void jump(int height) {
//            for (Competitor c : teamMembers) {
//                c.jump(height);
//            }
//    }
//
//    @Override
//    public boolean isOnDistance() {
//
//        for (Competitor c : teamMembers) {
//            if (c.isOnDistance() == false) return false;
//            }
//        return true;
//    }
    /**Метод вывода информации обо всех членах команды.*/

    public void info() {
        for (Competitor c:teamMembers) {
            c.info();
        }
    }
}
