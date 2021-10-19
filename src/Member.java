public class Member {
    String name;
    int jumpHeight;
    boolean isFinished;

    public Member (String name, int jumpHeight) {
        this.name = name;
        this.jumpHeight = jumpHeight;
        isFinished=false;
    }

    public void info() {
        System.out.println(name+ " " + jumpHeight + " " + isFinished);

    }
}
