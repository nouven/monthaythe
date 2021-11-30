/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package views;

import controllers.DanhMucDao;
import controllers.DocGiaDao;
import controllers.SachDao;
import foo.Bar;
import foo.MessDialog;
import foo.Validator;
import java.util.ArrayList;
import java.sql.Date;
import java.time.LocalDate;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;
import models.DanhMuc;
import models.DocGia;
import models.Sach;

/**
 *
 * @author doquy
 */
public class QuanLiSachPn extends javax.swing.JPanel {

	/**
	 * Creates new form FisrtPn
	 */
	private ArrayList<Sach> list;
	private ArrayList<DanhMuc> danhMucList;
	private String[] headerTbl = {
		"MA SACH",
		"NXB",
		"MA DANH MUC",
		"TEN SACH",
		"TAC GIA",
		"SO LUONG",
		"NOI DUNG TOM TAT",
	};
	private DefaultTableModel model = new DefaultTableModel();
	private SachDao dao = new SachDao();
	private DanhMucDao danhMucDao = new DanhMucDao();
	private boolean toggleLuu = false;
	public QuanLiSachPn() {
		list = new ArrayList<>();
		list = dao.selectAll();
		danhMucList = danhMucDao.selectAll();
		initComponents();
		initTbl(model, tblSach, headerTbl, list);
		initDanhMuc(danhMucList);
		this.setDisable();
	}
	private void initTbl(DefaultTableModel model , JTable tbl, String[] headerTbl, ArrayList<Sach> list){
		model.setRowCount(0);
		model.setColumnIdentifiers(headerTbl);
		list.forEach((elmt) -> {
			model.addRow(new Object[]{
				elmt.getMaSach(),
				elmt.getNxb(),
				elmt.getMaDanhMuc(),
				elmt.getTenSach(),
				elmt.getTacGia(),
				elmt.getSoluong(),
				elmt.getNdTomTat(),
			});
		});
		tbl.setModel(model);
	}
	public void setEnable(){
		txtMaSach.setEnabled(true);
		txtNxb.setEnabled(true);
		cbMaDanhMuc.setEnabled(true);
		txtTenSach.setEnabled(true);
		txtTacGia.setEnabled(true);
		spnSoLuong.setEnabled(true);
		txtNdTomTat.setEnabled(true);
	}
	public void setDisable(){
		txtMaSach.setEnabled(true);
		txtNxb.setEnabled(false);
		cbMaDanhMuc.setEnabled(false);
		txtTenSach.setEnabled(false);
		txtTacGia.setEnabled(false);
		spnSoLuong.setEnabled(false);
		txtNdTomTat.setEnabled(false);
	}
	private void initDanhMuc(ArrayList<DanhMuc> danhMucList){
		danhMucList.forEach((elmt) -> {
			cbMaDanhMuc.addItem(elmt.getMaDanhMuc());
		});
	}
	/**
	 * This method is called from within the constructor to initialize the form.
	 * WARNING: Do NOT modify this code. The content of this method is always
	 * regenerated by the Form Editor.
	 */
	@SuppressWarnings("unchecked")
   // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
   private void initComponents() {

      jSeparator1 = new javax.swing.JSeparator();
      jSeparator2 = new javax.swing.JSeparator();
      jScrollPane1 = new javax.swing.JScrollPane();
      tblSach = new javax.swing.JTable();
      jSeparator3 = new javax.swing.JSeparator();
      jPanel4 = new javax.swing.JPanel();
      btnThem = new javax.swing.JButton();
      btnXoa = new javax.swing.JButton();
      btnTimKiem = new javax.swing.JButton();
      btnSua = new javax.swing.JButton();
      btnLuu = new javax.swing.JButton();
      jSeparator4 = new javax.swing.JSeparator();
      jPanel3 = new javax.swing.JPanel();
      jPanel2 = new javax.swing.JPanel();
      jLabel6 = new javax.swing.JLabel();
      txtMaSach = new javax.swing.JTextField();
      jPanel7 = new javax.swing.JPanel();
      jLabel8 = new javax.swing.JLabel();
      txtNxb = new javax.swing.JTextField();
      jPanel8 = new javax.swing.JPanel();
      jLabel9 = new javax.swing.JLabel();
      spnSoLuong = new javax.swing.JSpinner();
      jPanel9 = new javax.swing.JPanel();
      jLabel10 = new javax.swing.JLabel();
      cbMaDanhMuc = new javax.swing.JComboBox<>();
      jPanel11 = new javax.swing.JPanel();
      jLabel12 = new javax.swing.JLabel();
      jTextField8 = new javax.swing.JTextField();
      jPanel12 = new javax.swing.JPanel();
      jPanel13 = new javax.swing.JPanel();
      jLabel13 = new javax.swing.JLabel();
      txtTenSach = new javax.swing.JTextField();
      jPanel14 = new javax.swing.JPanel();
      jLabel14 = new javax.swing.JLabel();
      txtTacGia = new javax.swing.JTextField();
      jPanel16 = new javax.swing.JPanel();
      jLabel16 = new javax.swing.JLabel();
      jScrollPane2 = new javax.swing.JScrollPane();
      txtNdTomTat = new javax.swing.JTextArea();

      jSeparator1.setOrientation(javax.swing.SwingConstants.VERTICAL);

      tblSach.setAutoCreateRowSorter(true);
      tblSach.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
      tblSach.setModel(new javax.swing.table.DefaultTableModel(
         new Object [][] {

         },
         new String [] {

         }
      ));
      tblSach.setAlignmentX(1.0F);
      tblSach.setAlignmentY(1.0F);
      tblSach.setRowHeight(30);
      tblSach.setRowMargin(3);
      tblSach.setShowGrid(true);
      tblSach.addMouseListener(new java.awt.event.MouseAdapter() {
         public void mouseClicked(java.awt.event.MouseEvent evt) {
            tblSachMouseClicked(evt);
         }
      });
      jScrollPane1.setViewportView(tblSach);

      jSeparator3.setOrientation(javax.swing.SwingConstants.VERTICAL);

      btnThem.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
      btnThem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/plus.png"))); // NOI18N
      btnThem.setText("THEM");
      btnThem.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
      btnThem.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
      btnThem.setIconTextGap(20);
      btnThem.addActionListener(new java.awt.event.ActionListener() {
         public void actionPerformed(java.awt.event.ActionEvent evt) {
            btnThemActionPerformed(evt);
         }
      });

      btnXoa.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
      btnXoa.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/remove (1).png"))); // NOI18N
      btnXoa.setText("XOA");
      btnXoa.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
      btnXoa.setIconTextGap(20);
      btnXoa.addActionListener(new java.awt.event.ActionListener() {
         public void actionPerformed(java.awt.event.ActionEvent evt) {
            btnXoaActionPerformed(evt);
         }
      });

      btnTimKiem.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
      btnTimKiem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/searching.png"))); // NOI18N
      btnTimKiem.setText("TIM KIEM");
      btnTimKiem.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
      btnTimKiem.setIconTextGap(20);
      btnTimKiem.addActionListener(new java.awt.event.ActionListener() {
         public void actionPerformed(java.awt.event.ActionEvent evt) {
            btnTimKiemActionPerformed(evt);
         }
      });

      btnSua.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
      btnSua.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/sua.png"))); // NOI18N
      btnSua.setText("SUA");
      btnSua.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
      btnSua.setIconTextGap(20);
      btnSua.addActionListener(new java.awt.event.ActionListener() {
         public void actionPerformed(java.awt.event.ActionEvent evt) {
            btnSuaActionPerformed(evt);
         }
      });

      btnLuu.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
      btnLuu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/luu.png"))); // NOI18N
      btnLuu.setText("LUU");
      btnLuu.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
      btnLuu.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
      btnLuu.setIconTextGap(20);
      btnLuu.addActionListener(new java.awt.event.ActionListener() {
         public void actionPerformed(java.awt.event.ActionEvent evt) {
            btnLuuActionPerformed(evt);
         }
      });

      javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
      jPanel4.setLayout(jPanel4Layout);
      jPanel4Layout.setHorizontalGroup(
         jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
         .addComponent(btnThem, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
         .addComponent(btnXoa, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
         .addComponent(btnTimKiem, javax.swing.GroupLayout.DEFAULT_SIZE, 190, Short.MAX_VALUE)
         .addComponent(btnLuu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
         .addComponent(jSeparator4)
         .addComponent(btnSua, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
      );
      jPanel4Layout.setVerticalGroup(
         jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
         .addGroup(jPanel4Layout.createSequentialGroup()
            .addContainerGap()
            .addComponent(btnThem, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGap(18, 18, 18)
            .addComponent(btnSua, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGap(74, 74, 74)
            .addComponent(jSeparator4, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGap(18, 18, 18)
            .addComponent(btnLuu, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGap(36, 36, 36)
            .addComponent(btnXoa, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGap(111, 111, 111)
            .addComponent(btnTimKiem, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addContainerGap(167, Short.MAX_VALUE))
      );

      jLabel6.setBackground(new java.awt.Color(184, 152, 96));
      jLabel6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
      jLabel6.setText("MA SACH");

      txtMaSach.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
      txtMaSach.addActionListener(new java.awt.event.ActionListener() {
         public void actionPerformed(java.awt.event.ActionEvent evt) {
            txtMaSachActionPerformed(evt);
         }
      });

      javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
      jPanel2.setLayout(jPanel2Layout);
      jPanel2Layout.setHorizontalGroup(
         jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
         .addGroup(jPanel2Layout.createSequentialGroup()
            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
            .addComponent(txtMaSach))
      );
      jPanel2Layout.setVerticalGroup(
         jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
         .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
            .addComponent(jLabel6)
            .addComponent(txtMaSach, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
      );

      jLabel8.setBackground(new java.awt.Color(184, 152, 96));
      jLabel8.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
      jLabel8.setText("NXB");

      txtNxb.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
      txtNxb.addActionListener(new java.awt.event.ActionListener() {
         public void actionPerformed(java.awt.event.ActionEvent evt) {
            txtNxbActionPerformed(evt);
         }
      });

      javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
      jPanel7.setLayout(jPanel7Layout);
      jPanel7Layout.setHorizontalGroup(
         jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
         .addGroup(jPanel7Layout.createSequentialGroup()
            .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
            .addComponent(txtNxb))
      );
      jPanel7Layout.setVerticalGroup(
         jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
         .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
            .addComponent(jLabel8)
            .addComponent(txtNxb, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
      );

      jLabel9.setBackground(new java.awt.Color(184, 152, 96));
      jLabel9.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
      jLabel9.setText("SO LUONG");

      spnSoLuong.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N

      javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
      jPanel8.setLayout(jPanel8Layout);
      jPanel8Layout.setHorizontalGroup(
         jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
         .addGroup(jPanel8Layout.createSequentialGroup()
            .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGap(107, 107, 107)
            .addComponent(spnSoLuong, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
      );
      jPanel8Layout.setVerticalGroup(
         jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
         .addGroup(jPanel8Layout.createSequentialGroup()
            .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
               .addComponent(spnSoLuong, javax.swing.GroupLayout.Alignment.LEADING)
               .addComponent(jLabel9, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 43, Short.MAX_VALUE))
            .addGap(0, 0, Short.MAX_VALUE))
      );

      jLabel10.setBackground(new java.awt.Color(184, 152, 96));
      jLabel10.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
      jLabel10.setText("MA DANH MUC");

      cbMaDanhMuc.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
      cbMaDanhMuc.addActionListener(new java.awt.event.ActionListener() {
         public void actionPerformed(java.awt.event.ActionEvent evt) {
            cbMaDanhMucActionPerformed(evt);
         }
      });

      javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
      jPanel9.setLayout(jPanel9Layout);
      jPanel9Layout.setHorizontalGroup(
         jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
         .addGroup(jPanel9Layout.createSequentialGroup()
            .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
            .addComponent(cbMaDanhMuc, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
      );
      jPanel9Layout.setVerticalGroup(
         jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
         .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
            .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(cbMaDanhMuc, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
      );

      jLabel12.setBackground(new java.awt.Color(184, 152, 96));
      jLabel12.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
      jLabel12.setText("jLabel5");

      jTextField8.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
      jTextField8.setText("jTextField1");
      jTextField8.addActionListener(new java.awt.event.ActionListener() {
         public void actionPerformed(java.awt.event.ActionEvent evt) {
            jTextField8ActionPerformed(evt);
         }
      });

      javax.swing.GroupLayout jPanel11Layout = new javax.swing.GroupLayout(jPanel11);
      jPanel11.setLayout(jPanel11Layout);
      jPanel11Layout.setHorizontalGroup(
         jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
         .addGroup(jPanel11Layout.createSequentialGroup()
            .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
            .addComponent(jTextField8, javax.swing.GroupLayout.DEFAULT_SIZE, 465, Short.MAX_VALUE))
      );
      jPanel11Layout.setVerticalGroup(
         jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
         .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
            .addComponent(jLabel12)
            .addComponent(jTextField8, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
      );

      javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
      jPanel3.setLayout(jPanel3Layout);
      jPanel3Layout.setHorizontalGroup(
         jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
         .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
         .addComponent(jPanel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
         .addComponent(jPanel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
         .addComponent(jPanel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
         .addComponent(jPanel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
      );
      jPanel3Layout.setVerticalGroup(
         jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
         .addGroup(jPanel3Layout.createSequentialGroup()
            .addContainerGap()
            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGap(18, 18, 18)
            .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGap(36, 36, 36)
            .addComponent(jPanel9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGap(41, 41, 41)
            .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGap(34, 34, 34)
            .addComponent(jPanel11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addContainerGap(105, Short.MAX_VALUE))
      );

      jLabel13.setBackground(new java.awt.Color(184, 152, 96));
      jLabel13.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
      jLabel13.setText("TEN SACH");

      txtTenSach.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
      txtTenSach.addActionListener(new java.awt.event.ActionListener() {
         public void actionPerformed(java.awt.event.ActionEvent evt) {
            txtTenSachActionPerformed(evt);
         }
      });

      javax.swing.GroupLayout jPanel13Layout = new javax.swing.GroupLayout(jPanel13);
      jPanel13.setLayout(jPanel13Layout);
      jPanel13Layout.setHorizontalGroup(
         jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
         .addGroup(jPanel13Layout.createSequentialGroup()
            .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
            .addComponent(txtTenSach))
      );
      jPanel13Layout.setVerticalGroup(
         jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
         .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
            .addComponent(jLabel13)
            .addComponent(txtTenSach, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
      );

      jLabel14.setBackground(new java.awt.Color(184, 152, 96));
      jLabel14.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
      jLabel14.setText("TAC GIA");

      txtTacGia.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
      txtTacGia.addActionListener(new java.awt.event.ActionListener() {
         public void actionPerformed(java.awt.event.ActionEvent evt) {
            txtTacGiaActionPerformed(evt);
         }
      });

      javax.swing.GroupLayout jPanel14Layout = new javax.swing.GroupLayout(jPanel14);
      jPanel14.setLayout(jPanel14Layout);
      jPanel14Layout.setHorizontalGroup(
         jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
         .addGroup(jPanel14Layout.createSequentialGroup()
            .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
            .addComponent(txtTacGia))
      );
      jPanel14Layout.setVerticalGroup(
         jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
         .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
            .addComponent(jLabel14)
            .addComponent(txtTacGia, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
      );

      jLabel16.setBackground(new java.awt.Color(184, 152, 96));
      jLabel16.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
      jLabel16.setText("NOI DUNG TT");

      txtNdTomTat.setColumns(20);
      txtNdTomTat.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
      txtNdTomTat.setRows(5);
      jScrollPane2.setViewportView(txtNdTomTat);

      javax.swing.GroupLayout jPanel16Layout = new javax.swing.GroupLayout(jPanel16);
      jPanel16.setLayout(jPanel16Layout);
      jPanel16Layout.setHorizontalGroup(
         jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
         .addGroup(jPanel16Layout.createSequentialGroup()
            .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
            .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 465, Short.MAX_VALUE))
      );
      jPanel16Layout.setVerticalGroup(
         jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
         .addGroup(jPanel16Layout.createSequentialGroup()
            .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
         .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 218, Short.MAX_VALUE)
      );

      javax.swing.GroupLayout jPanel12Layout = new javax.swing.GroupLayout(jPanel12);
      jPanel12.setLayout(jPanel12Layout);
      jPanel12Layout.setHorizontalGroup(
         jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
         .addComponent(jPanel13, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
         .addComponent(jPanel14, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
         .addComponent(jPanel16, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
      );
      jPanel12Layout.setVerticalGroup(
         jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
         .addGroup(jPanel12Layout.createSequentialGroup()
            .addContainerGap()
            .addComponent(jPanel13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGap(18, 18, 18)
            .addComponent(jPanel14, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGap(41, 41, 41)
            .addComponent(jPanel16, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addContainerGap(109, Short.MAX_VALUE))
      );

      javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
      this.setLayout(layout);
      layout.setHorizontalGroup(
         layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
         .addGroup(layout.createSequentialGroup()
            .addContainerGap()
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
               .addGroup(layout.createSequentialGroup()
                  .addGap(168, 168, 168)
                  .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 965, javax.swing.GroupLayout.PREFERRED_SIZE))
               .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                  .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING)
                  .addGroup(layout.createSequentialGroup()
                     .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                     .addGap(54, 54, 54)
                     .addComponent(jPanel12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
            .addGap(75, 75, 75)
            .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addContainerGap(82, Short.MAX_VALUE))
         .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
               .addGap(647, 647, 647)
               .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
               .addContainerGap(997, Short.MAX_VALUE)))
      );
      layout.setVerticalGroup(
         layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
         .addGroup(layout.createSequentialGroup()
            .addGap(29, 29, 29)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
               .addGroup(layout.createSequentialGroup()
                  .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                     .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                     .addComponent(jPanel12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                  .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                  .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                  .addGap(36, 36, 36)
                  .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 323, javax.swing.GroupLayout.PREFERRED_SIZE)
                  .addGap(67, 67, 67))
               .addGroup(layout.createSequentialGroup()
                  .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                  .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
         .addComponent(jSeparator1)
         .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
               .addGap(21, 21, 21)
               .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 467, javax.swing.GroupLayout.PREFERRED_SIZE)
               .addContainerGap(466, Short.MAX_VALUE)))
      );
   }// </editor-fold>//GEN-END:initComponents

   private void txtMaSachActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtMaSachActionPerformed
      // TODO add your handling code here:
   }//GEN-LAST:event_txtMaSachActionPerformed

   private void txtNxbActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNxbActionPerformed
      // TODO add your handling code here:
   }//GEN-LAST:event_txtNxbActionPerformed

   private void jTextField8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField8ActionPerformed
      // TODO add your handling code here:
   }//GEN-LAST:event_jTextField8ActionPerformed

   private void txtTenSachActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTenSachActionPerformed
      // TODO add your handling code here:
   }//GEN-LAST:event_txtTenSachActionPerformed

   private void txtTacGiaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTacGiaActionPerformed
      // TODO add your handling code here:
   }//GEN-LAST:event_txtTacGiaActionPerformed

   private void btnThemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThemActionPerformed
		btnLuu.setEnabled(true);
		toggleLuu = false;
		JTextField[] listTxt = {
   		txtMaSach,
   		txtNxb,
   		txtTacGia,
   		txtTenSach,
		};
		Bar.resetTxt(listTxt);
		txtNdTomTat.setText("");
		this.setEnable();
   }//GEN-LAST:event_btnThemActionPerformed

   private void tblSachMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblSachMouseClicked
		this.setDisable();
		int row = tblSach.getSelectedRow();
		if(row > 0){
			Sach sach = dao.findById(tblSach.getValueAt(row, 0).toString());
			if(sach == null){
				System.out.println("hshahah");
			}
			if(sach != null){
   			txtMaSach.setText(sach.getMaSach());
   			txtTacGia.setText(sach.getTacGia());
   			txtNxb.setText(sach.getNxb());
				txtTenSach.setText(sach.getTenSach());
   			txtNdTomTat.setText(sach.getNdTomTat());
				spnSoLuong.setValue(sach.getSoluong());
			}
		}
   }//GEN-LAST:event_tblSachMouseClicked

   private void btnLuuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLuuActionPerformed
		JTextField[] listTxt = {
   		txtTacGia,
   		txtNxb,
   		txtMaSach,
   		txtTenSach,
		};
		boolean bl = true;
		for(JTextField i: listTxt){
			if(i.getText().equals("")){
				MessDialog.showErrorDialog(this, "CAN NHAP DAY DU CAC TRUONG!!", "ERROR");
				return;
			}
		}
		String maSach = txtMaSach.getText();
		String nxb = txtNxb.getText();
		String maDanhMuc = cbMaDanhMuc.getItemAt(cbMaDanhMuc.getSelectedIndex());
		String tenSach = txtTenSach.getText();
		String tacGia = txtTacGia.getText();
		int soLuong = (int) spnSoLuong.getValue();
		String ndTomTat = txtNdTomTat.getText();
		Sach sach = new Sach(maSach, nxb, maDanhMuc, tenSach, tacGia, soLuong, ndTomTat);
		if(toggleLuu == false){
			boolean isInsert = dao.insert(sach);
			if(isInsert == true){
				MessDialog.showMessDialog(this , "THEM THANH CONG!!", "INFO");
				list = dao.selectAll();
				initTbl(model, tblSach, headerTbl, list);
				this.setDisable();
			}else{
				MessDialog.showErrorDialog(this, "THEM THAT BAI!!", "ERROR");
			}
		}else{
			int choose = MessDialog.showComfirmDialog(this, "SUA?", "COMFIRM");
			if(choose == 0){
				boolean isUpdate= dao.update(sach);
				if(isUpdate == true){
					MessDialog.showMessDialog(this , "SUA THANH CONG!!", "INFO");
					list = dao.selectAll();
					initTbl(model, tblSach, headerTbl, list);
					this.setDisable();
				}else{
					MessDialog.showErrorDialog(this, "SUA THAT BAI!!", "ERROR");
				}
			}
		}
		
   }//GEN-LAST:event_btnLuuActionPerformed

   private void btnSuaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSuaActionPerformed
		this.setEnable();
		txtMaSach.setEnabled(false);
		toggleLuu = true;
   }//GEN-LAST:event_btnSuaActionPerformed

   private void btnXoaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnXoaActionPerformed
		String maDocGia = txtMaSach.getText();
		if(maDocGia.equals("")){
			MessDialog.showErrorDialog(this, "CAN CHON MA SACH DE XOA", "ERROR");
			return;
		}
		int choose = MessDialog.showComfirmDialog(this, "XOA ?", "COMFIRM");
		if(choose == 0){
			boolean isDelete = dao.delete(maDocGia);
			if(isDelete == true){
				list = dao.selectAll();
				initTbl(model, tblSach, headerTbl, list);
				MessDialog.showMessDialog(this, "XOA THANH CONG!!!", "INFO");
			}else{
				MessDialog.showErrorDialog(this, "THAT BAI!!!", "ERROR");
			}
		}
   }//GEN-LAST:event_btnXoaActionPerformed

   private void cbMaDanhMucActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbMaDanhMucActionPerformed
      // TODO add your handling code here:
   }//GEN-LAST:event_cbMaDanhMucActionPerformed

   private void btnTimKiemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTimKiemActionPerformed
		String maSach = txtMaSach.getText();
		if(maSach.equals("")){
			MessDialog.showErrorDialog(this, "CAN NHAP MA DOC GIA!!", "ERROR");
			return;
		}
		Sach sach = dao.findById(maSach);
		if(sach == null){
			MessDialog.showMessDialog(this, "KHONG TIM THAY SACH!!", "ERROR");
		}else{
   			txtMaSach.setText(sach.getMaSach());
   			txtTacGia.setText(sach.getTacGia());
   			txtNxb.setText(sach.getNxb());
				txtTenSach.setText(sach.getTenSach());
   			txtNdTomTat.setText(sach.getNdTomTat());
				spnSoLuong.setValue(sach.getSoluong());
		}
   }//GEN-LAST:event_btnTimKiemActionPerformed


   // Variables declaration - do not modify//GEN-BEGIN:variables
   private javax.swing.JButton btnLuu;
   private javax.swing.JButton btnSua;
   private javax.swing.JButton btnThem;
   private javax.swing.JButton btnTimKiem;
   private javax.swing.JButton btnXoa;
   private javax.swing.JComboBox<String> cbMaDanhMuc;
   private javax.swing.JLabel jLabel10;
   private javax.swing.JLabel jLabel12;
   private javax.swing.JLabel jLabel13;
   private javax.swing.JLabel jLabel14;
   private javax.swing.JLabel jLabel16;
   private javax.swing.JLabel jLabel6;
   private javax.swing.JLabel jLabel8;
   private javax.swing.JLabel jLabel9;
   private javax.swing.JPanel jPanel11;
   private javax.swing.JPanel jPanel12;
   private javax.swing.JPanel jPanel13;
   private javax.swing.JPanel jPanel14;
   private javax.swing.JPanel jPanel16;
   private javax.swing.JPanel jPanel2;
   private javax.swing.JPanel jPanel3;
   private javax.swing.JPanel jPanel4;
   private javax.swing.JPanel jPanel7;
   private javax.swing.JPanel jPanel8;
   private javax.swing.JPanel jPanel9;
   private javax.swing.JScrollPane jScrollPane1;
   private javax.swing.JScrollPane jScrollPane2;
   private javax.swing.JSeparator jSeparator1;
   private javax.swing.JSeparator jSeparator2;
   private javax.swing.JSeparator jSeparator3;
   private javax.swing.JSeparator jSeparator4;
   private javax.swing.JTextField jTextField8;
   private javax.swing.JSpinner spnSoLuong;
   private javax.swing.JTable tblSach;
   private javax.swing.JTextField txtMaSach;
   private javax.swing.JTextArea txtNdTomTat;
   private javax.swing.JTextField txtNxb;
   private javax.swing.JTextField txtTacGia;
   private javax.swing.JTextField txtTenSach;
   // End of variables declaration//GEN-END:variables
}
