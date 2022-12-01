import java.sql.*;
public class New2 {
    public static void main(String args[]) throws Exception {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            String url = "jdbc:mysql://localhost:3306/d1";
            String username = "root";
            String password = "root";
            Connection con = DriverManager.getConnection(url, username, password);
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery("select * from student");
            System.out.println("SID\tSNAME\tSMARKS");
            while(rs.next())
            {
                System.out.println(rs.getInt(1)+"\t"+rs.getString(2)+"\t"+rs.getInt(3));
            }
            System.out.println("Done!");
            con.close();
        }
        catch (Exception e) {
            System.out.println(e);
        }
    }
}