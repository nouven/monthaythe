/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package views;

import controllers.DocGiaDao;
import java.sql.Date;
import models.DocGia;

/**
 *
 * @author doquy
 */
public class mainFrm extends javax.swing.JFrame {

	/**
	 * Creates new form mainFrm
	 */
	private  FisrtPn firstpn;
	private String maThuThu;
	public mainFrm(String maThuThu, String hoTen) {
		initComponents();
		this.setLocationRelativeTo(null);
		this.setExtendedState(this.MAXIMIZED_BOTH);
		this.maThuThu = maThuThu;
		lbMaThuThu.setText(maThuThu.toUpperCase());
		lbHoTen.setText(hoTen.toUpperCase());
	}

	/**
	 * This method is called from within the constructor to initialize the form.
	 * WARNING: Do NOT modify this code. The content of this method is always
	 * regenerated by the Form Editor.
	 */
	@SuppressWarnings("unchecked")
   // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
   private void initComponents() {

      jFrame1 = new javax.swing.JFrame();
      tpnMain = new javax.swing.JTabbedPane();
      jSeparator3 = new javax.swing.JSeparator();
      jPanel1 = new javax.swing.JPanel();
      btnQuanLiSach = new javax.swing.JButton();
      btnQuanLiDocGia = new javax.swing.JButton();
      btnQuanLiMuonTra = new javax.swing.JButton();
      btnThongKe = new javax.swing.JButton();
      btnTraCuu = new javax.swing.JButton();
      jPanel2 = new javax.swing.JPanel();
      jLabel1 = new javax.swing.JLabel();
      jLabel2 = new javax.swing.JLabel();
      jSeparator2 = new javax.swing.JSeparator();
      lbHoTen = new javax.swing.JLabel();
      lbMaThuThu = new javax.swing.JLabel();
      btnLogout = new javax.swing.JButton();

      javax.swing.GroupLayout jFrame1Layout = new javax.swing.GroupLayout(jFrame1.getContentPane());
      jFrame1.getContentPane().setLayout(jFrame1Layout);
      jFrame1Layout.setHorizontalGroup(
         jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
         .addGap(0, 400, Short.MAX_VALUE)
      );
      jFrame1Layout.setVerticalGroup(
         jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
         .addGap(0, 300, Short.MAX_VALUE)
      );

      setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
      setTitle("QUAN LY THU VIEN");

      tpnMain.setBorder(new javax.swing.border.MatteBorder(null));

      jSeparator3.setOrientation(javax.swing.SwingConstants.VERTICAL);

      jPanel1.setBackground(new java.awt.Color(204, 204, 255));

      btnQuanLiSach.setFont(new java.awt.Font("Sitka Text", 1, 18)); // NOI18N
      btnQuanLiSach.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/book.png"))); // NOI18N
      btnQuanLiSach.setText("QUAN LI SACH");
      btnQuanLiSach.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
      btnQuanLiSach.setFocusable(false);
      btnQuanLiSach.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
      btnQuanLiSach.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
      btnQuanLiSach.setIconTextGap(20);
      btnQuanLiSach.setVerifyInputWhenFocusTarget(false);
      btnQuanLiSach.addActionListener(new java.awt.event.ActionListener() {
         public void actionPerformed(java.awt.event.ActionEvent evt) {
            btnQuanLiSachActionPerformed(evt);
         }
      });

      btnQuanLiDocGia.setFont(new java.awt.Font("Sitka Text", 1, 18)); // NOI18N
      btnQuanLiDocGia.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/block-user.png"))); // NOI18N
      btnQuanLiDocGia.setText("QUAN LI DOC GIA");
      btnQuanLiDocGia.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
      btnQuanLiDocGia.setFocusable(false);
      btnQuanLiDocGia.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
      btnQuanLiDocGia.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
      btnQuanLiDocGia.setIconTextGap(20);
      btnQuanLiDocGia.addActionListener(new java.awt.event.ActionListener() {
         public void actionPerformed(java.awt.event.ActionEvent evt) {
            btnQuanLiDocGiaActionPerformed(evt);
         }
      });

      btnQuanLiMuonTra.setFont(new java.awt.Font("Sitka Text", 1, 18)); // NOI18N
      btnQuanLiMuonTra.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/exchange1.png"))); // NOI18N
      btnQuanLiMuonTra.setText("QUAN LI MUON TRA");
      btnQuanLiMuonTra.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
      btnQuanLiMuonTra.setFocusable(false);
      btnQuanLiMuonTra.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
      btnQuanLiMuonTra.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
      btnQuanLiMuonTra.setIconTextGap(20);
      btnQuanLiMuonTra.addActionListener(new java.awt.event.ActionListener() {
         public void actionPerformed(java.awt.event.ActionEvent evt) {
            btnQuanLiMuonTraActionPerformed(evt);
         }
      });

      btnThongKe.setFont(new java.awt.Font("Sitka Text", 1, 18)); // NOI18N
      btnThongKe.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/bill.png"))); // NOI18N
      btnThongKe.setText("THONG KE");
      btnThongKe.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
      btnThongKe.setFocusable(false);
      btnThongKe.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
      btnThongKe.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
      btnThongKe.setIconTextGap(20);
      btnThongKe.addActionListener(new java.awt.event.ActionListener() {
         public void actionPerformed(java.awt.event.ActionEvent evt) {
            btnThongKeActionPerformed(evt);
         }
      });

      btnTraCuu.setFont(new java.awt.Font("Sitka Text", 1, 18)); // NOI18N
      btnTraCuu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/searching.png"))); // NOI18N
      btnTraCuu.setText("TRA CUU");
      btnTraCuu.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
      btnTraCuu.setFocusable(false);
      btnTraCuu.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
      btnTraCuu.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
      btnTraCuu.setIconTextGap(20);
      btnTraCuu.addActionListener(new java.awt.event.ActionListener() {
         public void actionPerformed(java.awt.event.ActionEvent evt) {
            btnTraCuuActionPerformed(evt);
         }
      });

      javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
      jPanel1.setLayout(jPanel1Layout);
      jPanel1Layout.setHorizontalGroup(
         jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
         .addGroup(jPanel1Layout.createSequentialGroup()
            .addGap(29, 29, 29)
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
               .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                  .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                     .addComponent(btnTraCuu, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                     .addComponent(btnThongKe, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 262, javax.swing.GroupLayout.PREFERRED_SIZE))
                  .addComponent(btnQuanLiSach, javax.swing.GroupLayout.PREFERRED_SIZE, 261, javax.swing.GroupLayout.PREFERRED_SIZE)
                  .addComponent(btnQuanLiDocGia, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 264, javax.swing.GroupLayout.PREFERRED_SIZE))
               .addComponent(btnQuanLiMuonTra, javax.swing.GroupLayout.PREFERRED_SIZE, 264, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addContainerGap(41, Short.MAX_VALUE))
      );
      jPanel1Layout.setVerticalGroup(
         jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
         .addGroup(jPanel1Layout.createSequentialGroup()
            .addGap(35, 35, 35)
            .addComponent(btnQuanLiSach, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGap(36, 36, 36)
            .addComponent(btnQuanLiDocGia, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGap(26, 26, 26)
            .addComponent(btnQuanLiMuonTra, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGap(18, 18, 18)
            .addComponent(btnThongKe, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
            .addComponent(btnTraCuu, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
      );

      jPanel2.setBackground(new java.awt.Color(204, 255, 255));
      jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

      jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
      jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
      jLabel1.setText("QUAN LY THU VIEN");
      jLabel1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

      jLabel2.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
      jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
      jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/reading.png"))); // NOI18N

      jSeparator2.setOrientation(javax.swing.SwingConstants.VERTICAL);

      lbHoTen.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
      lbHoTen.setText("NOUVEN");

      lbMaThuThu.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
      lbMaThuThu.setText("TT001");

      btnLogout.setBackground(new java.awt.Color(51, 153, 255));
      btnLogout.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
      btnLogout.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/logout.png"))); // NOI18N
      btnLogout.addActionListener(new java.awt.event.ActionListener() {
         public void actionPerformed(java.awt.event.ActionEvent evt) {
            btnLogoutActionPerformed(evt);
         }
      });

      javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
      jPanel2.setLayout(jPanel2Layout);
      jPanel2Layout.setHorizontalGroup(
         jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
         .addGroup(jPanel2Layout.createSequentialGroup()
            .addGap(17, 17, 17)
            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGap(18, 18, 18)
            .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 389, Short.MAX_VALUE)
            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 448, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGap(455, 455, 455)
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
               .addComponent(lbHoTen, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
               .addComponent(lbMaThuThu, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGap(48, 48, 48)
            .addComponent(btnLogout, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGap(74, 74, 74))
      );
      jPanel2Layout.setVerticalGroup(
         jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
         .addGroup(jPanel2Layout.createSequentialGroup()
            .addContainerGap()
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
               .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                  .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 84, Short.MAX_VALUE)
                  .addGap(22, 22, 22))
               .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                  .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                  .addContainerGap())
               .addGroup(jPanel2Layout.createSequentialGroup()
                  .addComponent(jSeparator2)
                  .addContainerGap())))
         .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
            .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
               .addComponent(btnLogout, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
               .addGroup(jPanel2Layout.createSequentialGroup()
                  .addComponent(lbMaThuThu, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                  .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                  .addComponent(lbHoTen, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)))
            .addGap(24, 24, 24))
      );

      javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
      getContentPane().setLayout(layout);
      layout.setHorizontalGroup(
         layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
         .addGroup(layout.createSequentialGroup()
            .addContainerGap()
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGap(18, 18, 18)
            .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 2, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGap(18, 18, 18)
            .addComponent(tpnMain)
            .addContainerGap())
         .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
      );
      layout.setVerticalGroup(
         layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
         .addGroup(layout.createSequentialGroup()
            .addContainerGap()
            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
               .addGroup(layout.createSequentialGroup()
                  .addComponent(tpnMain, javax.swing.GroupLayout.DEFAULT_SIZE, 705, Short.MAX_VALUE)
                  .addContainerGap())
               .addComponent(jSeparator3)
               .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
      );

      pack();
   }// </editor-fold>//GEN-END:initComponents

   private void btnQuanLiDocGiaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnQuanLiDocGiaActionPerformed
		tpnMain.removeAll();
		QuanLiDocGiaPn view = new QuanLiDocGiaPn();
		tpnMain.addTab("QUAN LI DOC GIA", view);
		tpnMain.setSelectedComponent(view);
   }//GEN-LAST:event_btnQuanLiDocGiaActionPerformed

   private void btnQuanLiSachActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnQuanLiSachActionPerformed
		tpnMain.removeAll();
		QuanLiSachPn quanLiSachPn = new QuanLiSachPn();
		tpnMain.addTab("QUAN LI SACH", quanLiSachPn);
		tpnMain.setSelectedComponent(quanLiSachPn);
		QuanLiDanhMucPn quanLiDanhMucPn = new QuanLiDanhMucPn();
		tpnMain.addTab("QUAN LI DANH MUC", quanLiDanhMucPn);
//		LoginFrm loginFrm = new LoginFrm();
//		loginFrm.setVisible(true);
      // TODO add your handling code here:
   }//GEN-LAST:event_btnQuanLiSachActionPerformed

   private void btnQuanLiMuonTraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnQuanLiMuonTraActionPerformed
		tpnMain.removeAll();
		QuanLiMuonTraPn quanLiMuonTraPn = new QuanLiMuonTraPn(maThuThu);
		tpnMain.addTab("QUAN LI MUON TRA", quanLiMuonTraPn);
		tpnMain.setSelectedComponent(quanLiMuonTraPn);
   }//GEN-LAST:event_btnQuanLiMuonTraActionPerformed

   private void btnThongKeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThongKeActionPerformed
		tpnMain.removeAll();
		ThongKeDocGiaPn thongKeDocGiaPn = new ThongKeDocGiaPn();
		tpnMain.addTab("THONG KE DOC GIA", thongKeDocGiaPn);
		tpnMain.setSelectedComponent(thongKeDocGiaPn);
		ThongKeSachPn thongKeSachPn = new ThongKeSachPn();
		tpnMain.addTab("THONG KE SACH", thongKeSachPn);
   }//GEN-LAST:event_btnThongKeActionPerformed

   private void btnTraCuuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTraCuuActionPerformed
		tpnMain.removeAll();
		TraCuuDocGiaPn traCuuDocGia = new TraCuuDocGiaPn();
		tpnMain.addTab("TRA CUU DOC GIA", traCuuDocGia);
		tpnMain.setSelectedComponent(traCuuDocGia);
		TraCuuSachPn traCuuSach = new TraCuuSachPn();
		tpnMain.addTab("TRA CUU SACH", traCuuSach);
		TraCuuMuonTraPn traCuuMuonTra = new TraCuuMuonTraPn();
		tpnMain.addTab("TRA CUU MUON TRA", traCuuMuonTra);
   }//GEN-LAST:event_btnTraCuuActionPerformed

   private void btnLogoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLogoutActionPerformed
		this.dispose();
		new LoginFrm().setVisible(true);
   }//GEN-LAST:event_btnLogoutActionPerformed

	/**
	 * @param args the command line arguments
	 */
	public static void main(String args[]) {
		/* Set the Nimbus look and feel */
		//<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
		/* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
		 */
		try {
			for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
				if ("Nimbus".equals(info.getName())) {
					javax.swing.UIManager.setLookAndFeel(info.getClassName());
					break;
				}
			}
		} catch (ClassNotFoundException ex) {
			java.util.logging.Logger.getLogger(mainFrm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		} catch (InstantiationException ex) {
			java.util.logging.Logger.getLogger(mainFrm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		} catch (IllegalAccessException ex) {
			java.util.logging.Logger.getLogger(mainFrm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		} catch (javax.swing.UnsupportedLookAndFeelException ex) {
			java.util.logging.Logger.getLogger(mainFrm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		}
		//</editor-fold>

		/* Create and display the form */
		java.awt.EventQueue.invokeLater(new Runnable() {
			public void run() {
				new mainFrm("haha", "hahah").setVisible(true);
			}
		});
		long miliS = System.currentTimeMillis();
		Date date = new Date(miliS);
		Date dateNd = Date.valueOf("2021-11-25");
		System.out.println(date);
		System.out.println(dateNd);
		int hash = dateNd.hashCode() - date.hashCode();
		System.out.println(hash / (24 * 60 * 60 * 1000));
		System.out.println(date.compareTo(dateNd));
	}

   // Variables declaration - do not modify//GEN-BEGIN:variables
   private javax.swing.JButton btnLogout;
   private javax.swing.JButton btnQuanLiDocGia;
   private javax.swing.JButton btnQuanLiMuonTra;
   private javax.swing.JButton btnQuanLiSach;
   private javax.swing.JButton btnThongKe;
   private javax.swing.JButton btnTraCuu;
   private javax.swing.JFrame jFrame1;
   private javax.swing.JLabel jLabel1;
   private javax.swing.JLabel jLabel2;
   private javax.swing.JPanel jPanel1;
   private javax.swing.JPanel jPanel2;
   private javax.swing.JSeparator jSeparator2;
   private javax.swing.JSeparator jSeparator3;
   private javax.swing.JLabel lbHoTen;
   private javax.swing.JLabel lbMaThuThu;
   private javax.swing.JTabbedPane tpnMain;
   // End of variables declaration//GEN-END:variables
}
