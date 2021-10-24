package Lesson1;

public class Main {
    public static void main(String[] args) {
        Member member1 = new Member("Vasiliy", 150);
        Member member2 = new Member("Misha", 180);
        Member member3 = new Member("Kolja", 130);
        Member member4 = new Member("Petr", 120);
        Team team = new Team("Brigada",member1,member2,member3,member4);
        Course course = new Course (115, 140, 129);
        course.finishCours(team);

        team.printInfoAboutMembers();
        System.out.println();
        team.printInfoAboutMembersWhichFinishedCourse();
    }

}
