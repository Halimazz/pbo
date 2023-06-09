/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author D2A_44
 */
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
public class koneksiDB {
    public static Connection conn;
    public static Statement  stm;
    public String usr;
    
    public koneksiDB(String usr){
        try {
            conn=DriverManager.getConnection("jdbc:mysql://192.168.10.253/a112113642","a112113642","polke001");
            stm=conn.createStatement();
            JOptionPane.showMessageDialog(null, "koneksi berhasil");
        } catch (SQLException ex) {
            Logger.getLogger(koneksiDB.class.getName()).log(Level.SEVERE, null, ex);
        }
    
    }
    public static Connection getConn(){
    
        return conn;
    
    }
    
    public static void main(String[] args){
        koneksiDB konn = new koneksiDB("a112113642");
            }
}
