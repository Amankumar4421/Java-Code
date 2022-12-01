import java.sql.*;
import javax.swing.*;
import java.awt.event.*;
public class New extends JFrame implements ActionListener{
    String gender,t1value,t2value;
    JTextField t;
    JTextField tt;
    JRadioButton r1,r2;
    PreparedStatement ps;
    New(){
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setTitle("SignUp");
        setSize(500,300);
        JButton b=new JButton("SignUp");  
        b.setBounds(150,200,95,30);  
        add(b); 
        b.addActionListener(this);
        JLabel l0=new JLabel("Login ");  
        l0.setBounds(150,10,100,30);
        add(l0);
        JLabel l1=new JLabel("Name : ");  
        l1.setBounds(80,60,100,20);
        add(l1);
        t = new JTextField();
        t.setBounds(160,60,250,30);
        add(t); 
        JLabel l3=new JLabel("Password : ");  
        l3.setBounds(80,110,100,20);
        add(l3);
        tt = new JTextField();
        tt.setBounds(160,110,250,30);
        add(tt); 
        JLabel l2=new JLabel("Gender : ");  
        l2.setBounds(80,150, 100,30); 
        add(l2);
        r1=new JRadioButton(" Male");    
        r2=new JRadioButton(" Female");    
        r1.setBounds(160,150,75,30);    
        r2.setBounds(250,150,100,30);
        ButtonGroup bg=new ButtonGroup();    
        bg.add(r1);
        bg.add(r2);    
        add(r1);
        add(r2);
        setLayout(null);  
        setVisible(true);
        try{
            Class.forName("com.mysql.cj.jdbc.Driver"); 
            String url = "jdbc:mysql://localhost:3306/d2";
            String username = "root";
            String password = "root";
            Connection con = DriverManager.getConnection(url, username, password);
            // Statement st = con.createStatement();
            // st.execute("create table emp(ename varchar(20),pass varchar(20),gender varchar(20))");
            ps = con.prepareStatement("insert into emp values(?,?,?)");
        }
        catch(Exception e){
            System.out.println(e);
        }
    }
    public static void main(String[] args) throws SQLException,ClassNotFoundException{
        new New();
    }
    public void actionPerformed(ActionEvent e) {
        t1value = t.getText();
        t2value = tt.getText();
        if(r1.isSelected())
        {
            gender = "Male";
        }
        else if(r2.isSelected())
        {
            gender = "Female";
        }
        else
        {
            gender = "Other";
        }
        try{
            ps.setString(1,t1value);
            ps.setString(2,t2value);
            ps.setString(3,gender);
            ps.execute();
        }
        catch(Exception ex){
            System.out.println(ex);
        }
    }
}