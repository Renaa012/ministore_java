package demo;
import java.util.ArrayList;
public class SinhVienBUS {
	static ArrayList<SinhVienDTO> dssv;
	SinhVienBUS() {
	} 
        void docDSSV()
        {
            SinhVienDAO data = new SinhVienDAO();
            if(dssv==null)
                {
                    dssv = new ArrayList<SinhVienDTO>();
                }
            dssv = data.selectAll();
        }
	
        void insert(SinhVienDTO sv) {
		SinhVienDAO data = new SinhVienDAO();
                data.insert(sv);
                dssv.add(sv);
	}
	
	public void delete(String mssv, int n) {
		SinhVienDAO data = new SinhVienDAO();
                data.delete(mssv);
                dssv.remove(n);
	}
	
	public void update(SinhVienDTO sv, String mssv) {
                SinhVienDAO data = new SinhVienDAO();
                data.update(sv, mssv);
                
                dssv.remove(sv);
		dssv.add(sv);
	}
}