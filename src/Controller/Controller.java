/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;
import Model.evidencijaModel;
import java.sql.*;
import java.util.ArrayList;
import javax.swing.JOptionPane;
/**
 *
 * @author Spuda
 */
public class Controller  {
    //dodavanje turista u bazu podataka
    public static void evidentiranjeTurista(String imeTurista, String prezimeTurista, String oibTurista, String mailTurista, String mobTurista) throws SQLException{
        Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/rezervacijalucica","root","");
        Statement stmt = conn.createStatement();
        String sql =  "INSERT INTO turist(imeTurista,prezimeTurista,oibTurista,mailTurista,mobTurista) VALUES('"+imeTurista+"','"+prezimeTurista+"','"+oibTurista+"','"+mailTurista+"','"+mobTurista+"')";
        stmt.executeUpdate(sql);
    }
    //ispis turista u tablicu
    public static ArrayList<evidencijaModel> turistList(){
        ArrayList<evidencijaModel> turistList = new ArrayList<>();
        try {
        Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/rezervacijalucica","root","");
        String sql = "Select * from turist";
        Statement stmt = conn.createStatement();
        ResultSet rs = stmt.executeQuery(sql);
        evidencijaModel turist;
        while (rs.next()){
            turist = new evidencijaModel(rs.getInt("idTurista"),rs.getString("imeTurista"),rs.getString("prezimeTurista"),rs.getString("oibTurista"),rs.getString("mailTurista"),rs.getString("mobTurista"));
            turistList.add(turist);
        }
        }catch(Exception e){
            JOptionPane.showMessageDialog(null,e);
        }
        return turistList;
    }
}
