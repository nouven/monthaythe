/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package views;

import controllers.DocGiaDao;
import controllers.MuonTraDao;
import foo.Bar;
import foo.MessDialog;
import foo.Validator;
import java.util.ArrayList;
import java.sql.Date;
import java.time.LocalDate;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;
import models.DocGia;

/**
 *
 * @author doquy
 */
public class TraCuuDocGiaPn extends javax.swing.JPanel {

	/**
	 * Creates new form FisrtPn
	 */
	private ArrayList<DocGia> list;
	private String[] headerTbl = {
		"MA DOC GIA",
		"HO TEN",
		"NGAY SINH",
		"GIOI TINH",
		"EMAIL",
		"DIA CHI"
	};
	private DefaultTableModel model = new DefaultTableModel();
	private DocGiaDao dao = new DocGiaDao();
	private MuonTraDao muonTraDao = new MuonTraDao();
	private boolean  toggleLuu = false;
	public TraCuuDocGiaPn() {
		list = new ArrayList<>();
		list = dao.selectAll();
		initComponents();
		initTbl(model, tblDocGia, headerTbl, list);
	}
	private void initTbl(DefaultTableModel model , JTable tbl, String[] headerTbl, ArrayList<DocGia> list){
		model.setRowCount(0);
		model.setColumnIdentifiers(headerTbl);
		list.forEach((elmt) -> {
			String gioiTinh = "Nam";
			if(elmt.getGoiTinh() == 0){
				gioiTinh = "nu";
			}
			model.addRow(new Object[]{
				elmt.getMaDocGia(),
				elmt.getHoTen(),
				elmt.getNgaySinh(),
				gioiTinh,
				elmt.getEmail(),
				elmt.getDiaChi(),
			});
		});
		tbl.setModel(model);
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
      tblDocGia = new javax.swing.JTable();
      jPanel4 = new javax.swing.JPanel();
      lbHoTen = new javax.swing.JLabel();
      lbGioiTinh = new javax.swing.JLabel();
      lbMaDocGia = new javax.swing.JLabel();
      lbNgaySinh = new javax.swing.JLabel();
      lbSdt = new javax.swing.JLabel();
      lbEmail = new javax.swing.JLabel();
      lbSoSachDaTra = new javax.swing.JLabel();
      lbDiaChi1 = new javax.swing.JLabel();
      lbKetQua = new javax.swing.JLabel();
      jLabel9 = new javax.swing.JLabel();
      txtHoTen = new javax.swing.JTextField();

      setBackground(new java.awt.Color(255, 255, 204));

      jSeparator1.setOrientation(javax.swing.SwingConstants.VERTICAL);

      tblDocGia.setAutoCreateRowSorter(true);
      tblDocGia.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
      tblDocGia.setModel(new javax.swing.table.DefaultTableModel(
         new Object [][] {

         },
         new String [] {

         }
      ));
      tblDocGia.setAlignmentX(1.0F);
      tblDocGia.setAlignmentY(1.0F);
      tblDocGia.setMinimumSize(new java.awt.Dimension(5, 5));
      tblDocGia.setRowHeight(30);
      tblDocGia.setRowMargin(2);
      tblDocGia.setShowGrid(true);
      tblDocGia.addMouseListener(new java.awt.event.MouseAdapter() {
         public void mouseClicked(java.awt.event.MouseEvent evt) {
            tblDocGiaMouseClicked(evt);
         }
      });
      jScrollPane1.setViewportView(tblDocGia);

      lbHoTen.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N

      lbGioiTinh.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N

      lbMaDocGia.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N

      lbNgaySinh.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N

      lbSdt.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N

      lbEmail.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N

      lbSoSachDaTra.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N

      lbDiaChi1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N

      javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
      jPanel4.setLayout(jPanel4Layout);
      jPanel4Layout.setHorizontalGroup(
         jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
         .addGroup(jPanel4Layout.createSequentialGroup()
            .addContainerGap()
            .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
               .addComponent(lbGioiTinh, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
               .addComponent(lbMaDocGia, javax.swing.GroupLayout.DEFAULT_SIZE, 345, Short.MAX_VALUE)
               .addComponent(lbHoTen, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
               .addComponent(lbSdt, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
               .addComponent(lbEmail, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
               .addComponent(lbSoSachDaTra, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
               .addComponent(lbDiaChi1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addContainerGap())
         .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
               .addContainerGap()
               .addComponent(lbNgaySinh, javax.swing.GroupLayout.DEFAULT_SIZE, 345, Short.MAX_VALUE)
               .addContainerGap()))
      );
      jPanel4Layout.setVerticalGroup(
         jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
         .addGroup(jPanel4Layout.createSequentialGroup()
            .addGap(38, 38, 38)
            .addComponent(lbMaDocGia, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
            .addComponent(lbHoTen, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGap(95, 95, 95)
            .addComponent(lbGioiTinh, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
            .addComponent(lbSdt, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
            .addComponent(lbEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGap(84, 84, 84)
            .addComponent(lbSoSachDaTra, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
            .addComponent(lbDiaChi1, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addContainerGap(59, Short.MAX_VALUE))
         .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
               .addGap(141, 141, 141)
               .addComponent(lbNgaySinh, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
               .addContainerGap(404, Short.MAX_VALUE)))
      );

      lbKetQua.setBackground(new java.awt.Color(184, 152, 96));
      lbKetQua.setFont(new java.awt.Font("Tahoma", 3, 18)); // NOI18N
      lbKetQua.setText("KET QUA TIM KIEM: ");

      jLabel9.setBackground(new java.awt.Color(184, 152, 96));
      jLabel9.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
      jLabel9.setText("TEN DOC GIA: ");

      txtHoTen.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
      txtHoTen.addActionListener(new java.awt.event.ActionListener() {
         public void actionPerformed(java.awt.event.ActionEvent evt) {
            txtHoTenActionPerformed(evt);
         }
      });
      txtHoTen.addKeyListener(new java.awt.event.KeyAdapter() {
         public void keyTyped(java.awt.event.KeyEvent evt) {
            txtHoTenKeyTyped(evt);
         }
      });

      javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
      this.setLayout(layout);
      layout.setHorizontalGroup(
         layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
         .addGroup(layout.createSequentialGroup()
            .addGap(18, 18, 18)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
               .addGroup(layout.createSequentialGroup()
                  .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                  .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                  .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                     .addComponent(lbKetQua, javax.swing.GroupLayout.PREFERRED_SIZE, 353, javax.swing.GroupLayout.PREFERRED_SIZE)
                     .addComponent(txtHoTen, javax.swing.GroupLayout.PREFERRED_SIZE, 248, javax.swing.GroupLayout.PREFERRED_SIZE)))
               .addComponent(jScrollPane1)
               .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 966, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 41, Short.MAX_VALUE)
            .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGap(100, 100, 100))
      );
      layout.setVerticalGroup(
         layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
         .addGroup(layout.createSequentialGroup()
            .addGap(19, 19, 19)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
               .addGroup(layout.createSequentialGroup()
                  .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                     .addComponent(txtHoTen, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                     .addComponent(jLabel9))
                  .addGap(30, 30, 30)
                  .addComponent(lbKetQua, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                  .addGap(77, 77, 77)
                  .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                  .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                  .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 438, javax.swing.GroupLayout.PREFERRED_SIZE))
               .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 682, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addContainerGap(99, Short.MAX_VALUE))
         .addGroup(layout.createSequentialGroup()
            .addGap(74, 74, 74)
            .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
      );
   }// </editor-fold>//GEN-END:initComponents

   private void txtHoTenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtHoTenActionPerformed
      // TODO add your handling code here:
   }//GEN-LAST:event_txtHoTenActionPerformed

   private void tblDocGiaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblDocGiaMouseClicked
		int row = tblDocGia.getSelectedRow();
		if(row >= 0){
			DocGia docGia = dao.findById(tblDocGia.getValueAt(row, 0).toString());
			if(docGia == null){
				System.out.println("hshahah");
			}
			if(docGia != null){
				if(docGia.getGoiTinh() == 1){
					lbGioiTinh.setText("GIOI TINH: NAM");
				}else{
					lbGioiTinh.setText("GIOI TINH: NAM");
				}
   			lbSoSachDaTra.setText("DIA CHI: \t\t"+ docGia.getDiaChi());
   			lbEmail.setText("EMAIL: \t\t"+docGia.getEmail());
   			lbHoTen.setText("HO TEN: \t\t" + docGia.getHoTen());
   			lbMaDocGia.setText("MA DOC GIA: \t\t" + docGia.getMaDocGia());
   			lbNgaySinh.setText("NGAY SINH: \t\t" + docGia.getNgaySinh().toString());
   			lbSdt.setText("SDT: " + docGia.getSdt());
				int slDaMuon = muonTraDao.countDaMuon(docGia.getMaDocGia());
				int slDaTra  = muonTraDao.countDaTra(docGia.getMaDocGia());
				lbSoSachDaTra.setText(String.valueOf("SO SACH DA TRA: " + slDaTra + "/" + slDaMuon));
			}
		}
   }//GEN-LAST:event_tblDocGiaMouseClicked

   private void txtHoTenKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtHoTenKeyTyped
		String hoTen =  txtHoTen.getText();
		ArrayList<DocGia> docGiaList = dao.findByName(hoTen);
		if(docGiaList == null){
			lbKetQua.setText("KET QUA TIM KIEM: 0");
		}else{
			lbKetQua.setText("KET QUA TIM KIEM: " + docGiaList.size());
			initTbl(model, tblDocGia, headerTbl, docGiaList);
		}
		
   }//GEN-LAST:event_txtHoTenKeyTyped


   // Variables declaration - do not modify//GEN-BEGIN:variables
   private javax.swing.JLabel jLabel9;
   private javax.swing.JPanel jPanel4;
   private javax.swing.JScrollPane jScrollPane1;
   private javax.swing.JSeparator jSeparator1;
   private javax.swing.JSeparator jSeparator2;
   private javax.swing.JLabel lbDiaChi1;
   private javax.swing.JLabel lbEmail;
   private javax.swing.JLabel lbGioiTinh;
   private javax.swing.JLabel lbHoTen;
   private javax.swing.JLabel lbKetQua;
   private javax.swing.JLabel lbMaDocGia;
   private javax.swing.JLabel lbNgaySinh;
   private javax.swing.JLabel lbSdt;
   private javax.swing.JLabel lbSoSachDaTra;
   private javax.swing.JTable tblDocGia;
   private javax.swing.JTextField txtHoTen;
   // End of variables declaration//GEN-END:variables
}
