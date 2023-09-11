package ui;

import ui.SinhVien;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class SinhVienModify {
    
    public static List<SinhVien>findAll(){
        List<SinhVien> sinhvienList = new ArrayList<>();
        //Class.forName("com.mysql.cj.jdbc.Driver");
        try(Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/sinhvien","root","") ) {
            String sql ="Select * from thongtin ";
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(sql);
            while(rs.next()){
                SinhVien sinhvien = new SinhVien(rs.getString("mssv"),rs.getString("hoten"), 
                        rs.getString("du18"), rs.getString("email"), rs.getString("sdt"), 
                        rs.getString("gioitinh"), rs.getString("diachi"));
                sinhvienList.add(sinhvien);
            }
            conn.close();
        } catch (Exception e) {
                        Logger.getLogger(SinhVienModify.class.getName()).log(Level.SEVERE, null, e);
        }
        return sinhvienList;
    }
    
    public static void insert(SinhVien sinhvien){
        try(Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/sinhvien","root","")){
            String sql ="insert into thongtin(mssv,hoten,du18,email,sdt,gioitinh,diachi) value(?,?,?,?,?,?,?)";
            PreparedStatement statement = conn.prepareCall(sql);
            
            statement.setString(1, sinhvien.getMaSV());
            statement.setString(2, sinhvien.getHoTen());
            statement.setString(3, sinhvien.getTuoi());
            statement.setString(4, sinhvien.getEmail());
            statement.setString(5, sinhvien.getSoDT());
            statement.setString(6, sinhvien.getGioiTinh());
            statement.setString(7, sinhvien.getDiaChi());
            statement.execute();
        } catch (SQLException ex) {
            Logger.getLogger(SinhVienModify.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    
    public static void delete(String mssv){
        PreparedStatement statement ;
        try(Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/sinhvien","root","")){
            String sql ="delete from thongtin where mssv=?";
            statement = conn.prepareCall(sql);
            
            statement.setString(1, mssv);
            
            statement.execute();
        } catch (SQLException ex) {
            Logger.getLogger(SinhVienModify.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public static void update(SinhVien sinhvien, String mssv){
        try(Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/sinhvien","root","")){
            String sql ="update thongtin set hoten=?,du18=?,email=?,sdt=?,gioitinh=?,diachi=? WHERE mssv=?";
            PreparedStatement statement = conn.prepareCall(sql);          
            statement.setString(1, sinhvien.getHoTen());
            statement.setString(2, sinhvien.getTuoi());
            statement.setString(3, sinhvien.getEmail());
            statement.setString(4, sinhvien.getSoDT());
            statement.setString(5, sinhvien.getGioiTinh());
            statement.setString(6, sinhvien.getDiaChi());
            statement.setString(7, sinhvien.getMaSV());
            
            statement.execute();
        } catch (SQLException ex) {
            Logger.getLogger(SinhVienModify.class.getName()).log(Level.SEVERE, null, ex);
            
        }
    }
}