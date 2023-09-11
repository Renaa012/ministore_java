package demo;

import ui.SinhVienModify;
import ui.SinhVien;
import com.formdev.flatlaf.FlatLightLaf;
import com.mysql.cj.result.Row;
import java.awt.Font;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.List;
import static java.util.Spliterators.iterator;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ButtonGroup;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JRadioButton;
import javax.swing.JTable;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import javax.swing.table.DefaultTableModel;
import org.apache.poi.sl.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import org.apache.poi.hwpf.usermodel.Paragraph;
import org.w3c.dom.Document;

public class SinhVienGUI extends javax.swing.JFrame {
    DefaultTableModel tableModel;
    //List<SinhVienBUS> bus = new ArrayList<>(); 
    int selectindex = -1;
    
    Vector DS = new Vector();//lưu tiêu đề cho table
    Vector dataDS = new Vector();//lưu dữ liệu cho tb

    public SinhVienGUI() {
        initComponents();
        //List<SinhVienBUS> bus = new ArrayList<>(); 
        showAll(); // hiện data ngay khi mở lên
    }
    
    public void showAll() {
        tableModel = (DefaultTableModel) tbDS.getModel();
        showThongTin();
    }
    private void showThongTin() { 
        SinhVienBUS bus = new SinhVienBUS();
        tableModel.setRowCount(0);
        bus.docDSSV();
        
        for (SinhVienDTO sv : SinhVienBUS.dssv) {
            tableModel.addRow(new Object[]{sv.getMaSV(), 
                sv.getHoTen(), 
                sv.getTuoi(), 
                sv.getEmail(),
                sv.getSoDT(),
                sv.getGioiTinh(), 
                sv.getDiaChi()});
        }      
    }   
    private boolean checkMaSV(String MaSV) {
        for (SinhVienDTO sinhvien: SinhVienBUS.dssv) {
            if(MaSV.equals(sinhvien.getMaSV())){
                return false;
            }
        }
        return true;
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        buttonGroup3 = new javax.swing.ButtonGroup();
        buttonGroup4 = new javax.swing.ButtonGroup();
        buttonGroup5 = new javax.swing.ButtonGroup();
        jPanel3 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txtMaSV = new javax.swing.JTextField();
        txtHoTen = new javax.swing.JTextField();
        txtEmail = new javax.swing.JTextField();
        txtSDT = new javax.swing.JTextField();
        btnAdd = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();
        btnReset = new javax.swing.JButton();
        radioBtnNam = new javax.swing.JRadioButton();
        radioBtnNu = new javax.swing.JRadioButton();
        btnUpdate = new javax.swing.JButton();
        txtDiaChi = new javax.swing.JTextField();
        cbTuoi = new javax.swing.JCheckBox();
        jLabel8 = new javax.swing.JLabel();
        txtTimKiem = new javax.swing.JTextField();
        cbTimKiem = new javax.swing.JComboBox<>();
        btnTimKiem = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tbDS = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        txtThongKe = new javax.swing.JTextField();
        btnThongKe = new javax.swing.JButton();
        excel = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));

        jPanel3.setBackground(new java.awt.Color(204, 255, 255));
        jPanel3.setPreferredSize(new java.awt.Dimension(960, 418));

        jPanel1.setBackground(new java.awt.Color(204, 255, 255));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 153, 153));
        jLabel2.setText("MSSV");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 153, 153));
        jLabel3.setText("Họ tên");

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 153, 153));
        jLabel4.setText("Email");

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 153, 153));
        jLabel5.setText("SĐT");

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 153, 153));
        jLabel6.setText("Giới tính");

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 153, 153));
        jLabel7.setText("Địa chỉ");

        btnAdd.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnAdd.setForeground(new java.awt.Color(0, 153, 153));
        btnAdd.setText("Add");
        btnAdd.setAutoscrolls(true);
        btnAdd.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnAdd.setFocusable(false);
        btnAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddActionPerformed(evt);
            }
        });

        btnDelete.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnDelete.setForeground(new java.awt.Color(0, 153, 153));
        btnDelete.setText("Delete");
        btnDelete.setAutoscrolls(true);
        btnDelete.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnDelete.setFocusable(false);
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });

        btnReset.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnReset.setForeground(new java.awt.Color(0, 153, 153));
        btnReset.setText("RESET");
        btnReset.setAutoscrolls(true);
        btnReset.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnReset.setFocusable(false);
        btnReset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnResetActionPerformed(evt);
            }
        });

        radioBtnNam.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        radioBtnNam.setForeground(new java.awt.Color(0, 153, 153));
        radioBtnNam.setText("Nam");

        radioBtnNu.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        radioBtnNu.setForeground(new java.awt.Color(0, 153, 153));
        radioBtnNu.setText("Nữ");

        btnUpdate.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnUpdate.setForeground(new java.awt.Color(0, 153, 153));
        btnUpdate.setText("Update");
        btnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateActionPerformed(evt);
            }
        });

        cbTuoi.setForeground(new java.awt.Color(0, 153, 153));
        cbTuoi.setText("Đủ 18 tuổi");
        cbTuoi.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                cbTuoiStateChanged(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 153, 153));
        jLabel8.setText("Tìm kiếm");

        txtTimKiem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTimKiemActionPerformed(evt);
            }
        });

        cbTimKiem.setFont(new java.awt.Font("Segoe UI", 2, 12)); // NOI18N
        cbTimKiem.setForeground(new java.awt.Color(0, 102, 102));
        cbTimKiem.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "MSSV", "Họ tên", "Tuổi", "Email", "SDT", "Giới tính", "Địa chỉ" }));
        cbTimKiem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbTimKiemActionPerformed(evt);
            }
        });

        btnTimKiem.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnTimKiem.setForeground(new java.awt.Color(0, 153, 153));
        btnTimKiem.setText("Search");
        btnTimKiem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTimKiemActionPerformed(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(0, 153, 153));
        jLabel9.setText("Thống kê");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtMaSV, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtHoTen, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtSDT, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(15, 15, 15)
                                        .addComponent(radioBtnNam)
                                        .addGap(18, 18, 18)
                                        .addComponent(radioBtnNu)))
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(32, 32, 32)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(btnDelete, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(btnAdd, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(btnReset, javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(btnUpdate, javax.swing.GroupLayout.Alignment.TRAILING)))))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(58, 58, 58)
                                .addComponent(cbTuoi, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(txtTimKiem, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(jLabel7)
                                    .addGap(20, 20, 20)
                                    .addComponent(txtDiaChi, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btnTimKiem))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel8)
                                .addGap(18, 18, 18)
                                .addComponent(cbTimKiem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel9))
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtMaSV, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2))
                        .addGap(17, 17, 17)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtHoTen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtSDT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5))
                        .addGap(24, 24, 24)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(radioBtnNam)
                            .addComponent(radioBtnNu)
                            .addComponent(jLabel6)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btnAdd)
                        .addGap(17, 17, 17)
                        .addComponent(btnDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnUpdate)
                        .addGap(18, 18, 18)
                        .addComponent(btnReset)))
                .addGap(13, 13, 13)
                .addComponent(cbTuoi)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(txtDiaChi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(cbTimKiem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnTimKiem)
                    .addComponent(txtTimKiem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 19, Short.MAX_VALUE)
                .addComponent(jLabel9))
        );

        tbDS.setAutoCreateRowSorter(true);
        tbDS.setForeground(new java.awt.Color(0, 51, 51));
        tbDS.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, "", null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "MSSV", "Họ tên", "Đủ 18", "Email", "SĐT", "Giới tính", "Địa chỉ"
            }
        ));
        tbDS.setGridColor(new java.awt.Color(0, 102, 102));
        tbDS.setInheritsPopupMenu(true);
        tbDS.setSelectionBackground(new java.awt.Color(0, 102, 102));
        tbDS.setSelectionForeground(new java.awt.Color(0, 153, 153));
        tbDS.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        tbDS.setShowGrid(false);
        tbDS.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbDSMouseClicked(evt);
            }
        });
        tbDS.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                tbDSKeyReleased(evt);
            }
        });
        jScrollPane2.setViewportView(tbDS);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 153, 153));
        jLabel1.setText("SINH VIÊN");

        txtThongKe.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtThongKeActionPerformed(evt);
            }
        });

        btnThongKe.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnThongKe.setForeground(new java.awt.Color(0, 153, 153));
        btnThongKe.setText("Ping");
        btnThongKe.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnThongKeActionPerformed(evt);
            }
        });

        excel.setText("Nhập EXCEL");
        excel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                excelActionPerformed(evt);
            }
        });

        jButton1.setText("Export PDF");
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jButton1MousePressed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGap(68, 68, 68)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtThongKe, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(excel))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(btnThongKe, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jButton1, javax.swing.GroupLayout.Alignment.TRAILING))))
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 602, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(117, 117, 117)
                        .addComponent(jLabel1)))
                .addContainerGap(15, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtThongKe, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnThongKe))
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(excel))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jButton1)
                                .addGap(4, 4, 4))))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 447, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(13, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
            .addComponent(jPanel3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 985, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, 501, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnResetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnResetActionPerformed
        txtMaSV.setText("");
        txtHoTen.setText("");
        cbTuoi.setSelected(false);
        txtEmail.setText("");
        txtSDT.setText("");
        ButtonGroup bgGioiTinh = new ButtonGroup();
        bgGioiTinh.add(radioBtnNam);
        bgGioiTinh.add(radioBtnNu);
        bgGioiTinh.clearSelection();
        txtDiaChi.setText("");
        
        cbTimKiem.setSelectedIndex(0);
        txtTimKiem.setText("");
        showAll();
    }//GEN-LAST:event_btnResetActionPerformed

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        //SinhVienDTO sv =  new SinhVienDTO();
        List<SinhVienDTO> sinhvienList = SinhVienBUS.dssv;
        int n = tbDS.getSelectedRow();  //khi người dùng bấm bất kì dòng nào trên table
        if (n == -1) {
            JOptionPane.showMessageDialog(this, "Chọn dòng để xóa");
        } else {
            SinhVienDTO sv = sinhvienList.get(n);    
            SinhVienBUS bus = new SinhVienBUS();
            bus.delete(sv.getMaSV(),n);
            showAll();           
            JOptionPane.showMessageDialog(this, "Xóa thành công");
        }  
    }//GEN-LAST:event_btnDeleteActionPerformed

    private void btnAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddActionPerformed
        SinhVienDTO sv = new SinhVienDTO();
        sv.maSV = txtMaSV.getText();//gắn thông tin cho tenBD
        sv.hoTen = txtHoTen.getText();
        String tuoi = "";
        sv.Email = txtEmail.getText();
        sv.soDT = txtSDT.getText();
        String gioiTinh = "";
        sv.diaChi = txtDiaChi.getText();
        if (radioBtnNam.isSelected()) {
            sv.gioiTinh = "Nam";
        } else if (radioBtnNu.isSelected()){
            sv.gioiTinh = "Nữ";
        } else{
            sv.gioiTinh = "Null";
        }
        
        if (cbTuoi.isSelected()) {
            sv.tuoi = "Đủ";
        } else {
            sv.tuoi = "Chưa";
        }
        if (checkMaSV(sv.maSV) == false){
            JOptionPane.showMessageDialog(this, "Trùng");
        } else{
            SinhVienBUS bus = new SinhVienBUS();
            bus.insert(sv);
            
            Vector row = new Vector();
            DS.add(sv.maSV);
            DS.add(sv.hoTen);
            DS.add(sv.tuoi);
            DS.add(sv.Email);
            DS.add(sv.soDT);
            DS.add(sv.gioiTinh);
            DS.add(sv.diaChi);
            tableModel.addRow(DS);
            tbDS.setModel(tableModel);   
        }  
    }//GEN-LAST:event_btnAddActionPerformed

    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateActionPerformed
        SinhVienDTO sv = new SinhVienDTO(); 
        int n = tbDS.getSelectedRow();  //khi người dùng bấm bất kì dòng nào trên table
        if (n == -1) {
            JOptionPane.showMessageDialog(this, "Chọn dòng để cập nhật");
        } else {            
            //thêm vào vị trí vừa xóa đề update
            sv.maSV = txtMaSV.getText();//gắn thông tin cho tenBD
            sv.hoTen = txtHoTen.getText();
            String tuoi = "";
            sv.Email = txtEmail.getText();
            sv.soDT = txtSDT.getText();
            String gioiTinh = "";
            sv.diaChi = txtDiaChi.getText();
            if (radioBtnNam.isSelected()) {
                sv.gioiTinh = "Nam";
            } else {
                sv.gioiTinh = "Nữ";
            }
            if (cbTuoi.isSelected()) {
                sv.tuoi = "Đủ";
            } else {
                sv.tuoi = "Chưa";
            }
            SinhVienBUS bus = new SinhVienBUS();
            bus.update(sv, sv.getMaSV());
            showAll();
        }
    }//GEN-LAST:event_btnUpdateActionPerformed

    private void cbTuoiStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_cbTuoiStateChanged
        // TODO add your handling code here:
    }//GEN-LAST:event_cbTuoiStateChanged

    private void tbDSKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tbDSKeyReleased
        // TODO add your handling code here:
        desplaydetails(((JTable) evt.getSource()).getSelectedRow());
    }//GEN-LAST:event_tbDSKeyReleased

    private void tbDSMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbDSMouseClicked
        // TODO add your handling code here:
        int n = tbDS.getSelectedRow();
        txtMaSV.setText(tbDS.getModel().getValueAt(n, 0).toString());//gắn thông tin cho tenBD
        txtHoTen.setText(tbDS.getModel().getValueAt(n, 1).toString());
        if(tbDS.getModel().getValueAt(n, 2)=="Nam"){
            radioBtnNam.setSelected(true);
            radioBtnNu.setSelected(false);
        }else{
            radioBtnNu.setSelected(true);
            radioBtnNam.setSelected(false);
        }
        txtEmail.setText(tbDS.getModel().getValueAt(n, 3).toString());
        txtSDT.setText(tbDS.getModel().getValueAt(n, 4).toString());
        if(tbDS.getModel().getValueAt(n, 5)=="Đủ"){
            cbTuoi.setSelected(true);
        }
        txtDiaChi.setText(tbDS.getModel().getValueAt(n, 6).toString());
    }//GEN-LAST:event_tbDSMouseClicked

    private void timKiem(String timKiem, Object cbBox){
            if(cbBox == "MSSV"){
                tableModel.setRowCount(0);
                for (SinhVienDTO sinhvien: SinhVienBUS.dssv) {
                    if(sinhvien.getMaSV().contains(timKiem)){
                        tableModel.addRow(new Object[]{sinhvien.getMaSV(), 
                        sinhvien.getHoTen(), 
                        sinhvien.getTuoi(), 
                        sinhvien.getEmail(),
                        sinhvien.getSoDT(),
                        sinhvien.getGioiTinh(), 
                        sinhvien.getDiaChi(), });
                    }
                }
            }else if(cbBox == "Họ tên"){
                tableModel.setRowCount(0);
                for (SinhVienDTO sinhvien: SinhVienBUS.dssv) {
                    if(sinhvien.getHoTen().contains(timKiem)){
                        tableModel.addRow(new Object[]{sinhvien.getMaSV(), 
                        sinhvien.getHoTen(), 
                        sinhvien.getTuoi(), 
                        sinhvien.getEmail(),
                        sinhvien.getSoDT(),
                        sinhvien.getGioiTinh(), 
                        sinhvien.getDiaChi(), });
                    }
                }
            }else if(cbBox == "Tuổi"){
                tableModel.setRowCount(0);
                for (SinhVienDTO sinhvien: SinhVienBUS.dssv) {
                    if(sinhvien.getTuoi().contains(timKiem)){
                        tableModel.addRow(new Object[]{sinhvien.getMaSV(), 
                        sinhvien.getHoTen(), 
                        sinhvien.getTuoi(), 
                        sinhvien.getEmail(),
                        sinhvien.getSoDT(),
                        sinhvien.getGioiTinh(), 
                        sinhvien.getDiaChi(), });
                    }
                }
            }else if(cbBox == "Email"){
                tableModel.setRowCount(0);
                for (SinhVienDTO sinhvien: SinhVienBUS.dssv) {
                    if(sinhvien.getEmail().contains(timKiem)){
                        tableModel.addRow(new Object[]{sinhvien.getMaSV(), 
                        sinhvien.getHoTen(), 
                        sinhvien.getTuoi(), 
                        sinhvien.getEmail(),
                        sinhvien.getSoDT(),
                        sinhvien.getGioiTinh(), 
                        sinhvien.getDiaChi(), });
                    }
                }
            }else if(cbBox == "SDT"){
                tableModel.setRowCount(0);
                for (SinhVienDTO sinhvien: SinhVienBUS.dssv) {
                    if(sinhvien.getSoDT().contains(timKiem)){
                        tableModel.addRow(new Object[]{sinhvien.getMaSV(), 
                        sinhvien.getHoTen(), 
                        sinhvien.getTuoi(), 
                        sinhvien.getEmail(),
                        sinhvien.getSoDT(),
                        sinhvien.getGioiTinh(), 
                        sinhvien.getDiaChi(), });
                    }
                }
            }else if(cbBox == "Giới tính"){
                tableModel.setRowCount(0);
                for (SinhVienDTO sinhvien: SinhVienBUS.dssv) {
                    if(sinhvien.getGioiTinh().contains(timKiem)){
                        tableModel.addRow(new Object[]{sinhvien.getMaSV(), 
                        sinhvien.getHoTen(), 
                        sinhvien.getTuoi(), 
                        sinhvien.getEmail(),
                        sinhvien.getSoDT(),
                        sinhvien.getGioiTinh(), 
                        sinhvien.getDiaChi(), });
                    }
                }
            }else{
                tableModel.setRowCount(0);
                for (SinhVienDTO sinhvien: SinhVienBUS.dssv) {
                    if(sinhvien.getDiaChi().contains(timKiem)){
                        tableModel.addRow(new Object[]{sinhvien.getMaSV(), 
                        sinhvien.getHoTen(), 
                        sinhvien.getTuoi(), 
                        sinhvien.getEmail(),
                        sinhvien.getSoDT(),
                        sinhvien.getGioiTinh(), 
                        sinhvien.getDiaChi(), });
                    }
                }     
        } 
    }
    private void cbTimKiemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbTimKiemActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbTimKiemActionPerformed

    private void txtTimKiemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTimKiemActionPerformed
  
    }//GEN-LAST:event_txtTimKiemActionPerformed

    private void btnTimKiemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTimKiemActionPerformed
        String timKiem = txtTimKiem.getText();
        Object cbBox = cbTimKiem.getSelectedItem();
        timKiem(timKiem, cbBox);
    }//GEN-LAST:event_btnTimKiemActionPerformed
    int demNam;
    int demNu;
    private void thongKeGT(){
        demNam = 0;
        demNu = 0;
        for(SinhVienDTO sinhvien: SinhVienBUS.dssv){
            if (sinhvien.getGioiTinh().equals("Nam")){
                demNam = demNam + 1;
            }else if(sinhvien.getGioiTinh().equals("Nữ")){
                demNu = demNu + 1;
            }
        }     
    } 
    private void btnThongKeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThongKeActionPerformed
        // TODO add your handling code here:
        thongKeGT();
        txtThongKe.setText("Có "+demNam+ " Nam và "+demNu+" Nu");
    }//GEN-LAST:event_btnThongKeActionPerformed

    private void txtThongKeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtThongKeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtThongKeActionPerformed
    
    public void themAccountVaoTable(SinhVienDTO sv){
        DefaultTableModel table_acc = (DefaultTableModel) tbDS.getModel();
        table_acc.addRow(new Object[] {
                sv.getMaSV(), 
                sv.getHoTen(), 
                sv.getTuoi(), 
                sv.getEmail(),
                sv.getSoDT(),
                sv.getGioiTinh(), 
                sv.getDiaChi()
        });
    }
    private void excelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_excelActionPerformed
        File excelFile;
        FileInputStream excelFIS = null;
        BufferedInputStream excelBIS = null;
        XSSFWorkbook excelJTableImport = null;
        ArrayList<SinhVienDTO> listProductExcel = new ArrayList<SinhVienDTO>();
        JFileChooser jf = new JFileChooser();
        int result = jf.showOpenDialog(null);
        jf.setDialogTitle("Open file");
        Workbook workbook = null;
        if (result == JFileChooser.APPROVE_OPTION) {
            try {
                excelFile = jf.getSelectedFile();
                excelFIS = new FileInputStream(excelFile);
                excelBIS = new BufferedInputStream(excelFIS);

                excelJTableImport = new XSSFWorkbook(excelBIS);
                XSSFSheet excelSheet = excelJTableImport.getSheetAt(0);
                System.out.println("Excel:");
                for (int row = 1; row < excelSheet.getLastRowNum(); row++) {
                    XSSFRow excelRow = excelSheet.getRow(row);
                    String maSP = excelRow.getCell(1).getStringCellValue();
                    SinhVienDTO sv = SinhVienDAO.getInstance().selectById(maSP);
                    listProductExcel.add(sv);
                    SinhVienBUS bus = new SinhVienBUS();
                    bus.insert(sv);
                }
                showAll();
            } catch (FileNotFoundException ex) {
                Logger.getLogger(SinhVienGUI.class.getName()).log(Level.SEVERE, null, ex);
            } catch (IOException ex) {
                Logger.getLogger(SinhVienGUI.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_excelActionPerformed

    private void jButton1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MousePressed
        // TODO add your handling code here:
      
        
    }//GEN-LAST:event_jButton1MousePressed
    
    public static void main(String args[]) throws UnsupportedLookAndFeelException {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(SinhVienGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SinhVienGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SinhVienGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SinhVienGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        UIManager.setLookAndFeel(new FlatLightLaf());

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SinhVienGUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdd;
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnReset;
    private javax.swing.JButton btnThongKe;
    private javax.swing.JButton btnTimKiem;
    private javax.swing.JButton btnUpdate;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.ButtonGroup buttonGroup3;
    private javax.swing.ButtonGroup buttonGroup4;
    private javax.swing.ButtonGroup buttonGroup5;
    private javax.swing.JComboBox<String> cbTimKiem;
    private javax.swing.JCheckBox cbTuoi;
    private javax.swing.JButton excel;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JRadioButton radioBtnNam;
    private javax.swing.JRadioButton radioBtnNu;
    private javax.swing.JTable tbDS;
    private javax.swing.JTextField txtDiaChi;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtHoTen;
    private javax.swing.JTextField txtMaSV;
    private javax.swing.JTextField txtSDT;
    private javax.swing.JTextField txtThongKe;
    private javax.swing.JTextField txtTimKiem;
    // End of variables declaration//GEN-END:variables

    private void desplaydetails(int selectedRow) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
