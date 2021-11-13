package Lesson1;

public class Course {
    int [] obstacles;



    public Course(int obstacle1, int obstacle2, int obstacle3) {
        obstacles = new int[] {obstacle1,obstacle2,obstacle3};
    }

    public void finishCours (Team team) {
        for (Member member: team.members) {
            for (int obstacle: obstacles) {
                if (member.jumpHeight>=obstacle){
                    System.out.println(member.name + " finished");
                    member.isFinished = true;
                }
                else {
                    member.isFinished = false;
                }
            }
        }
    }

}
