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
public class ThongKeSachPn extends javax.swing.JPanel {

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
	public ThongKeSachPn() {
		list = new ArrayList<>();
		list = dao.selectAll();
		danhMucList = danhMucDao.selectAll();
		initComponents();
		initTbl(model, tblSach, headerTbl, list);
		initDanhMuc(danhMucList);
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
	private void initDanhMuc(ArrayList<DanhMuc> danhMucList){
		danhMucList.forEach((elmt) -> {
			cbLuaChon.addItem(elmt.getMaDanhMuc());
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
      jPanel4 = new javax.swing.JPanel();
      jSeparator4 = new javax.swing.JSeparator();
      lbTenSach = new javax.swing.JLabel();
      lbMaDanhMuc = new javax.swing.JLabel();
      lbMaSach = new javax.swing.JLabel();
      lbNxb = new javax.swing.JLabel();
      lbTacGia = new javax.swing.JLabel();
      lbSoLuong = new javax.swing.JLabel();
      jScrollPane2 = new javax.swing.JScrollPane();
      txtNdTomTat = new javax.swing.JTextArea();
      lbKetQua = new javax.swing.JLabel();
      cbLuaChon = new javax.swing.JComboBox<>();
      jLabel10 = new javax.swing.JLabel();

      setBackground(new java.awt.Color(255, 255, 204));

      jSeparator1.setOrientation(javax.swing.SwingConstants.VERTICAL);

      tblSach.setAutoCreateRowSorter(true);
      tblSach.setBackground(new java.awt.Color(255, 255, 204));
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

      lbTenSach.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N

      lbMaDanhMuc.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N

      lbMaSach.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N

      lbNxb.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N

      lbTacGia.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N

      lbSoLuong.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N

      txtNdTomTat.setColumns(20);
      txtNdTomTat.setFont(new java.awt.Font("Monospaced", 1, 18)); // NOI18N
      txtNdTomTat.setRows(5);
      jScrollPane2.setViewportView(txtNdTomTat);

      javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
      jPanel4.setLayout(jPanel4Layout);
      jPanel4Layout.setHorizontalGroup(
         jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
         .addComponent(jSeparator4)
         .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
            .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
               .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 370, Short.MAX_VALUE)
               .addGroup(jPanel4Layout.createSequentialGroup()
                  .addContainerGap()
                  .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                     .addComponent(lbMaDanhMuc, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                     .addComponent(lbMaSach, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                     .addComponent(lbTenSach, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                     .addComponent(lbTacGia, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                     .addComponent(lbSoLuong, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
            .addContainerGap())
         .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
               .addContainerGap()
               .addComponent(lbNxb, javax.swing.GroupLayout.DEFAULT_SIZE, 360, Short.MAX_VALUE)
               .addContainerGap()))
      );
      jPanel4Layout.setVerticalGroup(
         jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
         .addGroup(jPanel4Layout.createSequentialGroup()
            .addGap(38, 38, 38)
            .addComponent(lbMaSach, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
            .addComponent(lbTenSach, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGap(68, 68, 68)
            .addComponent(jSeparator4, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addComponent(lbMaDanhMuc, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
            .addComponent(lbTacGia, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
            .addComponent(lbSoLuong, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGap(43, 43, 43)
            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addContainerGap(81, Short.MAX_VALUE))
         .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
               .addGap(141, 141, 141)
               .addComponent(lbNxb, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
               .addContainerGap(453, Short.MAX_VALUE)))
      );

      lbKetQua.setBackground(new java.awt.Color(184, 152, 96));
      lbKetQua.setFont(new java.awt.Font("Tahoma", 3, 18)); // NOI18N
      lbKetQua.setText("KET QUA:");

      cbLuaChon.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
      cbLuaChon.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Top 3 sach duoc muon nhieu nhat" }));
      cbLuaChon.addActionListener(new java.awt.event.ActionListener() {
         public void actionPerformed(java.awt.event.ActionEvent evt) {
            cbLuaChonActionPerformed(evt);
         }
      });

      jLabel10.setBackground(new java.awt.Color(184, 152, 96));
      jLabel10.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
      jLabel10.setText("LUA CHON:");

      javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
      this.setLayout(layout);
      layout.setHorizontalGroup(
         layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
         .addGroup(layout.createSequentialGroup()
            .addGap(62, 62, 62)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
               .addComponent(jSeparator2)
               .addGroup(layout.createSequentialGroup()
                  .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                  .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                  .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                     .addComponent(lbKetQua, javax.swing.GroupLayout.PREFERRED_SIZE, 247, javax.swing.GroupLayout.PREFERRED_SIZE)
                     .addComponent(cbLuaChon, javax.swing.GroupLayout.PREFERRED_SIZE, 386, javax.swing.GroupLayout.PREFERRED_SIZE)))
               .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 971, Short.MAX_VALUE))
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGap(40, 40, 40))
      );
      layout.setVerticalGroup(
         layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
         .addGroup(layout.createSequentialGroup()
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
               .addGroup(layout.createSequentialGroup()
                  .addGap(31, 31, 31)
                  .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                     .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                     .addComponent(cbLuaChon, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                  .addGap(38, 38, 38)
                  .addComponent(lbKetQua, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                  .addGap(46, 46, 46)
                  .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                  .addGap(33, 33, 33)
                  .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 297, javax.swing.GroupLayout.PREFERRED_SIZE))
               .addGroup(layout.createSequentialGroup()
                  .addContainerGap()
                  .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                     .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 722, javax.swing.GroupLayout.PREFERRED_SIZE)
                     .addGroup(layout.createSequentialGroup()
                        .addGap(37, 37, 37)
                        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))
            .addContainerGap(63, Short.MAX_VALUE))
      );
   }// </editor-fold>//GEN-END:initComponents

   private void tblSachMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblSachMouseClicked
		int row = tblSach.getSelectedRow();
		if(row >= 0){
			Sach sach = dao.findById(tblSach.getValueAt(row, 0).toString());
			if(sach == null){
				System.out.println("hshahah");
			}
			if(sach != null){
				lbTenSach.setText("TEN SACH: " + sach.getTenSach());
				lbTacGia.setText("TAC GIA: " + sach.getTacGia());
				lbMaSach.setText("MA SACH: " + sach.getMaSach());
				lbMaDanhMuc.setText("MA DANH MUC: " + sach.getMaDanhMuc());
				lbSoLuong.setText("SO LUONG: " + sach.getSoluong());
				txtNdTomTat.setText("ND TOM TAT: " + sach.getNdTomTat());
				lbNxb.setText("NXB: " + sach.getNxb());
			}
		}
   }//GEN-LAST:event_tblSachMouseClicked

   private void cbLuaChonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbLuaChonActionPerformed
		int luaChon = cbLuaChon.getSelectedIndex();
		if(luaChon == 0){
			
		}
   }//GEN-LAST:event_cbLuaChonActionPerformed


   // Variables declaration - do not modify//GEN-BEGIN:variables
   private javax.swing.JComboBox<String> cbLuaChon;
   private javax.swing.JLabel jLabel10;
   private javax.swing.JPanel jPanel4;
   private javax.swing.JScrollPane jScrollPane1;
   private javax.swing.JScrollPane jScrollPane2;
   private javax.swing.JSeparator jSeparator1;
   private javax.swing.JSeparator jSeparator2;
   private javax.swing.JSeparator jSeparator4;
   private javax.swing.JLabel lbKetQua;
   private javax.swing.JLabel lbMaDanhMuc;
   private javax.swing.JLabel lbMaSach;
   private javax.swing.JLabel lbNxb;
   private javax.swing.JLabel lbSoLuong;
   private javax.swing.JLabel lbTacGia;
   private javax.swing.JLabel lbTenSach;
   private javax.swing.JTable tblSach;
   private javax.swing.JTextArea txtNdTomTat;
   // End of variables declaration//GEN-END:variables
}
