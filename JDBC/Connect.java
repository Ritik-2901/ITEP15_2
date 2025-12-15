import java.sql.*;
class Connect{
    public static void main(String[] args) {
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/empdb","root","root");
            Statement s = con.createStatement();
            s.executeUpdate("Insert into employee (name,salary,age) values('Ritik',5000,22)");
            System.out.println("Record inserted succes...!");
            con.close();
        }catch( Exception e
        ){
            e.printStackTrace();
        }
        
    }
}
