/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package database;

import java.sql.Connection;
import model.ThongKeDTO;
import model.ProductDTO;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import model.CustomerDTO;


/**
 *
 * @author tihz
 */
public class ThongKeDAO {
    public static ThongKeDAO getInstace(){
        return new ThongKeDAO();
    }

    public ArrayList<ProductDTO> getTopBanChay(){
        try{
            Connection con = KetNoiDB.getConnection();
            String sql = " SELECT masp, DaBan FROM(" +
                    "SELECT masp, SUM(soluong) AS DaBan FROM " +
                    "DetailBill GROUP BY masp"+
                    ") temp"+
                    "ORDER BY DaBan"+
                    "DESC LIMIT 5";
            PreparedStatement pst = con.prepareStatement(sql);
            ResultSet rs = pst.executeQuery();
            while(rs.next()) {
                ProductDTO sp = new ProductDTO();
                sp.setMaSP(rs.getString(1));
                sp.setTenSP(rs.getString(2));
                sp.setSoLuong(rs.getInt(3));
		}
            } catch (Exception e) {
			e.printStackTrace();
            }
        return null;
    }
    public double getDoanhThuThang(int thang, int nam){
        try{
            Connection con = KetNoiDB.getConnection();
            String thangBD = nam +"-"+ thang + "-01";
            String thangKT = nam +"-"+ (thang + 1) + "-01";
            String sql = " SELECT SUM(tongtien) FROM bill WHERE ngaytao BETWEN CAST(? AS DATE) AND CAST(? DATE)";
            PreparedStatement pst = con.prepareStatement(sql);
            pst.setString(1, thangBD);
            pst.setString(2, thangKT);
            ResultSet rs = pst.executeQuery();
            while(rs.next()){
                return rs.getDouble(1);
            }
        }catch(Exception e){
            e.printStackTrace();
        }
        return nam;
    }
}
