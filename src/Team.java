import java.sql.Array;
import java.util.Arrays;

public class Team {
    String nameTeam;
    String [] participant = {"part1", "part2", "part3", "part4"};

    public void info() {
        System.out.println("Team:" + nameTeam + ": " + Arrays.toString(participant));
    }
}
