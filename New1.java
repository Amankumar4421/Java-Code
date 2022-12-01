import java.sql.*;
import java.util.*;
public class New1 {
    public static void main(String args[]) throws Exception {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver"); 
            String url = "jdbc:mysql://localhost:3306/d1";
            String username = "root";
            String password = "root";
            Connection con = DriverManager.getConnection(url, username, password);
            Statement st = con.createStatement();
            //st.execute("create table student(sid int(10),sname varchar(20),smarks int(10))");
            System.out.println("Table Created!");
            CallableStatement cs = con.prepareCall("{call cs(?,?,?)}");
            System.out.println("Enter 10 Student Details like id name marks");
            Scanner sc = new Scanner(System.in);
            for(int i=0;i<10;i++)
            {
                System.out.println("Student "+(i+1)+" Details :");
                int a= sc.nextInt();
                String s = sc.next();
                int b = sc.nextInt();
                cs.setInt(1,a);
                cs.setString(2,s);
                cs.setInt(3,b);
                cs.execute();
            }
            System.out.println("Done!\nThe Table is :");
            ResultSet rs = st.executeQuery("select * from student");
            while(rs.next())
            {
                System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getInt(3));
            }
            sc.close();
            con.close();
        }
        catch (Exception e) {
            System.out.println(e);
        }
    }
}