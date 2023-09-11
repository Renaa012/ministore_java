package demo;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import demo.DAOInterface;
import demo.KetNoiDB;
import demo.SinhVienDTO;

public class SinhVienDAO{  
    public static SinhVienDAO getInstance(){
            return new SinhVienDAO();
        }
	public int insert(SinhVienDTO sinhvien) {
		int ketQua = 0;
		try {
			Connection con = KetNoiDB.getConnection();
			String sql = "insert into thongtin(mssv,hoten,du18,email,sdt,gioitinh,diachi) value(?,?,?,?,?,?,?)";
			PreparedStatement statement = con.prepareCall(sql);
			statement.setString(1, sinhvien.getMaSV());
                        statement.setString(2, sinhvien.getHoTen());
                        statement.setString(3, sinhvien.getTuoi());
                        statement.setString(4, sinhvien.getEmail());
                        statement.setString(5, sinhvien.getSoDT());
                        statement.setString(6, sinhvien.getGioiTinh());
                        statement.setString(7, sinhvien.getDiaChi());
                        ketQua = statement.executeUpdate();
			System.out.println("So dong bi thay doi : "+ketQua);
			KetNoiDB.closeConnection(con);
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		return ketQua;
	}
	public int update(SinhVienDTO sinhvien, String mssv) {
		int ketQua = 0;
		try {
			Connection con = KetNoiDB.getConnection();
			String sql = "update thongtin set hoten=?,du18=?,email=?,sdt=?,gioitinh=?,diachi=? WHERE mssv=?";
			PreparedStatement statement = con.prepareCall(sql);          
                        statement.setString(1, sinhvien.getHoTen());
                        statement.setString(2, sinhvien.getTuoi());
                        statement.setString(3, sinhvien.getEmail());
                        statement.setString(4, sinhvien.getSoDT());
                        statement.setString(5, sinhvien.getGioiTinh());
                        statement.setString(6, sinhvien.getDiaChi());
                        statement.setString(7, sinhvien.getMaSV());
			ketQua = statement.executeUpdate();
			System.out.println("So dong bi thay doi : "+ketQua);
			KetNoiDB.closeConnection(con);
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		return ketQua;
	}
	public int delete(String mssv) {
		int ketQua = 0;
		try {
			Connection con = KetNoiDB.getConnection();
			String sql = "delete from thongtin where mssv="+mssv;
			PreparedStatement pst = con.prepareStatement(sql);
			ketQua = pst.executeUpdate();
			System.out.println("So dong bi thay doi : "+ketQua);
			KetNoiDB.closeConnection(con);
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		return ketQua;
	}
	public ArrayList<SinhVienDTO> selectAll() {
		ArrayList<SinhVienDTO> ketQua = new ArrayList<SinhVienDTO>();
		try {
			Connection con = KetNoiDB.getConnection();
			String sql = "Select * from thongtin";
			PreparedStatement pst = con.prepareStatement(sql);
			System.out.println("Thuc thi cau lenh: "+sql);
			ResultSet rs = pst.executeQuery();
			while(rs.next()) {
				String maSV = rs.getString("mssv");
				String hoTen = rs.getString("hoten");
				String tuoi = rs.getString("du18");
				String email = rs.getString("email");
				String sdt = rs.getString("sdt");
				String gioiTinh = rs.getString("gioitinh");
                                String diaChi = rs.getString("diachi");
				SinhVienDTO p = new SinhVienDTO(maSV, hoTen, tuoi, email, sdt, gioiTinh,diaChi);
				ketQua.add(p);		
			}
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		return ketQua;
	}
        // tìm kiếm
	public SinhVienDTO selectById(String t) {
		SinhVienDTO ketQua = null;
		try {
			Connection con = KetNoiDB.getConnection();
			String sql = "select * form sinhvien where mssv=?";
			PreparedStatement pst = con.prepareStatement(sql);
			pst.setString(1, t);
			System.out.println("Thuc thi cau lenh: "+sql);
			ResultSet rs = pst.executeQuery();
			while(rs.next()) {
				String maSV = rs.getString("mssv");
				String hoTen = rs.getString("hoten");
				String tuoi = rs.getString("du18");
				String email = rs.getString("email");
				String sdt = rs.getString("sdt");
				String gioiTinh = rs.getString("gioitinh");
                                String diaChi = rs.getString("diachi");
				ketQua = new SinhVienDTO(maSV, hoTen, tuoi, email, sdt, gioiTinh,diaChi);
			}
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		return ketQua;
	}    

        
}