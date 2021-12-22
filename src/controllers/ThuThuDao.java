/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controllers;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.logging.Level;
import java.util.logging.Logger;
import models.ThuThu;
/**
 *
 * @author doquy
 */
public class ThuThuDao {
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
		ThuThu thuThu = new ThuThu("TT001", "Do Quy Nguyen", "nouven@gmail.com", "02341234123","nouven", "qwe@123", "");
		System.out.println(dao.login("nouven", "qwe@123").toString());
	}
}
