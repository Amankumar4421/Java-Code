import java.sql.SQLException;

public class throwskey {
    static void dis() throws SQLException{
        System.out.println("dis method");
    }
    public static void main(String[] args) throws SQLException{
        dis();
        System.out.println("Amankku");
    }
}
