import java.sql.Array;
import java.util.Arrays;

public class Team {
    String name;
    Member [] members;


    public Team(String name, Member member1, Member member2, Member member3, Member member4) {
        members = new Member [] {member1,member2,member3,member4};
        this.name=name;
    }

    public void printInfoAboutMembers () {
        for (Member member: members) {
            member.info();
        }

    }
    public void printInfoAboutMembersWhichFinishedCourse() {
        for (Member member: members) {
            if (member.isFinished) {
                member.info();
            }
            member.info();
        }

    }



}
