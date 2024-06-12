import java.sql.*;

public class Main {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {


     /*
     1) import package
     2) load & register
     3) create connection
     4) create statement
     5) execute statement
     6) process the result
     7) close connection
      */

        //data from user

        int sid = 7;
        String sname = "jasmine";
        int marks =80;

//        String sql = "insert into student values (" + sid +", "+marks+", '"+sname+ "')"; //due to SQL Injection attack................ avoid it

        String sql = "insert into student values (?,?,?)";

        String url = "jdbc:postgresql://localhost:5432/demo";
        String userName="postgres";
        String password="root";


//String sql = "delete from student where sid=6";
//        String sql = "update student set sname='Max' where sid=6";
//        String sql = "insert into student values (6,18,'john')";
//
        Class.forName("org.postgresql.Driver");

        Connection con = DriverManager.getConnection(url,userName,password);

        System.out.println("Connection Established.....");

        PreparedStatement statement = con.prepareStatement(sql);
        statement.setInt(1,sid);
        statement.setInt(2,marks);
        statement.setString(3,sname);

        statement.execute();

        //Delete element
// Update element in db
//        statement.execute(sql);
//

        // insert element in DB

//boolean status = statement.execute(sql);

//        System.out.println(status);





//    ResultSet resultSet= statement.executeQuery("SELECT * from student");

    //get element by id

//resultSet.next();
//String name = resultSet.getString("sname");
//
//        System.out.println("Student name is: " +name);

        //Fetch all elements
//        while (resultSet.next()){
//            System.out.print(resultSet.getInt(1)+" - ");
//            System.out.print(resultSet.getInt(2)+" - ");
//            System.out.print(resultSet.getString(3));
//            System.out.println();
//
//        }

        con.close();

        System.out.println("Connection Closed.....");


    }
}