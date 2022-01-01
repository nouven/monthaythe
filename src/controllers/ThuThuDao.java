/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controllers;

import com.mysql.cj.protocol.Resultset;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import models.ThuThu;
/**
 *
 * @author doquy
 */
public class ThuThuDao {
	public boolean  update(ThuThu thuThu){
		try {
			Connection conn = foo.ConnMysql.openConnection();
		String sql = "update tbl_thuthu " + 
				  " set  hoten = ?, email = ?, sdt= ?, username = ?, password = ?"
				  + " where mathuthu = ?";
			PreparedStatement pstm = conn.prepareStatement(sql);
			pstm.setString(1, thuThu.getHoTen());
			pstm.setString(2, thuThu.getEmail());
			pstm.setString(3, thuThu.getSdt());
			pstm.setString(4, thuThu.getUsername());
			pstm.setString(5, thuThu.getPassword());
			pstm.setString(6, thuThu.getMaThuThu());
			pstm.executeUpdate();
			pstm.close();
			conn.close();
			return true;
		} catch (SQLException ex) {
			Logger.getLogger(ThuThuDao.class.getName()).log(Level.SEVERE, null, ex);
		}
		return false;
	}
	public boolean  delete(String id){
		try {
			Connection conn = foo.ConnMysql.openConnection();
			String sql = "delete  from tbl_thuthu where mathuthu = ?";
			PreparedStatement pstm = conn.prepareStatement(sql);
			pstm.setString(1, id);
			if(pstm.executeUpdate() == 1){
				return true;
			}
			pstm.close();
			conn.close();
		} catch (SQLException ex) {
			Logger.getLogger(ThuThuDao.class.getName()).log(Level.SEVERE, null, ex);
		}
		return false;
	}
	public ThuThu findById(String id){
		try {
			Connection conn = foo.ConnMysql.openConnection();
			String sql = "select * from tbl_thuthu where mathuthu = ?";
			PreparedStatement pstm = conn.prepareStatement(sql);
			pstm.setString(1, id);
			ResultSet rs = pstm.executeQuery();
			if(rs.next()){
				String maThuThu = rs.getString("mathuthu");
				String hoTen = rs.getString("hoten");
				String email = rs.getString("email");
				String sdt = rs.getString("sdt");
				String username = rs.getString("username");
				String password = rs.getString("password");
				return  new ThuThu(maThuThu, hoTen, email, sdt, username, password, email);
			}
			pstm.close();
			conn.close();
		} catch (SQLException ex) {
			Logger.getLogger(ThuThuDao.class.getName()).log(Level.SEVERE, null, ex);
		}
		return null;
	}
	public ArrayList<ThuThu> selectAll(){
		ArrayList<ThuThu> list = new ArrayList<>();
		try {
			Connection conn = foo.ConnMysql.openConnection();
			String sql = "select * from tbl_thuthu";
			PreparedStatement pstm = conn.prepareStatement(sql);
			ResultSet rs = pstm.executeQuery();
			while(rs.next()){
				String maThuThu = rs.getString("mathuthu");
				String hoTen = rs.getString("hoten");
				String email = rs.getString("email");
				String sdt = rs.getString("sdt");
				String username = rs.getString("username");
				String password = rs.getString("password");
				ThuThu thuThu = new ThuThu(maThuThu, hoTen, email, sdt, username, password, email);
				list.add(thuThu);
			}
			pstm.close();
			conn.close();
			return list;
		} catch (SQLException ex) {
			Logger.getLogger(ThuThuDao.class.getName()).log(Level.SEVERE, null, ex);
		}
		return null;
	}
	public String showPass(String id){
		try {
			Connection conn = foo.ConnMysql.openConnection();
			String sql = "select password from tbl_thuthu where mathuthu = ?";
			PreparedStatement pstm = conn.prepareStatement(sql);
			pstm.setString(1, id);
			ResultSet rs = pstm.executeQuery();
			if(rs.next()){
				return rs.getString("password");
			}
			pstm.close();
			conn.close();
		} catch (SQLException ex) {
			Logger.getLogger(ThuThuDao.class.getName()).log(Level.SEVERE, null, ex);
		}
		return null;
	}
	public boolean insert(ThuThu thuThu){
		try {
			Connection conn = foo.ConnMysql.openConnection();
			String sql = "insert into tbl_thuthu (mathuthu, hoten, email, sdt, username, password) values(?, ?, ?, ?, ?, ?)";
			PreparedStatement pstm = conn.prepareStatement(sql);
			pstm.setString(1, thuThu.getMaThuThu());
			pstm.setString(2, thuThu.getHoTen());
			pstm.setString(3, thuThu.getEmail());
			pstm.setString(4, thuThu.getSdt());
			pstm.setString(5, thuThu.getUsername());
			pstm.setString(6, thuThu.getPassword());
			pstm.execute();
			pstm.close();
			conn.close();
		} catch (SQLException ex) {
			Logger.getLogger(ThuThuDao.class.getName()).log(Level.SEVERE, null, ex);
		}
		return false;
	}
	public ThuThu login(String username, String password){
		try {
			Connection conn = foo.ConnMysql.openConnection();
			String sql = "select * from tbl_thuthu where username = ? and password = ?";
			PreparedStatement pstm = conn.prepareStatement(sql);
			pstm.setString(1, username);
			pstm.setString(2, password);
			ResultSet rs = pstm.executeQuery();
			if(rs.next()){
				return (new ThuThu(rs.getString("mathuthu"), rs.getString("hoten")));
			}
			pstm.close();
			conn.close();
		} catch (SQLException ex) {
			Logger.getLogger(ThuThuDao.class.getName()).log(Level.SEVERE, null, ex);
		}
		return null;
	}
	public static void main(String[] args) {
		ThuThuDao dao = new ThuThuDao();
		String str = dao.showPass("TT003");
		System.out.println(str);
	}
}
