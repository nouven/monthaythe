/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package foo;

/**
 *
 * @author doquy
 */
import java.awt.Component;
import javax.swing.JOptionPane;
public class MessDialog {
	public static void showMessDialog(Component parent, String title, String content){
		JOptionPane.showMessageDialog(parent, title, content, JOptionPane.INFORMATION_MESSAGE);
	}
	public static void showErrorDialog(Component parent, String title, String content){
		JOptionPane.showMessageDialog(parent, title, content, JOptionPane.ERROR_MESSAGE);
	}
	public static int showComfirmDialog(Component parent, String title, String content){
		return JOptionPane.showConfirmDialog(parent, title, content,
			JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
	}
}
