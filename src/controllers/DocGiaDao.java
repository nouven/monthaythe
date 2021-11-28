/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controllers;

/**
 *
 * @author doquy
 */
import java.sql.*;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.sql.Date;
import java.util.ArrayList;

import models.DocGia;
public class DocGiaDao {
	public boolean insert(DocGia docGia){
		String sql = "insert into tbl_docgia(madocgia, hoten, ngaysinh, gioitinh, sdt, email, diachi)"
				  + " values(?, ?, ?, ?, ?, ?, ?)";
		try {
			Connection conn = foo.ConnMysql.openConnection();
			PreparedStatement pstm = conn.prepareStatement(sql);
			pstm.setString(1, docGia.getMaDocGia());
			pstm.setString(2, docGia.getHoTen());
			pstm.setDate(3, docGia.getNgaySinh());
			pstm.setInt(4, docGia.getGoiTinh());
			pstm.setString(5, docGia.getSdt());
			pstm.setString(6, docGia.getEmail());
			pstm.setString(7, docGia.getDiaChi());
			int x = pstm.executeUpdate();
			System.out.println(x);
			pstm.close();
			conn.close();
			return true;
		} catch (SQLException ex) {
			Logger.getLogger(DocGiaDao.class.getName()).log(Level.SEVERE, null, ex);
		}
		return false;
	}
	public boolean update(DocGia docGia){
		String sql = "update tbl_docgia " + 
				  " set hoten = ?, ngaysinh = ?, gioitinh = ?, sdt= ?, email = ?, diachi = ?"
				  + " where madocgia = ?";
		try {
			Connection conn = foo.ConnMysql.openConnection();
			PreparedStatement pstm = conn.prepareStatement(sql);
			pstm.setString(1, docGia.getHoTen());
			pstm.setDate(2, docGia.getNgaySinh());
			pstm.setInt(3, docGia.getGoiTinh());
			pstm.setString(4, docGia.getSdt());
			pstm.setString(5, docGia.getEmail());
			pstm.setString(6, docGia.getDiaChi());
			pstm.setString(7, docGia.getMaDocGia());
			pstm.executeUpdate();
			pstm.close();
			conn.close();
			return true;
		} catch (SQLException ex) {
			Logger.getLogger(DocGiaDao.class.getName()).log(Level.SEVERE, null, ex);
		}
		return false;
	}
	public boolean delete(String id){
		String sql = "delete from tbl_docgia where madocgia = ?";
		try {
			Connection conn = foo.ConnMysql.openConnection();
			PreparedStatement pstm = conn.prepareStatement(sql);
			pstm.setString(1, id);
			pstm.executeUpdate();
			pstm.close();
			conn.close();
			return true;
		} catch (SQLException ex) {
			Logger.getLogger(DocGiaDao.class.getName()).log(Level.SEVERE, null, ex);
		}
		return false;
	}
	public ArrayList<DocGia> selectAll(){
		String sql = "select * from tbl_docgia";
		ArrayList<DocGia> list = new ArrayList<>();
		try {
			Connection conn = foo.ConnMysql.openConnection();
			PreparedStatement pstm = conn.prepareStatement(sql);
			ResultSet rs = pstm.executeQuery();
			while(rs.next()){
				String maDocGia = rs.getString("madocgia");
				String hoTen = rs.getString("hoten");
				Date ngaySinh = rs.getDate("ngaysinh");
				int gioiTinh = rs.getInt("gioitinh");
				String sdt = rs.getString("sdt");
				String email = rs.getString("email");
				String diaChi = rs.getString("diachi");
				DocGia docGia = new DocGia(maDocGia, hoTen, ngaySinh, gioiTinh, sdt, email, diaChi);
				list.add(docGia);
			}
			pstm.close();
			conn.close();
			return list;
		} catch (SQLException ex) {
			Logger.getLogger(DocGiaDao.class.getName()).log(Level.SEVERE, null, ex);
		}
		return null;
	}
	public DocGia findById(String id){
		String sql = "select * from tbl_docgia where madocgia = ?";
		try {
			Connection conn = foo.ConnMysql.openConnection();
			PreparedStatement pstm = conn.prepareStatement(sql);
			pstm.setString(1, id);
			ResultSet rs = pstm.executeQuery();
			DocGia docGia = null;
			if(rs.next()){
				String maDocGia = rs.getString("madocgia");
				String hoTen = rs.getString("hoten");
				Date ngaySinh = rs.getDate("ngaysinh");
				int gioiTinh = rs.getInt("gioitinh");
				String sdt = rs.getString("sdt");
				String email = rs.getString("email");
				String diaChi = rs.getString("diachi");
				docGia = new DocGia(maDocGia, hoTen, ngaySinh, gioiTinh, sdt, email, diaChi);
			}
			pstm.close();
			conn.close();
			return docGia;
		} catch (SQLException ex) {
			Logger.getLogger(DocGiaDao.class.getName()).log(Level.SEVERE, null, ex);
		}
		return null;
	}
	public static void main(String[] args) {
		DocGiaDao dao = new DocGiaDao();
		long miliS = System.currentTimeMillis();
		Date date = new Date(miliS);
		DocGia docGia = new DocGia("DG002", "Do Quy Nguyen", date, 1, "023423423", "alpha@email.com", "dia chi 2");
		DocGia dg = dao.findById("DG001");
		System.out.println(dg.toString());
	}
}
