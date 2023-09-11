package database;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.Date;
import model.BillDTO;

public class BillDAO {
    public static BillDAO getInstance(){
            return new BillDAO();
        }
    public ArrayList<BillDTO> selectAll() {
		ArrayList<BillDTO> ketQua = new ArrayList<BillDTO>();
		try {
			Connection con = KetNoiDB.getConnection();
			String sql = "Select * from bill";
			PreparedStatement pst = con.prepareStatement(sql);
			System.out.println("Thuc thi cau lenh: "+sql);
			ResultSet rs = pst.executeQuery();
			while(rs.next()) {
				int maHD = rs.getInt("mahd");
                                String maKH = rs.getString("makh");
				Date ngayTao = rs.getDate("ngaytao");
				String nguoiTao = rs.getString("nguoitao");
				int tongTien = rs.getInt("tongtien");
				BillDTO p = new BillDTO(maHD, maKH, ngayTao, nguoiTao, tongTien);
				ketQua.add(p);		
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return ketQua;
	}
        // tìm kiếm
	public BillDTO selectById(BillDTO bill) {
		BillDTO ketQua = null;
		try {
			Connection con = KetNoiDB.getConnection();
			String sql = "select * form bill where mahd=?";
			PreparedStatement pst = con.prepareStatement(sql);
			pst.setInt(1, bill.getMaHD());
			System.out.println("Thuc thi cau lenh: "+sql);
			ResultSet rs = pst.executeQuery();
			while(rs.next()) {
				int maHD = rs.getInt("mahd");
                                String maKH = rs.getString("makh");
				Date ngayTao = rs.getDate("ngaytao");
				String nguoiTao = rs.getString("nguoitao");
				int tongTien = rs.getInt("tongtien");
				ketQua = new BillDTO(maHD, maKH, ngayTao, nguoiTao, tongTien);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return ketQua;
	}  
        
	public int insert(BillDTO bill) {
		int ketQua = 0;
		try {
			Connection con = KetNoiDB.getConnection();
			String sql = "insert into bill(mahd,makh,ngaytao,nguoitao,tongtien) value(?,?,?,?,?)";
			PreparedStatement statement = con.prepareCall(sql);
			statement.setInt(1, bill.getMaHD());
                        statement.setString(2, bill.getMaKH());
                        statement.setDate(3, (java.sql.Date) bill.getNgayTao());
                        statement.setString(4, bill.getNguoiTao());
                        statement.setInt(5, bill.getTongTien());
                        ketQua = statement.executeUpdate();
			System.out.println("So dong bi thay doi : "+ketQua);
			KetNoiDB.closeConnection(con);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return ketQua;
	}
        
	public int update(BillDTO bill) {
		int ketQua = 0;
		try {
			Connection con = KetNoiDB.getConnection();
			String sql = "update bill set makh=?,ngaytao=?,nguoitao=?,tongtien=? WHERE mahd=?";
			PreparedStatement statement = con.prepareCall(sql);  
                        statement.setString(1, bill.getMaKH());
                        statement.setDate(2, (java.sql.Date) bill.getNgayTao());
                        statement.setString(3, bill.getNguoiTao());
                        statement.setInt(4, bill.getTongTien());
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
			String sql = "delete from bill where mahd=N'"+ maHD+"'";
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