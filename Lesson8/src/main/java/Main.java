import java.sql.SQLException;

public class Main {
    public static void main(String[] args) throws SQLException {

        DbHandler dbHandler = new DbHandler();
        Student student = new Student();
        student.name = "FFF";
        student.course = "4";
        student.faculty = "fac";

       // dbHandler.addStudent(student);
        System.out.println(dbHandler.findAllStudents());
        dbHandler.deleteStudent("FFF");

    }
}
