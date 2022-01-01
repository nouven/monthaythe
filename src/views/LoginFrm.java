/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package views;

import controllers.ThuThuDao;
import foo.MessDialog;
import models.ThuThu;

/**
 *
 * @author doquy
 */
public class LoginFrm extends javax.swing.JFrame {

	/**
	 * Creates new form LoginFrm
	 */
	public LoginFrm() {
		initComponents();
		this.setLocationRelativeTo(null);
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
      jLabel1 = new javax.swing.JLabel();
      btnLogin = new javax.swing.JButton();
      btnLoginWithAd = new javax.swing.JButton();
      pwPassword = new javax.swing.JPasswordField();
      jLabel5 = new javax.swing.JLabel();
      txtUsername = new javax.swing.JTextField();
      jLabel2 = new javax.swing.JLabel();

      setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
      setTitle("LOGIN");
      setBackground(new java.awt.Color(255, 255, 102));

      jSeparator1.setOrientation(javax.swing.SwingConstants.VERTICAL);

      jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
      jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/learning.png"))); // NOI18N

      btnLogin.setFont(new java.awt.Font("Tahoma", 3, 18)); // NOI18N
      btnLogin.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/login.png"))); // NOI18N
      btnLogin.setText("LOG IN");
      btnLogin.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
      btnLogin.setIconTextGap(10);
      btnLogin.addActionListener(new java.awt.event.ActionListener() {
         public void actionPerformed(java.awt.event.ActionEvent evt) {
            btnLoginActionPerformed(evt);
         }
      });

      btnLoginWithAd.setFont(new java.awt.Font("Tahoma", 3, 18)); // NOI18N
      btnLoginWithAd.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/man.png"))); // NOI18N
      btnLoginWithAd.setText("ADMINISTRATOR");
      btnLoginWithAd.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
      btnLoginWithAd.setIconTextGap(10);
      btnLoginWithAd.addActionListener(new java.awt.event.ActionListener() {
         public void actionPerformed(java.awt.event.ActionEvent evt) {
            btnLoginWithAdActionPerformed(evt);
         }
      });

      pwPassword.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
      pwPassword.setText("qwe@123");

      jLabel5.setFont(new java.awt.Font("Tahoma", 3, 18)); // NOI18N
      jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
      jLabel5.setText("PASSWORD:");

      txtUsername.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
      txtUsername.setText("nouven");

      jLabel2.setFont(new java.awt.Font("Tahoma", 3, 18)); // NOI18N
      jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
      jLabel2.setText("USERNAME:");

      javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
      getContentPane().setLayout(layout);
      layout.setHorizontalGroup(
         layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
         .addGroup(layout.createSequentialGroup()
            .addContainerGap()
            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 306, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGap(42, 42, 42)
            .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGap(85, 85, 85)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
               .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
               .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGap(66, 66, 66)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
               .addComponent(txtUsername)
               .addComponent(pwPassword)
               .addComponent(btnLogin, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
               .addComponent(btnLoginWithAd, javax.swing.GroupLayout.DEFAULT_SIZE, 287, Short.MAX_VALUE))
            .addContainerGap(90, Short.MAX_VALUE))
      );
      layout.setVerticalGroup(
         layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
         .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
            .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 306, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
         .addGroup(layout.createSequentialGroup()
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
               .addGroup(layout.createSequentialGroup()
                  .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                  .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 338, javax.swing.GroupLayout.PREFERRED_SIZE))
               .addGroup(layout.createSequentialGroup()
                  .addGap(129, 129, 129)
                  .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                     .addComponent(txtUsername)
                     .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                  .addGap(18, 18, 18)
                  .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                     .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                     .addComponent(pwPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                  .addGap(27, 27, 27)
                  .addComponent(btnLogin)
                  .addGap(38, 38, 38)
                  .addComponent(btnLoginWithAd)
                  .addGap(14, 14, 14)))
            .addContainerGap(57, Short.MAX_VALUE))
      );

      pack();
   }// </editor-fold>//GEN-END:initComponents

   private void btnLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLoginActionPerformed
		String username = txtUsername.getText();
		String password = pwPassword.getText();
		if (username.equals("") || password.equals("")) {
			MessDialog.showErrorDialog(this, "CAC TRUONG KHONG DUOC DE TRONG!!", "ERROR!!");
			return;
		}
		ThuThuDao dao = new ThuThuDao();
		ThuThu thuThu = dao.login(username, password);
		if (thuThu == null) {
			MessDialog.showErrorDialog(this, "TEN DANG NHAP HOAC MAT KHAU KHONG CHINH XAC!!!", "ERROR!!");
			return;
		} else {
			this.dispose();
			new mainFrm(thuThu.getMaThuThu(), thuThu.getHoTen()).setVisible(true);
		}
   }//GEN-LAST:event_btnLoginActionPerformed

   private void btnLoginWithAdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLoginWithAdActionPerformed
		this.dispose();
		new LoginWithAdFrm().setVisible(true);
   }//GEN-LAST:event_btnLoginWithAdActionPerformed

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
			java.util.logging.Logger.getLogger(LoginFrm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		} catch (InstantiationException ex) {
			java.util.logging.Logger.getLogger(LoginFrm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		} catch (IllegalAccessException ex) {
			java.util.logging.Logger.getLogger(LoginFrm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		} catch (javax.swing.UnsupportedLookAndFeelException ex) {
			java.util.logging.Logger.getLogger(LoginFrm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		}
		//</editor-fold>

		/* Create and display the form */
		java.awt.EventQueue.invokeLater(new Runnable() {
			public void run() {
				new LoginFrm().setVisible(true);
			}
		});
	}

   // Variables declaration - do not modify//GEN-BEGIN:variables
   private javax.swing.JButton btnLogin;
   private javax.swing.JButton btnLoginWithAd;
   private javax.swing.JLabel jLabel1;
   private javax.swing.JLabel jLabel2;
   private javax.swing.JLabel jLabel5;
   private javax.swing.JSeparator jSeparator1;
   private javax.swing.JPasswordField pwPassword;
   private javax.swing.JTextField txtUsername;
   // End of variables declaration//GEN-END:variables
}
