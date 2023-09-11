package view;

//import com.itextpdf.text.*;
//import com.itextpdf.text.pdf.PdfWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import java.text.SimpleDateFormat;
import javax.swing.table.DefaultTableModel;
import model.BillDTO;
import model.DetailBillDTO;
import model.ProductDTO;
import static org.apache.poi.hssf.usermodel.HeaderFooter.date;

public class Bills extends javax.swing.JPanel {
    DefaultTableModel tableModel;
    DefaultTableModel tableModel1;  //chi tiết
    public Bills() {
        initComponents();
        showAll();
    }
    public void showAll() {
        tableModel = (DefaultTableModel) tbHoaDon.getModel();
        showHoaDon();
        
        tableModel1 = (DefaultTableModel) tbChiTietHoaDon.getModel();
        showChiTietHoaDon();
        
        
    }
    private void showChiTietHoaDon() { 
        MiniStoreBUS bus = new MiniStoreBUS();
        tableModel1.setRowCount(0);
        bus.docCTHD();
        
        for (DetailBillDTO cthd : MiniStoreBUS.dscthd) {
            tableModel1.addRow(new Object[]{
                cthd.getMaHD(), 
                cthd.getMaSP(), 
                cthd.getSoLuong(), 
                cthd.getDonGia(),
                cthd.getThanhTien()});
        }   
    }
    private void showHoaDon() { 
        MiniStoreBUS bus = new MiniStoreBUS();
        tableModel.setRowCount(0);
        bus.docHD();
        
        for (BillDTO hd : MiniStoreBUS.dshd) {
            tableModel.addRow(new Object[]{
                hd.getMaHD(), 
                hd.getMaKH(), 
                hd.getNgayTao(), 
                hd.getNguoiTao(),
                hd.getTongTien()});
        }   
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbChiTietHoaDon = new javax.swing.JTable();
        txtTimKiem = new javax.swing.JTextField();
        cbTimKiem = new javax.swing.JComboBox<>();
        btnTimKiem = new javax.swing.JButton();
        btnXuatPDF = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tbHoaDon = new javax.swing.JTable();

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setForeground(javax.swing.UIManager.getDefaults().getColor("InternalFrame.closePressedBackground"));
        jLabel1.setText("Hóa Đơn");

        tbChiTietHoaDon.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Mã HD", "Mã SP", "Số Lượng", "Đơn Giá", "Thành Tiền"
            }
        ));
        jScrollPane1.setViewportView(tbChiTietHoaDon);

        txtTimKiem.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N

        cbTimKiem.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        cbTimKiem.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Mã HD", "Ngày Tạo", "Người Tạo", "Tổng Tiền" }));

        btnTimKiem.setText("Tìm Kiếm");
        btnTimKiem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTimKiemActionPerformed(evt);
            }
        });

        btnXuatPDF.setBackground(javax.swing.UIManager.getDefaults().getColor("InternalFrame.closePressedBackground"));
        btnXuatPDF.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnXuatPDFMousePressed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Xuất PDF");

        javax.swing.GroupLayout btnXuatPDFLayout = new javax.swing.GroupLayout(btnXuatPDF);
        btnXuatPDF.setLayout(btnXuatPDFLayout);
        btnXuatPDFLayout.setHorizontalGroup(
            btnXuatPDFLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btnXuatPDFLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jLabel6)
                .addContainerGap(19, Short.MAX_VALUE))
        );
        btnXuatPDFLayout.setVerticalGroup(
            btnXuatPDFLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 32, Short.MAX_VALUE)
        );

        jLabel2.setFont(new java.awt.Font("Segoe UI", 3, 16)); // NOI18N
        jLabel2.setForeground(javax.swing.UIManager.getDefaults().getColor("InternalFrame.closePressedBackground"));
        jLabel2.setText("Chi tiết hóa đơn");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 3, 16)); // NOI18N
        jLabel3.setForeground(javax.swing.UIManager.getDefaults().getColor("InternalFrame.closePressedBackground"));
        jLabel3.setText("Danh sách");

        tbHoaDon.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Mã HD", "Mã KH", "Ngày Tạo", "Người Tạo", "Tổng Tiền"
            }
        ));
        jScrollPane2.setViewportView(tbHoaDon);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(384, 384, 384)
                        .addComponent(jLabel1))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(164, 164, 164)
                        .addComponent(jLabel2))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(22, 22, 22)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtTimKiem, javax.swing.GroupLayout.PREFERRED_SIZE, 226, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                        .addComponent(cbTimKiem, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel3)
                                            .addComponent(btnTimKiem))))
                                .addGap(55, 55, 55)
                                .addComponent(btnXuatPDF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))))
                .addContainerGap(18, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(cbTimKiem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btnTimKiem))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtTimKiem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(btnXuatPDF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 486, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(20, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents
    private void timKiem(String timKiem, Object cbBox){
            if(cbBox == "Mã HD"){
                tableModel.setRowCount(0);
                for (BillDTO hd: MiniStoreBUS.dshd) {
                    String maHD = String.valueOf(hd.getMaHD());
                    if(maHD.contains(timKiem)){
                        tableModel.addRow(new Object[]{ 
                        hd.getMaHD(), 
                        hd.getMaKH(),
                        hd.getNgayTao(), 
                        hd.getNguoiTao(), 
                        hd.getTongTien()});
                    }
                }
            }else if(cbBox == "Mã KH"){
                tableModel.setRowCount(0);
                for (BillDTO hd: MiniStoreBUS.dshd) {
                    if(hd.getMaKH().contains(timKiem)){
                        tableModel.addRow(new Object[]{
                        hd.getMaHD(),
                        hd.getMaKH(),
                        hd.getNgayTao(), 
                        hd.getNguoiTao(), 
                        hd.getTongTien()});
                    }
                }
            }
            else if(cbBox == "Ngày Tạo"){
                tableModel.setRowCount(0);
                for (BillDTO hd: MiniStoreBUS.dshd) {
                    String ngayTao = hd.getNgayTao().toString();
                    if(ngayTao.contains(timKiem)){
                        tableModel.addRow(new Object[]{
                        hd.getMaHD(),
                        hd.getMaKH(),
                        hd.getNgayTao(), 
                        hd.getNguoiTao(), 
                        hd.getTongTien()});
                    }
                }
            }else if(cbBox == "Người Tạo"){
                tableModel.setRowCount(0);
                for (BillDTO hd: MiniStoreBUS.dshd) {
                    if(hd.getNguoiTao().contains(timKiem)){
                        tableModel.addRow(new Object[]{
                        hd.getMaHD(), 
                        hd.getMaKH(),
                        hd.getNgayTao(), 
                        hd.getNguoiTao(), 
                        hd.getTongTien()});
                    }
                }
            }else{
                tableModel.setRowCount(0);
                for (BillDTO hd: MiniStoreBUS.dshd) {
                    String tongTien = String.valueOf(hd.getTongTien());
                    if(tongTien.contains(timKiem)){
                        tableModel.addRow(new Object[]{
                        hd.getMaHD(),
                        hd.getMaKH(),
                        hd.getNgayTao(), 
                        hd.getNguoiTao(), 
                        hd.getTongTien()});
                    }
                }
            }
    }
    private void btnTimKiemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTimKiemActionPerformed
        String tk = txtTimKiem.getText();
        Object cbBox = cbTimKiem.getSelectedItem();
        timKiem(tk, cbBox);
    }//GEN-LAST:event_btnTimKiemActionPerformed

    private void btnXuatPDFMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnXuatPDFMousePressed
        /*
        final String FILE_NAME = "itext.pdf";
        Document document = new Document();
        try {
            PdfWriter.getInstance(document, new FileOutputStream(new File(FILE_NAME)));
            //open
            document.open();
            Paragraph p = new Paragraph();
            p.add("This is my paragraph 1");
            p.setAlignment(Element.ALIGN_CENTER);
            document.add(p);
            Paragraph p2 = new Paragraph();
            p2.add("This is my paragraph 2"); //no alignment
            document.add(p2);
            Font f = new Font();
            f.setStyle(Font.BOLD);
            f.setSize(8);
            document.add(new Paragraph("This is my paragraph 3", f));
            //close
            document.close();
            System.out.println("Done");
         
        } catch (FileNotFoundException | DocumentException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
*/
    }//GEN-LAST:event_btnXuatPDFMousePressed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnTimKiem;
    private javax.swing.JPanel btnXuatPDF;
    private javax.swing.JComboBox<String> cbTimKiem;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable tbChiTietHoaDon;
    private javax.swing.JTable tbHoaDon;
    private javax.swing.JTextField txtTimKiem;
    // End of variables declaration//GEN-END:variables

    private void contains(String timKiem) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
