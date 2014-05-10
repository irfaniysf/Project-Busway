/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package busway;
import java.sql.*;
import javax.swing.JOptionPane;
/**
 *
 * @author Irfani Yusuf
 */
public class Koneksi{
    private String user = "root";
    private String passwd = "";
    private Statement stmt = null;
    private ResultSet rs = null;
    private Connection con = null;
    //Constructor
    public Koneksi(){
       try {
            Class.forName("org.gjt.mm.mysql.Driver");
        }catch(Exception e) {
            JOptionPane.showMessageDialog(null,""+e.getMessage(),"JDBC Driver Error",JOptionPane.WARNING_MESSAGE);
        }
        try {
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/busway",user,passwd);
            stmt = con.createStatement();
             //JOptionPane.showMessageDialog(null,"berhasil terkoneksi");
        }catch (Exception e) {
            JOptionPane.showMessageDialog(null,""+e.getMessage(),"Connection Error",JOptionPane.WARNING_MESSAGE);
        }
    }
    public ResultSet getData(String SQLString){
        try {
            rs = stmt.executeQuery(SQLString);
        }catch (Exception e) {
            JOptionPane.showMessageDialog(null,"Error :"+e.getMessage(),"Communication Error",JOptionPane.WARNING_MESSAGE);
        }
        return rs;
    }

    public void query(String SQLString) {
        try {
            stmt.executeUpdate(SQLString);
        }catch (Exception e) {
            JOptionPane.showMessageDialog(null,"error:"+e.getMessage(),"Communication Error",JOptionPane.WARNING_MESSAGE);
        }
    }
}
