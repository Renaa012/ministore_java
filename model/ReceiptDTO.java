package model;

import java.util.Date;

public class ReceiptDTO {
    public String maPN;
    public Date ngayTao;
    public String nguoiTao;
    public String maNCC;
    public int tongTien;

    public ReceiptDTO() {
        super();
    }

    public ReceiptDTO(String maPN, Date ngayTao, String nguoiTao, String maNCC, int tongTien) {
        super();
        this.maPN = maPN;
        this.ngayTao = ngayTao;
        this.nguoiTao = nguoiTao;
        this.maNCC = maNCC;
        this.tongTien = tongTien;
    }

    public String getMaPN() {
        return maPN;
    }

    public void setMaPN(String maPN) {
        this.maPN = maPN;
    }

    public Date getNgayTao() {
        return ngayTao;
    }

    public void setNgayTao(Date ngayTao) {
        this.ngayTao = ngayTao;
    }

    public String getNguoiTao() {
        return nguoiTao;
    }

    public void setNguoiTao(String nguoiTao) {
        this.nguoiTao = nguoiTao;
    }

    public String getMaNCC() {
        return maNCC;
    }

    public void setMaNCC(String maNCC) {
        this.maNCC = maNCC;
    }

    public int getTongTien() {
        return tongTien;
    }

    public void setTongTien(int tongTien) {
        this.tongTien = tongTien;
    }

    @Override
    public String toString() {
        return "ReceiptDTO{" + "maPN=" + maPN + ", ngayTao=" + ngayTao + ", nguoiTao=" + nguoiTao + ", maNCC=" + maNCC + ", tongTien=" + tongTien + '}';
    }
}
