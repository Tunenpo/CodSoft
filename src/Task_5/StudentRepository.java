package Task_5;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
public class StudentRepository {
    Connection connection = null;
    public void Create(Student student){
        String url = "jdbc:mysql://127.0.0.1:3306/student_course_registration_system";
        String username = "root";
        String password = "Tunenpoo1994b@";
        try{
            connection = DriverManager.getConnection(url, username, password);
            Statement statement = connection.createStatement();

            statement.execute("INSERT INTO students(Id, name, courses) VALUES(student.Id, student.name)");

        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally{
            try{
                if( connection != null ){
                    connection.close();
                }
            } catch (SQLException exception){
                System.out.println(exception.getMessage());
            }
        }
    }
}
