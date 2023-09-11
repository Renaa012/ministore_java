package database;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import model.DetailBillDTO;

public class DetailBillDAO {
    public static DetailBillDAO getInstance(){
            return new DetailBillDAO();
        }
    public ArrayList<DetailBillDTO> selectAll() {
		ArrayList<DetailBillDTO> ketQua = new ArrayList<DetailBillDTO>();
		try {
			Connection con = KetNoiDB.getConnection();
			String sql = "Select * from detailbill";
			PreparedStatement pst = con.prepareStatement(sql);
			System.out.println("Thuc thi cau lenh: "+sql);
			ResultSet rs = pst.executeQuery();
			while(rs.next()) {
				int maHD = rs.getInt("mahd");
				String maSP = rs.getString("masp");
				int soLuong = rs.getInt("soluong");
				int donGia = rs.getInt("dongia");
                                int thanhTien = rs.getInt("thanhtien");
				DetailBillDTO p = new DetailBillDTO(maHD, maSP, soLuong, donGia, thanhTien);
				ketQua.add(p);		
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return ketQua;
	}
        // tìm kiếm
	public DetailBillDTO selectById(DetailBillDTO bill) {
		DetailBillDTO ketQua = null;
		try {
			Connection con = KetNoiDB.getConnection();
			String sql = "select * form detailbill where mahd=?";
			PreparedStatement pst = con.prepareStatement(sql);
			pst.setInt(1, bill.getMaHD());
			System.out.println("Thuc thi cau lenh: "+sql);
			ResultSet rs = pst.executeQuery();
			while(rs.next()) {
				int maHD = rs.getInt("mahd");
				String maSP = rs.getString("masp");
				int soLuong = rs.getInt("soluong");
				int donGia = rs.getInt("dongia");
                                int thanhTien = rs.getInt("thanhtien");
				ketQua = new DetailBillDTO(maHD, maSP, soLuong, donGia, thanhTien);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return ketQua;
	}    
	public int insert(DetailBillDTO bill) {
		int ketQua = 0;
		try {
			Connection con = KetNoiDB.getConnection();
			String sql = "insert into detailbill(mahd,masp,soluong,dongia,thanhtien) value(?,?,?,?,?)";
			PreparedStatement statement = con.prepareCall(sql);
			statement.setInt(1, bill.getMaHD());
                        statement.setString(2, bill.getMaSP());
                        statement.setInt(3, bill.getSoLuong());
                        statement.setInt(4, bill.getDonGia());
                        statement.setInt(5, bill.getThanhTien());
                        ketQua = statement.executeUpdate();
			System.out.println("So dong bi thay doi : "+ketQua);
			KetNoiDB.closeConnection(con);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return ketQua;
	}
        
	public int update(DetailBillDTO bill) {
		int ketQua = 0;
		try {
			Connection con = KetNoiDB.getConnection();
			String sql = "update detailbill set masp=?,soluong=?,dongia=?,thanhtien=? WHERE mahd=?";
			PreparedStatement statement = con.prepareCall(sql);          
                        statement.setString(1, bill.getMaSP());
                        statement.setInt(2, bill.getSoLuong());
                        statement.setInt(3, bill.getDonGia());
                        statement.setInt(4, bill.getThanhTien());
                        statement.setInt(5, bill.getMaHD());

			ketQua = statement.executeUpdate();
			System.out.println("So dong bi thay doi : "+ketQua);
			KetNoiDB.closeConnection(con);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return ketQua;
	}
       
	public int delete(int maHD) {
		int ketQua = 0;
		try {
			Connection con = KetNoiDB.getConnection();
			String sql = "delete from detailbill where mahd=N'"+ maHD+"'";
			PreparedStatement pst = con.prepareStatement(sql);
			ketQua = pst.executeUpdate();
			System.out.println("So dong bi thay doi : "+ketQua);
			KetNoiDB.closeConnection(con);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return ketQua;
	}
}

