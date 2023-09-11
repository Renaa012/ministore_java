package view;

import java.util.ArrayList;

import database.ProductDAO;
import database.AccountDAO;
import database.BillDAO;
import database.CartDAO;
import database.DetailBillDAO;
import database.DetailReceiptDAO;
import database.PromotionDAO;
import database.ReceiptDAO;
import model.BillDTO;
import model.CartDTO;
import model.PromotionDTO;
import model.ProductDTO;
import model.AccountDTO;
import model.DetailBillDTO;
import model.DetailReceiptDTO;
import model.ReceiptDTO;
public class MiniStoreBUS {
        static ArrayList<ProductDTO> dssp;
        static ArrayList<AccountDTO> dsac;
        static ArrayList<CartDTO> dsspCart;// danh sách sản phẩm trong giỏ hàng
        static ArrayList<PromotionDTO> dskm;
        static ArrayList<BillDTO> dshd;//danh sách hóa đơn
        static ArrayList<DetailBillDTO> dscthd;
        static ArrayList<ReceiptDTO> dspn;  //ds phiếu nhập
        static ArrayList<DetailReceiptDTO> dsctpn;  //ds chi tiết phiếu nhập
	MiniStoreBUS(){ 
	} 
        //product
        void docSP()
        {
            ProductDAO dataSP = new ProductDAO();
            if(dssp==null)
                {
                    dssp = new ArrayList<ProductDTO>();
                }
            dssp = dataSP.selectAll();
        }
	
        public void insertSP(ProductDTO sp) {
		ProductDAO dataSP = new ProductDAO();
                dataSP.insert(sp);
                dssp.add(sp);
	}
	
	public void deleteSP(String maSP, int n) {
		ProductDAO dataSP = new ProductDAO();
                dataSP.delete(maSP);
                dssp.remove(n);
	}
        
	public void updateSP(ProductDTO sp) {
                ProductDAO dataSP = new ProductDAO();
                dataSP.update(sp);
                
                dssp.remove(sp);
		dssp.add(sp);
	}
        
        //acount
        void docAC()
        {
            AccountDAO dataAC = new AccountDAO();
            if(dsac==null)
                {
                    dsac = new ArrayList<AccountDTO>();
                }
            dsac = dataAC.selectAll();
        }
	
        public void insertAC(AccountDTO ac) {
		AccountDAO dataAC = new AccountDAO();
                dataAC.insert(ac);
                dsac.add(ac);
	}
	
	public void deleteAC(String userName, int n) {
		AccountDAO dataAC = new AccountDAO();
                dataAC.delete(userName);
                dsac.remove(n);
	}
	
	public void updateAC(AccountDTO ac) {
                AccountDAO dataAC = new AccountDAO();
                dataAC.update(ac);
                
                dsac.remove(ac);
		dsac.add(ac);
	}  
        public void editAC(AccountDTO ac){
                AccountDAO dataAC = new AccountDAO();
                dataAC.edit(ac);
                
                dsac.remove(ac);
		dsac.add(ac);
        }
         public void editPass(AccountDTO ac){
                AccountDAO dataAC = new AccountDAO();
                dataAC.editPass(ac);
                
                dsac.remove(ac);
		dsac.add(ac);
        }
        
        //cart
        void docCart()
        {
            CartDAO dataCart = new CartDAO();
            if(dsspCart==null)
                {
                    dsspCart = new ArrayList<CartDTO>();
                }
            dsspCart = dataCart.selectAll();
        }
	
        public void insertCart(CartDTO cart) {
		CartDAO dataCart = new CartDAO();
                dataCart.insert(cart);
                dsspCart.add(cart);
	}
        public void updateCart(CartDTO cart ) {
                CartDAO dataCart = new CartDAO();
                dataCart.update(cart);
                
                dsspCart.remove(cart);
		dsspCart.add(cart);
	}  
	
	public void deleteCart(String maSP, int n) {
		CartDAO dataCart = new CartDAO();
                dataCart.delete(maSP);
                dsspCart.remove(n);
	}  
        
        //promotion
        void docKM()
        {
            PromotionDAO dataKM = new PromotionDAO();
            if(dskm==null)
                {
                    dskm = new ArrayList<PromotionDTO>();
                }
            dskm = dataKM.selectAll();
        }
	
        public void insertKM(PromotionDTO km) {
		PromotionDAO dataKM = new PromotionDAO();
                dataKM.insert(km);
                dskm.add(km);
	}
        
        public void updateKM(PromotionDTO km, String maKM ) {
                PromotionDAO dataKM = new PromotionDAO();
                dataKM.update(km, maKM);
                
                dskm.remove(km);
		dskm.add(km);
	}  
	
	public void deleteKM(String maKM, int n) {
		PromotionDAO dataKM = new PromotionDAO();
                dataKM.delete(maKM);
                dskm.remove(n);
	}
        //hóa đơn
        void docHD()
        {
            BillDAO dataHD = new BillDAO();
            if(dshd==null)
                {
                    dshd = new ArrayList<BillDTO>();
                }
            dshd = dataHD.selectAll();
        }
	
        public void insertHD(BillDTO hd) {
		BillDAO dataHD = new BillDAO();
                dataHD.insert(hd);
                //dshd.add(hd);
	}
        
        public void updateHD(BillDTO hd) {
                BillDAO dataHD = new BillDAO();
                dataHD.update(hd);
                
                dshd.remove(hd);
		dshd.add(hd);
	}  
	
	public void deleteHD(int maHD, int n) {
		BillDAO dataHD = new BillDAO();
                dataHD.delete(maHD);
                dshd.remove(n);
	}
        //chi tiết hóa đơn
        void docCTHD()
        {
            DetailBillDAO dataCTHD = new DetailBillDAO();
            if(dscthd==null)
                {
                    dscthd = new ArrayList<DetailBillDTO>();
                }
            dscthd = dataCTHD.selectAll();
        }
	
        public void insertCTHD(DetailBillDTO cthd) {
		DetailBillDAO dataCTHD = new DetailBillDAO();
                dataCTHD.insert(cthd);
                //dscthd.add(cthd);
	}
        
        public void updateCTHD(DetailBillDTO cthd) {
                DetailBillDAO dataCTHD = new DetailBillDAO();
                dataCTHD.update(cthd);
                
                dscthd.remove(cthd);
		dscthd.add(cthd);
	}  
	
	public void deleteCTHD(int maCTHD, int n) {
		DetailBillDAO dataCTHD = new DetailBillDAO();
                dataCTHD.delete(maCTHD);
                dscthd.remove(n);
	}

        //phiếu nhập
         void docPN()
        {
            ReceiptDAO dataPN = new ReceiptDAO();
            if(dspn==null)
                {
                    dspn = new ArrayList<ReceiptDTO>();
                }
            dspn = dataPN.selectAll();
        }
	
        public void insertPN(ReceiptDTO pn) {
		ReceiptDAO dataPN = new ReceiptDAO();
                dataPN.insert(pn);
                dspn.add(pn);
	}
	
	public void deletePN(String maPN, int n) {
		ReceiptDAO dataPN = new ReceiptDAO();
                dataPN.delete(maPN);
                dspn.remove(n);
	}
        
	public void updatePN(ReceiptDTO pn, String maPN) {
                ReceiptDAO dataPN = new ReceiptDAO();
                dataPN.update(pn, maPN);
                
                dspn.remove(pn);
		dspn.add(pn);
	}
        //chi tiet phiếu nhập
         void docCTPN()
        {
            DetailReceiptDAO dataCTPN = new DetailReceiptDAO();
            if(dsctpn==null)
                {
                    dsctpn = new ArrayList<DetailReceiptDTO>();
                }
            dsctpn = dataCTPN.selectAll();
        }
	
        public void insertCTPN(DetailReceiptDTO ctpn) {
		DetailReceiptDAO dataCTPN = new DetailReceiptDAO();
                dataCTPN.insert(ctpn);
                dsctpn.add(ctpn);
	}
	
	public void deleteCTPN(String maCTPN, int n) {
		DetailReceiptDAO dataCTPN = new DetailReceiptDAO();
                dataCTPN.delete(maCTPN);
                dsctpn.remove(n);
	}
        
	public void updateCTPN(DetailReceiptDTO ctpn, String maCTPN) {
                DetailReceiptDAO dataCTPN = new DetailReceiptDAO();
                dataCTPN.update(ctpn);
                
                dsctpn.remove(ctpn);
		dsctpn.add(ctpn);
	}
}

