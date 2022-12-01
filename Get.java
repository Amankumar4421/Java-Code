import java.sql.*;
public class Get {
    public static void main(String args[]) throws Exception {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver"); 
            String url = "jdbc:mysql://localhost:3306/d2";
            String username = "root";
            String password = "root";
            Connection con = DriverManager.getConnection(url, username, password);
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery("select * from emp");
            System.out.println("Name\t\tPassword\t\tGender");
            while(rs.next())
            {
                System.out.println(rs.getString(1)+"\t"+rs.getString(2)+"\t"+rs.getString(3));
            }
            System.out.println("Done!");
            con.close();
        }
        catch (Exception e) {
            System.out.println(e);
        }
    }
}