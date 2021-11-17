import org.sqlite.JDBC;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class DbHandler {
   public final String PATH_DB = "jdbc:sqlite:D:\\geekbrains\\java_core\\Lesson8\\src\\main\\resources\\University.db";

    Connection connection;
    public DbHandler() throws SQLException {
        DriverManager.registerDriver(new JDBC());
        connection =DriverManager.getConnection(PATH_DB);
    }

    public void addStudent(Student student) throws SQLException {
       try (PreparedStatement statement = connection.prepareStatement(
                "INSERT INTO Students ('name', 'course', 'faculty')" +
                        " VALUES(?, ?, ?)"
        )) {
            statement.setObject(1, student.name);
            statement.setObject(2, student.course);
            statement.setObject(3, student.faculty);
            statement.execute();
        }
        catch (SQLException exception) {
            exception.printStackTrace();
         }
    }

    public void deleteStudent(String name) {
        try (PreparedStatement statement = connection.prepareStatement(
                "DELETE FROM Students WHERE Name = ?"
        )) {
            statement.setObject(1, name);
            statement.execute();
        }
        catch (SQLException exception) {
            exception.printStackTrace();
        }

    }

    public List<Student> findAllStudents() throws SQLException {
        List<Student> students =new ArrayList<>();
        try (Statement statement = connection.createStatement()) {
            ResultSet resultSet = statement.executeQuery("SELECT * FROM Students");
            while (resultSet.next()) {
                Student student = new Student ();
                student.name = resultSet.getString("name");
                student.course = resultSet.getString("course");
                //student.course = resultSet.getString("course");
                student.faculty = resultSet.getString("faculty");
                students.add(student);
            }
        } catch (Exception ignored) {}

        return students;




    }


}
